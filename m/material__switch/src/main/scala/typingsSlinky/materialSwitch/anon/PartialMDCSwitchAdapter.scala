package typingsSlinky.materialSwitch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/switch.@material/switch/adapter.MDCSwitchAdapter> */
@js.native
trait PartialMDCSwitchAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setNativeControlChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.native
}

object PartialMDCSwitchAdapter {
  @scala.inline
  def apply(): PartialMDCSwitchAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCSwitchAdapter]
  }
  @scala.inline
  implicit class PartialMDCSwitchAdapterOps[Self <: PartialMDCSwitchAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClass(value: /* className */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClass(value: /* className */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNativeControlChecked(value: /* checked */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNativeControlChecked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNativeControlChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNativeControlChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNativeControlDisabled(value: /* disabled */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNativeControlDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNativeControlDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNativeControlDisabled")(js.undefined)
        ret
    }
  }
  
}

