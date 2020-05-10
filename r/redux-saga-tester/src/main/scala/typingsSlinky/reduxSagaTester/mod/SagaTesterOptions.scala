package typingsSlinky.reduxSagaTester.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.redux.mod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SagaTesterOptions[StateType] extends js.Object {
  var combineReducers: js.UndefOr[
    js.Function1[/* map */ ReducersMapObject[_, Action[_]], Reducer[StateType, AnyAction]]
  ] = js.native
  var ignoreReduxActions: js.UndefOr[Boolean] = js.native
  var initialState: js.UndefOr[StateType] = js.native
  var middlewares: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var reducers: js.UndefOr[(ReducersMapObject[_, Action[_]]) | (Reducer[StateType, AnyAction])] = js.native
}

object SagaTesterOptions {
  @scala.inline
  def apply[StateType](): SagaTesterOptions[StateType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SagaTesterOptions[StateType]]
  }
  @scala.inline
  implicit class SagaTesterOptionsOps[Self[statetype] <: SagaTesterOptions[statetype], StateType] (val x: Self[StateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[StateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[StateType] with Other]
    @scala.inline
    def withCombineReducers(value: /* map */ ReducersMapObject[_, Action[_]] => Reducer[StateType, AnyAction]): Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineReducers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCombineReducers: Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineReducers")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreReduxActions(value: Boolean): Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreReduxActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreReduxActions: Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreReduxActions")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: StateType): Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddlewares(value: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middlewares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddlewares: Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middlewares")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withReducersFunction2(value: (/* state */ js.UndefOr[StateType], AnyAction) => StateType): Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducers")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReducers(value: (ReducersMapObject[_, Action[_]]) | (Reducer[StateType, AnyAction])): Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReducers: Self[StateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducers")(js.undefined)
        ret
    }
  }
  
}

