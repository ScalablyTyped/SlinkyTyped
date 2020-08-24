package typingsSlinky.electron.mod

import typingsSlinky.electron.Electron.TouchBarGroupConstructorOptions
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "TouchBarGroup")
@js.native
class TouchBarGroup protected () extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/touch-bar-group
  /**
    * TouchBarGroup
    */
  def this(options: TouchBarGroupConstructorOptions) = this()
}

