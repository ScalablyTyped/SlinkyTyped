package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSwitchOptions extends EditorOptions[dxSwitch] {
  /** The value to be assigned to the `name` attribute of the underlying HTML element. */
  var name: js.UndefOr[String] = js.native
  /** @deprecated Use the switchedOffText option instead. */
  /** Text displayed when the widget is in a disabled state. */
  var offText: js.UndefOr[String] = js.native
  /** @deprecated Use the switchedOnText option instead. */
  /** Text displayed when the widget is in an enabled state. */
  var onText: js.UndefOr[String] = js.native
  /** Specifies the text displayed when the widget is switched off. */
  var switchedOffText: js.UndefOr[String] = js.native
  /** Specifies the text displayed when the widget is switched on. */
  var switchedOnText: js.UndefOr[String] = js.native
  /** A Boolean value specifying whether the current switch state is "On" or "Off". */
  @JSName("value")
  var value_dxSwitchOptions: js.UndefOr[Boolean] = js.native
}

object dxSwitchOptions {
  @scala.inline
  def apply(): dxSwitchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSwitchOptions]
  }
  @scala.inline
  implicit class dxSwitchOptionsOps[Self <: dxSwitchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOffText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onText")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchedOffText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchedOffText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchedOffText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchedOffText")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchedOnText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchedOnText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitchedOnText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchedOnText")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

