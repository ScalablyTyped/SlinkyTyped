package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.checkboxClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesCheckboxClickEventObject extends js.Object {
  /**
    * Whether the box has been checked.
    */
  var checked: Boolean = js.native
  /**
    * Related series.
    */
  var item: Series = js.native
  /**
    * Related series.
    */
  var target: Series = js.native
  /**
    * Event type.
    */
  var `type`: checkboxClick = js.native
}

object SeriesCheckboxClickEventObject {
  @scala.inline
  def apply(checked: Boolean, item: Series, target: Series, `type`: checkboxClick): SeriesCheckboxClickEventObject = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesCheckboxClickEventObject]
  }
  @scala.inline
  implicit class SeriesCheckboxClickEventObjectOps[Self <: SeriesCheckboxClickEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Series): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Series): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: checkboxClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

