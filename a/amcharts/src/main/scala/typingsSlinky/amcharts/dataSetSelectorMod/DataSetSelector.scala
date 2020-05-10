package typingsSlinky.amcharts.dataSetSelectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetSelector extends js.Object {
  /**
    * Text displayed in the "compare to" combobox (when position is "top" or "bottom"). Select...
    */
  var comboBoxSelectText: String = js.native
  /**
    * Text displayed near "compare to" list. Compare to:
    */
  var compareText: String = js.native
  /**
    * The maximum height of the Compare to field in pixels.
    * @default 150
    */
  var listHeight: Double = js.native
  /**
    * Possible values: "right", "left", "top", "bottom". "top" and "bottom" positions has a limitation -
    * only one data set can be selected for comparing.
    * @default "left"
    */
  var position: String = js.native
  /**
    * Text displayed near "Select" dropDown. Select:
    */
  var selectText: String = js.native
  /**
    * Width of a Data set selector, when position is "left" or "right".
    * @default 180
    */
  var width: Double = js.native
}

object DataSetSelector {
  @scala.inline
  def apply(
    comboBoxSelectText: String,
    compareText: String,
    listHeight: Double,
    position: String,
    selectText: String,
    width: Double
  ): DataSetSelector = {
    val __obj = js.Dynamic.literal(comboBoxSelectText = comboBoxSelectText.asInstanceOf[js.Any], compareText = compareText.asInstanceOf[js.Any], listHeight = listHeight.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selectText = selectText.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetSelector]
  }
  @scala.inline
  implicit class DataSetSelectorOps[Self <: DataSetSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComboBoxSelectText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comboBoxSelectText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompareText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compareText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

