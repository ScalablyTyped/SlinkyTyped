package typingsSlinky.rxjs.internalDashCompatibilityMod

import typingsSlinky.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "webSocket")
@js.native
object webSocket extends js.Object {
  def apply[T](urlConfigOrSource: String): typingsSlinky.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = js.native
  def apply[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typingsSlinky.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = js.native
}

