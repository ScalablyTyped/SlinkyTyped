package typingsSlinky.rxjs

import typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject
import typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSocketMod {
  
  @JSImport("rxjs/internal/observable/dom/webSocket", "webSocket")
  @js.native
  def webSocket[T](urlConfigOrSource: String): WebSocketSubject[T] = js.native
  @JSImport("rxjs/internal/observable/dom/webSocket", "webSocket")
  @js.native
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): WebSocketSubject[T] = js.native
}
