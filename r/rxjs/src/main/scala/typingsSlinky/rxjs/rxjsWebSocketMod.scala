package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.Observer
import typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/webSocket", JSImport.Namespace)
@js.native
object rxjsWebSocketMod extends js.Object {
  
  def webSocket[T](urlConfigOrSource: String): typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
  
  @js.native
  class WebSocketSubject[T] protected ()
    extends typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubject[T] {
    def this(urlConfigOrSource: String) = this()
    def this(urlConfigOrSource: Observable[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
    def this(urlConfigOrSource: String, destination: Observer[T]) = this()
    def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
  }
}
