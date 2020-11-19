package typingsSlinky.reactOnsenui.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchChangeEvent extends Event {
  
  var isInteractive: Boolean = js.native
  
  var switch: HTMLElement = js.native
  
  var value: Boolean = js.native
}
