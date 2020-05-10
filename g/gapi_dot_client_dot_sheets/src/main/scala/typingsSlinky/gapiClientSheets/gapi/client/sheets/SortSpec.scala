package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortSpec extends js.Object {
  /**
    * The background fill color to sort by; cells with this fill color are sorted
    * to the top. Mutually exclusive with foreground_color.
    */
  var backgroundColor: js.UndefOr[Color] = js.native
  /**
    * The background fill color to sort by; cells with this fill color are sorted
    * to the top. Mutually exclusive with foreground_color, and must be an
    * RGB-type color. If background_color is also set, this field takes
    * precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  /** The dimension the sort should be applied to. */
  var dimensionIndex: js.UndefOr[Double] = js.native
  /**
    * The foreground color to sort by; cells with this foreground color are
    * sorted to the top. Mutually exclusive with background_color.
    */
  var foregroundColor: js.UndefOr[Color] = js.native
  /**
    * The foreground color to sort by; cells with this foreground color are
    * sorted to the top. Mutually exclusive with background_color, and must
    * be an RGB-type color. If foreground_color is also set, this field takes
    * precedence.
    */
  var foregroundColorStyle: js.UndefOr[ColorStyle] = js.native
  /** The order data should be sorted. */
  var sortOrder: js.UndefOr[String] = js.native
}

object SortSpec {
  @scala.inline
  def apply(): SortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortSpec]
  }
  @scala.inline
  implicit class SortSpecOps[Self <: SortSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForegroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withForegroundColorStyle(value: ColorStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForegroundColorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
  }
  
}

