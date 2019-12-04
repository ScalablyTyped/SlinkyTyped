package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/webSocket", JSImport.Namespace)
@js.native
object webSocketMod extends js.Object {
  @js.native
  class WebSocketSubject[T] protected ()
    extends typingsSlinky.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject[T] {
    def this(urlConfigOrSource: String) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
    def this(urlConfigOrSource: Observable[T]) = this()
    def this(urlConfigOrSource: String, destination: Observer[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
    def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
  }
  
  def webSocket[T](urlConfigOrSource: String): typingsSlinky.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = js.native
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typingsSlinky.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = js.native
}

