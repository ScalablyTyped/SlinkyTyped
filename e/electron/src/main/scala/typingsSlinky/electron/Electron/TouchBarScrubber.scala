package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.background
import typingsSlinky.electron.electronStrings.fixed
import typingsSlinky.electron.electronStrings.free
import typingsSlinky.electron.electronStrings.none
import typingsSlinky.electron.electronStrings.outline
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarScrubber extends EventEmitter {
  
  var continuous: Boolean = js.native
  
  var items: js.Array[ScrubberItem] = js.native
  
  var mode: fixed | free = js.native
  
  var overlayStyle: background | outline | none = js.native
  
  var selectedStyle: background | outline | none = js.native
  
  var showArrowButtons: Boolean = js.native
}
