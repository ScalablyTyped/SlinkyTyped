package typingsSlinky.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmphasisItemStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.emphasis
    */
  var emphasis: js.UndefOr[AnonLabelAnonBorderRadius] = js.native
  /**
    * The style of the leaf node in the tree.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderType] = js.native
  /**
    * Describes the style of the text label corresponding to the
    * leaf node.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-tree.leaves.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.native
}

object AnonEmphasisItemStyle {
  @scala.inline
  def apply(): AnonEmphasisItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEmphasisItemStyle]
  }
  @scala.inline
  implicit class AnonEmphasisItemStyleOps[Self <: AnonEmphasisItemStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmphasis(value: AnonLabelAnonBorderRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: AnonBorderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnonBorderRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

