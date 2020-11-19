package typingsSlinky.reduxObservable.mod

import typingsSlinky.rxjs.mod.Observable_
import typingsSlinky.rxjs.mod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-observable", "StateObservable")
@js.native
class StateObservable[S] protected () extends Observable_[S] {
  def this(stateSubject: Subject[S], initialState: S) = this()
  
  @JSName("source")
  var source_StateObservable: Subject[S] = js.native
  
  var value: S = js.native
}
