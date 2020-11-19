package typingsSlinky.naja.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteEvent[T /* <: js.Object */] extends Event {
  
  val error: js.UndefOr[js.Error] = js.native
  
  val options: NajaOptions = js.native
  
  val response: js.UndefOr[T] = js.native
  
  val xhr: XMLHttpRequest = js.native
}
