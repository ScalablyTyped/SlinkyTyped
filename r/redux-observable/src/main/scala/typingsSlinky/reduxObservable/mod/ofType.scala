package typingsSlinky.reduxObservable.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-observable", "ofType")
@js.native
object ofType extends js.Object {
  
  def apply[T /* <: Action[_] */, R /* <: T */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: R['type'] */ js.Any */](key: K*): js.Function1[/* source */ Observable_[T], Observable_[R]] = js.native
}
