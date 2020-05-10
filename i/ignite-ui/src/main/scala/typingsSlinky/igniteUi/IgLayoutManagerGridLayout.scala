package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgLayoutManagerGridLayout
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the duration of the animations in the layout manager"s grid layout
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Number of columns in the grid
  	 *
  	 */
  var cols: js.UndefOr[Double] = js.native
  /**
  	 * Accepts number, string with height in px, percents,                        or asterisk (*) which will distribute all the height between all the columns equally.
  	 *                         It can also accept an array, specifying height for each column. If more than one column
  	 *                         has an asterisk value, the remaining height will be equally distributed between these columns.
  	 *                     array The column height can be set as an array of heights.
  	 *
  	 */
  var columnHeight: js.UndefOr[String | Double | js.Array[_]] = js.native
  /**
  	 * Accepts number or string with width in px, percents                        or asterisk (*) which will distribute all the width between all the columns equally.
  	 *                         It can also accept an array, specifying width for each column. If more than one column
  	 *                         has an asterisk value, the remaining width will be equally distributed between these columns.
  	 *                     array The column width can be set as an array of widths.
  	 *
  	 */
  var columnWidth: js.UndefOr[String | Double | js.Array[_]] = js.native
  /**
  	 * Specifies the margin left css property for items
  	 *
  	 */
  var marginLeft: js.UndefOr[Double] = js.native
  /**
  	 * Specifies the margin top css property for items
  	 *
  	 */
  var marginTop: js.UndefOr[Double] = js.native
  /**
  	 * Specifies whether the previous set options should be overriden when setting options
  	 *
  	 */
  var overrideConfigOnSetOption: js.UndefOr[Boolean] = js.native
  /**
  	 * Specified whether the items should rearrange to fit in the container when it is resized.
  	 *                         Have effect only when fixed columnWidth option is set.
  	 *
  	 */
  var rearrangeItems: js.UndefOr[Boolean] = js.native
  /**
  	 * Number of rows in the grid
  	 *
  	 */
  var rows: js.UndefOr[Double] = js.native
}

object IgLayoutManagerGridLayout {
  @scala.inline
  def apply(): IgLayoutManagerGridLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManagerGridLayout]
  }
  @scala.inline
  implicit class IgLayoutManagerGridLayoutOps[Self <: IgLayoutManagerGridLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeight(value: String | Double | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: String | Double | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideConfigOnSetOption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideConfigOnSetOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideConfigOnSetOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideConfigOnSetOption")(js.undefined)
        ret
    }
    @scala.inline
    def withRearrangeItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearrangeItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRearrangeItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearrangeItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

