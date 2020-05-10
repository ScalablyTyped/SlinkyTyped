package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarLineScatterCandleBubbleConfig extends js.Object {
  var highlightColor: js.UndefOr[Color] = js.native
}

object BarLineScatterCandleBubbleConfig {
  @scala.inline
  def apply(): BarLineScatterCandleBubbleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarLineScatterCandleBubbleConfig]
  }
  @scala.inline
  implicit class BarLineScatterCandleBubbleConfigOps[Self <: BarLineScatterCandleBubbleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlightColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(js.undefined)
        ret
    }
  }
  
}

