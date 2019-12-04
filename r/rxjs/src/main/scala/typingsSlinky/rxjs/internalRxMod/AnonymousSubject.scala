package typingsSlinky.rxjs.internalRxMod

import typingsSlinky.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "AnonymousSubject")
@js.native
class AnonymousSubject[T] ()
  extends typingsSlinky.rxjs.internalSubjectMod.AnonymousSubject[T] {
  def this(destination: Observer[T]) = this()
  def this(destination: Observer[T], source: typingsSlinky.rxjs.internalObservableMod.Observable[T]) = this()
}

