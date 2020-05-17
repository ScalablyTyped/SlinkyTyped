package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.ElementEvent
import typingsSlinky.devextreme.devextremeStrings.back
import typingsSlinky.devextreme.devextremeStrings.danger
import typingsSlinky.devextreme.devextremeStrings.default_
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxActionSheetItem extends CollectionWidgetItem {
  /** Specifies the icon to be displayed on the action sheet button. */
  var icon: js.UndefOr[String] = js.native
  /** A handler for the click event raised for the button representing the given action sheet button. */
  var onClick: js.UndefOr[(js.Function1[/* e */ ElementEvent, _]) | String] = js.native
  /** Specifies the type of the button that represents an action sheet item. */
  var `type`: js.UndefOr[back | danger | default_ | normal | success] = js.native
}

object dxActionSheetItem {
  @scala.inline
  def apply(): dxActionSheetItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxActionSheetItem]
  }
  @scala.inline
  implicit class dxActionSheetItemOps[Self <: dxActionSheetItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickFunction1(value: /* e */ ElementEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClick(value: (js.Function1[/* e */ ElementEvent, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: back | danger | default_ | normal | success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

