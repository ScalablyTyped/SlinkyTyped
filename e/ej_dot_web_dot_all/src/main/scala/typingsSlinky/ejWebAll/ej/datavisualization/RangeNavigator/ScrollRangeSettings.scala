package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollRangeSettings extends js.Object {
  /** Specifies the ending range of range navigator scrollbar and that should be greater than the rangenavigator datasource end value.
    * @Default {null}
    */
  var end: js.UndefOr[String] = js.native
  /** Specifies the starting range of range navigator scrollbar and that should be less than the rangenavigator datasource start value.
    * @Default {null}
    */
  var start: js.UndefOr[String] = js.native
}

object ScrollRangeSettings {
  @scala.inline
  def apply(): ScrollRangeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollRangeSettings]
  }
  @scala.inline
  implicit class ScrollRangeSettingsOps[Self <: ScrollRangeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

