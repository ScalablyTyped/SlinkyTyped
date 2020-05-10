package typingsSlinky.popperJs.mod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopperOptions extends js.Object {
  var eventsEnabled: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[Modifiers] = js.native
  var onCreate: js.UndefOr[js.Function1[/* data */ Data, Unit]] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* data */ Data, Unit]] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var positionFixed: js.UndefOr[Boolean] = js.native
  var removeOnDestroy: js.UndefOr[Boolean] = js.native
}

object PopperOptions {
  @scala.inline
  def apply(): PopperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopperOptions]
  }
  @scala.inline
  implicit class PopperOptionsOps[Self <: PopperOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: Modifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreate(value: /* data */ Data => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* data */ Data => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOnDestroy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOnDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnDestroy")(js.undefined)
        ret
    }
  }
  
}

