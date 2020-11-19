package typingsSlinky.rxjs.internalCompatibilityMod

import typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "webSocket")
@js.native
object webSocket extends js.Object {
  
  def apply[T](urlConfigOrSource: String): typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
  def apply[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
}
