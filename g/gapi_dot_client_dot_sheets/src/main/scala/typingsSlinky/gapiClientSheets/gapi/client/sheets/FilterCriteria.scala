package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterCriteria extends js.Object {
  /**
    * A condition that must be true for values to be shown.
    * (This does not override hidden_values -- if a value is listed there,
    * it will still be hidden.)
    */
  var condition: js.UndefOr[BooleanCondition] = js.native
  /** Values that should be hidden. */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * The background fill color to filter by; only cells with this fill color are
    * shown. Mutually exclusive with visible_foreground_color.
    */
  var visibleBackgroundColor: js.UndefOr[Color] = js.native
  /**
    * The background fill color to filter by; only cells with this fill color are
    * shown. This field is mutually exclusive with visible_foreground_color,
    * and must be set to an RGB-type color. If visible_background_color is
    * also set, this field takes precedence.
    */
  var visibleBackgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The foreground color to filter by; only cells with this foreground color
    * are shown. Mutually exclusive with visible_background_color.
    */
  var visibleForegroundColor: js.UndefOr[Color] = js.native
  /**
    * The foreground color to filter by; only cells with this foreground color
    * are shown. This field is mutually exclusive with
    * visible_background_color, and must be set to an RGB-type color. If
    * visible_foreground_color is also set, this field takes precedence.
    */
  var visibleForegroundColorStyle: js.UndefOr[ColorStyle] = js.native
}

object FilterCriteria {
  @scala.inline
  def apply(): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriteria]
  }
  @scala.inline
  implicit class FilterCriteriaOps[Self <: FilterCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: BooleanCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenValues")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleBackgroundColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleBackgroundColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleBackgroundColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleBackgroundColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleForegroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleForegroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleForegroundColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleForegroundColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleForegroundColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleForegroundColorStyle")(js.undefined)
        ret
    }
  }
  
}

