package typingsSlinky.materialSwitch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/switch.@material/switch/adapter.MDCSwitchAdapter> */
trait PartialMDCSwitchAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var setNativeControlChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.undefined
}

object PartialMDCSwitchAdapter {
  @scala.inline
  def apply(
    addClass: /* className */ String => Unit = null,
    removeClass: /* className */ String => Unit = null,
    setNativeControlChecked: /* checked */ Boolean => Unit = null,
    setNativeControlDisabled: /* disabled */ Boolean => Unit = null
  ): PartialMDCSwitchAdapter = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1(addClass))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1(removeClass))
    if (setNativeControlChecked != null) __obj.updateDynamic("setNativeControlChecked")(js.Any.fromFunction1(setNativeControlChecked))
    if (setNativeControlDisabled != null) __obj.updateDynamic("setNativeControlDisabled")(js.Any.fromFunction1(setNativeControlDisabled))
    __obj.asInstanceOf[PartialMDCSwitchAdapter]
  }
}

