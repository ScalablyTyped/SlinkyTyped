package typingsSlinky.reactAddToCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddToCalendarProps extends js.Object {
  var buttonClassClosed: js.UndefOr[String] = js.native
  var buttonClassOpen: js.UndefOr[String] = js.native
  var buttonIconClass: js.UndefOr[String] = js.native
  var buttonLabel: js.UndefOr[String] = js.native
  var buttonTemplate: js.UndefOr[js.Any] = js.native
  var buttonWrapperClass: js.UndefOr[String] = js.native
  var displayItemIcons: js.UndefOr[Boolean] = js.native
  var dropdownClass: js.UndefOr[String] = js.native
  var event: AddToCalendarEvent = js.native
  var listItems: js.UndefOr[js.Array[_]] = js.native
  var optionsOpen: js.UndefOr[Boolean] = js.native
  var rootClass: js.UndefOr[String] = js.native
  var useFontAwesomeIcons: js.UndefOr[Boolean] = js.native
}

object AddToCalendarProps {
  @scala.inline
  def apply(event: AddToCalendarEvent): AddToCalendarProps = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToCalendarProps]
  }
  @scala.inline
  implicit class AddToCalendarPropsOps[Self <: AddToCalendarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: AddToCalendarEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonClassClosed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClassClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClassClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClassClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonClassOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClassOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClassOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClassOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonWrapperClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayItemIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItemIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayItemIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayItemIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownClass")(js.undefined)
        ret
    }
    @scala.inline
    def withListItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItems")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withRootClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootClass")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFontAwesomeIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFontAwesomeIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFontAwesomeIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFontAwesomeIcons")(js.undefined)
        ret
    }
  }
  
}

