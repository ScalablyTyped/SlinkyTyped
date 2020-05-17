package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.viz.dxFunnelItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Percent extends js.Object {
  var item: js.UndefOr[dxFunnelItem] = js.native
  var percent: js.UndefOr[Double] = js.native
  var percentText: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
  var valueText: js.UndefOr[String] = js.native
}

object Percent {
  @scala.inline
  def apply(): Percent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Percent]
  }
  @scala.inline
  implicit class PercentOps[Self <: Percent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: dxFunnelItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentText")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueText")(js.undefined)
        ret
    }
  }
  
}

