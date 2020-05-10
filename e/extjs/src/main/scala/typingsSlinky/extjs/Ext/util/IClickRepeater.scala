package typingsSlinky.extjs.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClickRepeater extends IObservable {
  /** [Config Option] (Boolean) */
  var accelerate: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var delay: js.UndefOr[Double] = js.native
  /** [Method] Disables the repeater and stops events from firing
  		* @param force Object
  		*/
  var disable: js.UndefOr[js.Function1[/* force */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var el: js.UndefOr[js.Any] = js.native
  /** [Method] Enables the repeater and allows events to fire  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.native
  /** [Method] Convenience function for setting disabled enabled by boolean
  		* @param disabled Boolean
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var stopDefault: js.UndefOr[Boolean] = js.native
}

object IClickRepeater {
  @scala.inline
  def apply(): IClickRepeater = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClickRepeater]
  }
  @scala.inline
  implicit class IClickRepeaterOps[Self <: IClickRepeater] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerate")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: /* force */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withPressedCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStopDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDefault")(js.undefined)
        ret
    }
  }
  
}

