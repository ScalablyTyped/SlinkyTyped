package typingsSlinky.ejWebAll.ej.DropDownTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupSettings extends js.Object {
  /** Defines the height of the popup wrapper in the DropDownTree control.
    */
  var height: js.UndefOr[String | Double] = js.native
  /** The DropDownTree control is displayed with the popup.
    */
  var showPopupOnLoad: js.UndefOr[Boolean] = js.native
  /** Defines the width of the popup wrapper in the DropDownTree control.
    */
  var width: js.UndefOr[String | Double] = js.native
}

object PopupSettings {
  @scala.inline
  def apply(): PopupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupSettings]
  }
  @scala.inline
  implicit class PopupSettingsOps[Self <: PopupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPopupOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopupOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

