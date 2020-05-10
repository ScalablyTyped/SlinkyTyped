package typingsSlinky.reachTooltip.mod

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerParams extends js.Object {
  var `aria-describedby`: String = js.native
  var `data-reach-tooltip-trigger`: String = js.native
  var onBlur: ReactEventHandler[Element] = js.native
  var onFocus: ReactEventHandler[Element] = js.native
  var onKeyDown: ReactEventHandler[Element] = js.native
  var onMouseDown: ReactEventHandler[Element] = js.native
  var onMouseEnter: ReactEventHandler[Element] = js.native
  var onMouseLeave: ReactEventHandler[Element] = js.native
  var onMouseMove: ReactEventHandler[Element] = js.native
  var ref: Ref[_] = js.native
}

object TriggerParams {
  @scala.inline
  def apply(
    `aria-describedby`: String,
    `data-reach-tooltip-trigger`: String,
    onBlur: SyntheticEvent[Event_, Element] => Unit,
    onFocus: SyntheticEvent[Event_, Element] => Unit,
    onKeyDown: SyntheticEvent[Event_, Element] => Unit,
    onMouseDown: SyntheticEvent[Event_, Element] => Unit,
    onMouseEnter: SyntheticEvent[Event_, Element] => Unit,
    onMouseLeave: SyntheticEvent[Event_, Element] => Unit,
    onMouseMove: SyntheticEvent[Event_, Element] => Unit
  ): TriggerParams = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove))
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerParams]
  }
  @scala.inline
  implicit class TriggerParamsOps[Self <: TriggerParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-describedby`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-describedby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withData-reach-tooltip-trigger`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-reach-tooltip-trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBlur(value: SyntheticEvent[Event_, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: SyntheticEvent[Event_, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnKeyDown(value: SyntheticEvent[Event_, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseDown(value: SyntheticEvent[Event_, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: SyntheticEvent[Event_, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: SyntheticEvent[Event_, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMouseMove(value: SyntheticEvent[Event_, Element] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: Ref[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
  }
  
}

