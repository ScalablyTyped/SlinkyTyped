package typingsSlinky.reactReduxEpic.mod

import typingsSlinky.reduxObservable.mod.Epic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-redux-epic", "wrapRootEpic")
@js.native
object wrapRootEpic extends js.Object {
  
  def apply[T /* <: Action */, S, D, O /* <: T */](epic: Epic[T, S, D, O]): Epic[T, S, D, O] = js.native
}
