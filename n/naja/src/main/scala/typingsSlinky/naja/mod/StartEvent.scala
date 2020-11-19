package typingsSlinky.naja.mod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartEvent extends Event {
  
  val request: js.Promise[Unit] = js.native
  
  val xhr: XMLHttpRequest = js.native
}
