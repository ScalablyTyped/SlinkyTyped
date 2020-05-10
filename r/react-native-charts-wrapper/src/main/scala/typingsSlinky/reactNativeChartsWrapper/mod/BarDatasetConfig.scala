package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig {
  var barShadowColor: js.UndefOr[Color] = js.native
  var highlightAlpha: js.UndefOr[Double] = js.native
  var stackLabels: js.UndefOr[js.Array[String]] = js.native
}

object BarDatasetConfig {
  @scala.inline
  def apply(): BarDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarDatasetConfig]
  }
  @scala.inline
  implicit class BarDatasetConfigOps[Self <: BarDatasetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarShadowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barShadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withStackLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackLabels")(js.undefined)
        ret
    }
  }
  
}

