package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpperLabel extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[ColorString] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.label
    */
  var label: js.UndefOr[Ellipsis] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.emphasis.upperLabel
    */
  var upperLabel: js.UndefOr[Ellipsis] = js.native
}

object UpperLabel {
  @scala.inline
  def apply(): UpperLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpperLabel]
  }
  @scala.inline
  implicit class UpperLabelOps[Self <: UpperLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemStyle(value: ColorString): Self = {
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
    def withLabel(value: Ellipsis): Self = {
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
    @scala.inline
    def withUpperLabel(value: Ellipsis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLabel")(js.undefined)
        ret
    }
  }
  
}

