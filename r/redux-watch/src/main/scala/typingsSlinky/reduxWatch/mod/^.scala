package typingsSlinky.reduxWatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-watch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @param getState Function, that returns the Redux store state.
    * @param pathToField Most commonly dot separated string, or array of strings
    *      and numbers that form path to a field of the state object. For details
    *      refer @link https://github.com/mariocasciaro/object-path
    * @param compare Optional field comparison function. Defaults to strict
    *      equality check (===).
    * @returns Function, that listens to changes of the given field of the Redux store
    *      state. On change it calls its parameter, which is a change handler function.
    */
  def apply(getState: js.Function0[_]): ChangeHandlerWrapper[_] = js.native
  def apply(getState: js.Function0[_], pathToField: FieldPath): ChangeHandlerWrapper[_] = js.native
  def apply(
    getState: js.Function0[_],
    pathToField: FieldPath,
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  ): ChangeHandlerWrapper[_] = js.native
}

