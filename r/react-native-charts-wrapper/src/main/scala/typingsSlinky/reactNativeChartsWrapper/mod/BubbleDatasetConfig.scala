package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BubbleDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig {
  var highlightCircleWidth: js.UndefOr[Double] = js.native
}

object BubbleDatasetConfig {
  @scala.inline
  def apply(): BubbleDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleDatasetConfig]
  }
  @scala.inline
  implicit class BubbleDatasetConfigOps[Self <: BubbleDatasetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlightCircleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCircleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCircleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCircleWidth")(js.undefined)
        ret
    }
  }
  
}

