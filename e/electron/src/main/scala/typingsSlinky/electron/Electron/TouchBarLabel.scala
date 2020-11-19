package typingsSlinky.electron.Electron

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarLabel extends EventEmitter {
  
  var accessibilityLabel: String = js.native
  
  var label: String = js.native
  
  var textColor: String = js.native
}
