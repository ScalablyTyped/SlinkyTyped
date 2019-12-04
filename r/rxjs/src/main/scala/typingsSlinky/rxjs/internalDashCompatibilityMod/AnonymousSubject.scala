package typingsSlinky.rxjs.internalDashCompatibilityMod

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AnonymousSubject")
@js.native
class AnonymousSubject[T] ()
  extends typingsSlinky.rxjs.internalSubjectMod.AnonymousSubject[T] {
  def this(destination: Observer[T]) = this()
  def this(destination: Observer[T], source: Observable[T]) = this()
}

