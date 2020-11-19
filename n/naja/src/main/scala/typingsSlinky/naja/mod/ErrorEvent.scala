package typingsSlinky.naja.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorEvent[T /* <: js.Object */] extends Event {
  
  val error: js.Error = js.native
  
  val options: NajaOptions = js.native
  
  val response: js.UndefOr[T] = js.native
  
  val xhr: XMLHttpRequest = js.native
}
