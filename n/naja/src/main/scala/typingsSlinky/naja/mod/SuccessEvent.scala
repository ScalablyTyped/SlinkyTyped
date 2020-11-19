package typingsSlinky.naja.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessEvent[T /* <: js.Object */] extends Event {
  
  val options: NajaOptions = js.native
  
  val response: T = js.native
  
  val xhr: XMLHttpRequest = js.native
}
