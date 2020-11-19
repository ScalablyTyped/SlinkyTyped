package typingsSlinky.rxjs.mod

import typingsSlinky.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs", "ConnectableObservable")
@js.native
class ConnectableObservable[T] protected ()
  extends typingsSlinky.rxjs.connectableObservableMod.ConnectableObservable[T] {
  def this(source: Observable[T], subjectFactory: js.Function0[typingsSlinky.rxjs.subjectMod.Subject[T]]) = this()
}
