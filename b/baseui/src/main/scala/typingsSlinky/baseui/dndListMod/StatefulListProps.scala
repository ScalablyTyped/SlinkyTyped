package typingsSlinky.baseui.dndListMod

import typingsSlinky.baseui.AnonNewIndex
import typingsSlinky.baseui.baseuiStrings.change_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulListProps extends js.Object {
  var initialState: js.UndefOr[State] = js.native
  var onChange: js.UndefOr[js.Function1[/* params */ AnonNewIndex, _]] = js.native
  var overrides: js.UndefOr[ListOverrides] = js.native
  var removable: js.UndefOr[Boolean] = js.native
  var removableByMove: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulListProps {
  @scala.inline
  def apply(): StatefulListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulListProps]
  }
  @scala.inline
  implicit class StatefulListPropsOps[Self <: StatefulListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* params */ AnonNewIndex => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: ListOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removable")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovableByMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovableByMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(js.undefined)
        ret
    }
    @scala.inline
    def withStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStateReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(js.undefined)
        ret
    }
  }
  
}

