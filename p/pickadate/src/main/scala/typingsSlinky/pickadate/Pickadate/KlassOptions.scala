package typingsSlinky.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// KlassOptions shared between date and time pickers
@js.native
trait KlassOptions extends js.Object {
   // default 'picker__input'
  var active: js.UndefOr[String] = js.native
   // default 'picker__wrap'
  var box: js.UndefOr[String] = js.native
   // default 'picker__day--today' or 'picker__list-item--now'
  // Clear button
  var buttonClear: js.UndefOr[String] = js.native
   // default 'picker__box'
  // Day/Time states
  var disabled: js.UndefOr[String] = js.native
   // default 'picker--opened'
  var focused: js.UndefOr[String] = js.native
   // default 'picker__holder'
  // The picker frame, wrapper, and box
  var frame: js.UndefOr[String] = js.native
  // default 'picker__day--selected' or 'picker__list-item--selected'
  var highlighted: js.UndefOr[String] = js.native
   // default 'picker--focused'
  // The picker holder
  var holder: js.UndefOr[String] = js.native
  // The element states
  var input: js.UndefOr[String] = js.native
  // default 'picker__day--highlighted' or 'picker__list-item--highlighted'
  var now: js.UndefOr[String] = js.native
   // default 'picker' or 'picker picker--time'
  var opened: js.UndefOr[String] = js.native
   // default 'picker__input--active'
  // The root picker and states
  var picker: js.UndefOr[String] = js.native
   // default 'picker__day--disabled' or 'picker__list-item--disabled'
  var selected: js.UndefOr[String] = js.native
   // default 'picker__frame'
  var wrap: js.UndefOr[String] = js.native
}

object KlassOptions {
  @scala.inline
  def apply(): KlassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KlassOptions]
  }
  @scala.inline
  implicit class KlassOptionsOps[Self <: KlassOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonClear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClear")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFocused(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withFrame(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlighted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(js.undefined)
        ret
    }
    @scala.inline
    def withHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holder")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withNow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.undefined)
        ret
    }
    @scala.inline
    def withOpened(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.undefined)
        ret
    }
    @scala.inline
    def withPicker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("picker")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

