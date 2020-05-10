package typingsSlinky.reduxDuck.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.reduxDuck.AnonType
import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DuckBuilder[AppAction /* <: Action[_] */] extends js.Object {
  def createAction[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */](a: T): ActionCreator[Extract[AppAction, AnonType[T, AppAction]]] = js.native
  def createReducer[S](a: ActionHandlers[S, AppAction], b: S): Reducer[S, AppAction] = js.native
  def defineType(a: ActionName): ActionType = js.native
}

object DuckBuilder {
  @scala.inline
  def apply[AppAction](
    createAction: js.Any => ActionCreator[Extract[AppAction, AnonType[js.Any, AppAction]]],
    createReducer: (ActionHandlers[js.Any, AppAction], js.Any) => Reducer[js.Any, AppAction],
    defineType: ActionName => ActionType
  ): DuckBuilder[AppAction] = {
    val __obj = js.Dynamic.literal(createAction = js.Any.fromFunction1(createAction), createReducer = js.Any.fromFunction2(createReducer), defineType = js.Any.fromFunction1(defineType))
    __obj.asInstanceOf[DuckBuilder[AppAction]]
  }
  @scala.inline
  implicit class DuckBuilderOps[Self[appaction] <: DuckBuilder[appaction], AppAction] (val x: Self[AppAction]) extends AnyVal {
    @scala.inline
    def duplicate: Self[AppAction] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[AppAction]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[AppAction] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[AppAction] with Other]
    @scala.inline
    def withCreateAction(value: js.Any => ActionCreator[Extract[AppAction, AnonType[js.Any, AppAction]]]): Self[AppAction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateReducer(value: (ActionHandlers[js.Any, AppAction], js.Any) => Reducer[js.Any, AppAction]): Self[AppAction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReducer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDefineType(value: ActionName => ActionType): Self[AppAction] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

