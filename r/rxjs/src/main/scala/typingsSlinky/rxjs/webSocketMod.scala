package typingsSlinky.rxjs

import typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject
import typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/dom/webSocket", JSImport.Namespace)
@js.native
object webSocketMod extends js.Object {
  
  def webSocket[T](urlConfigOrSource: String): WebSocketSubject[T] = js.native
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): WebSocketSubject[T] = js.native
}
