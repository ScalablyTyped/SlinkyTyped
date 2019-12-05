package typingsSlinky.reduxDashObservable.reduxDashObservableMod

import typingsSlinky.rxjs.rxjsMod.Observable
import typingsSlinky.rxjs.rxjsMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-observable", "StateObservable")
@js.native
class StateObservable[S] protected () extends Observable[S] {
  def this(stateSubject: Subject[S], initialState: S) = this()
  @JSName("source")
  var source_StateObservable: Subject[S] = js.native
  var value: S = js.native
}

