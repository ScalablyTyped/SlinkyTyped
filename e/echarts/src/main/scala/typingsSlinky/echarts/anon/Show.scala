package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Show extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
  /**
    * Whether to show the visual guide line in emphasis
    * status.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data.labelLine.emphasis.show
    */
  var show: js.UndefOr[Boolean] = js.native
}

object Show {
  @scala.inline
  def apply(): Show = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Show]
  }
  @scala.inline
  implicit class ShowOps[Self <: Show] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineStyle(value: ShadowBlur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

