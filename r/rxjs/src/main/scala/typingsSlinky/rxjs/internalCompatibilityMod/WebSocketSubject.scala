package typingsSlinky.rxjs.internalCompatibilityMod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.Observer
import typingsSlinky.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "WebSocketSubject")
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
