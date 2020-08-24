package typingsSlinky.rxjs.rxMod

import typingsSlinky.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "AnonymousSubject")
@js.native
class AnonymousSubject[T] ()
  extends typingsSlinky.rxjs.subjectMod.AnonymousSubject[T] {
  def this(destination: Observer[T]) = this()
  def this(
    destination: js.UndefOr[scala.Nothing],
    source: typingsSlinky.rxjs.internalObservableMod.Observable[T]
  ) = this()
  def this(destination: Observer[T], source: typingsSlinky.rxjs.internalObservableMod.Observable[T]) = this()
}

