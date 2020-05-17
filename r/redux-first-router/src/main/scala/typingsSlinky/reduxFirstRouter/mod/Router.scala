package typingsSlinky.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router[TState] extends js.Object {
  def getActionForPathAndParams(path: String): Nullable[js.Object] = js.native
  def getPathAndParamsForState(state: TState): typingsSlinky.reduxFirstRouter.anon.Params = js.native
  def getStateForAction(action: js.Object, state: Nullable[TState]): Nullable[TState] = js.native
  def getStateForActionOriginal(action: js.Object, state: Nullable[TState]): Nullable[TState] = js.native
}

object Router {
  @scala.inline
  def apply[TState](
    getActionForPathAndParams: String => Nullable[js.Object],
    getPathAndParamsForState: TState => typingsSlinky.reduxFirstRouter.anon.Params,
    getStateForAction: (js.Object, Nullable[TState]) => Nullable[TState],
    getStateForActionOriginal: (js.Object, Nullable[TState]) => Nullable[TState]
  ): Router[TState] = {
    val __obj = js.Dynamic.literal(getActionForPathAndParams = js.Any.fromFunction1(getActionForPathAndParams), getPathAndParamsForState = js.Any.fromFunction1(getPathAndParamsForState), getStateForAction = js.Any.fromFunction2(getStateForAction), getStateForActionOriginal = js.Any.fromFunction2(getStateForActionOriginal))
    __obj.asInstanceOf[Router[TState]]
  }
  @scala.inline
  implicit class RouterOps[Self[tstate] <: Router[tstate], TState] (val x: Self[TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TState] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TState] with Other]
    @scala.inline
    def withGetActionForPathAndParams(value: String => Nullable[js.Object]): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActionForPathAndParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPathAndParamsForState(value: TState => typingsSlinky.reduxFirstRouter.anon.Params): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPathAndParamsForState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetStateForAction(value: (js.Object, Nullable[TState]) => Nullable[TState]): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStateForAction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetStateForActionOriginal(value: (js.Object, Nullable[TState]) => Nullable[TState]): Self[TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStateForActionOriginal")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

