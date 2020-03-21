package typingsSlinky.rxjs.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends typingsSlinky.rxjs.connectableObservableMod.ConnectableObservable[T] {
  def this(
    source: typingsSlinky.rxjs.internalObservableMod.Observable[T],
    subjectFactory: js.Function0[typingsSlinky.rxjs.subjectMod.Subject[T]]
  ) = this()
}

