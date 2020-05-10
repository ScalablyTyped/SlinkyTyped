package typingsSlinky.reduxUi.mod

import typingsSlinky.reduxUi.AnonPure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uiParams[UIStateShape] extends js.Object {
  // optional key which is used to determine the UI path in which state will
  // be stored. if omitted this is randomly generated.
  var key: js.UndefOr[String] = js.native
  // optional mergeProps passed to react-redux' @connect
  var mergeProps: js.UndefOr[
    js.Function3[/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any, _]
  ] = js.native
  // optional `options` passed to react-redux @connect
  var options: js.UndefOr[AnonPure] = js.native
  // optional persist, defaults to false. if set to true persist will keep UI
  // state for this component after it unmounts. if set to false the UI state
  // will be deleted and recreated when the component remounts
  var persist: js.UndefOr[Boolean] = js.native
  // customReducer: you can handle the UI state for this component's scope
  // by dispatching actions
  var reducer: js.UndefOr[js.Function2[/* state */ js.Any, /* action */ js.Any, _]] = js.native
  // **required**: UI state for the component
  var state: UIStateShape = js.native
}

object uiParams {
  @scala.inline
  def apply[UIStateShape](state: UIStateShape): uiParams[UIStateShape] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[uiParams[UIStateShape]]
  }
  @scala.inline
  implicit class uiParamsOps[Self[uistateshape] <: uiParams[uistateshape], UIStateShape] (val x: Self[UIStateShape]) extends AnyVal {
    @scala.inline
    def duplicate: Self[UIStateShape] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[UIStateShape]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[UIStateShape] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[UIStateShape] with Other]
    @scala.inline
    def withState(value: UIStateShape): Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeProps(value: (/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any) => _): Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeProps")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMergeProps: Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonPure): Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withReducer(value: (/* state */ js.Any, /* action */ js.Any) => _): Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReducer: Self[UIStateShape] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducer")(js.undefined)
        ret
    }
  }
  
}

