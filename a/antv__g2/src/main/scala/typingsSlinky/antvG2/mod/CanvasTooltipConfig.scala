package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Booleans.`false`
import typingsSlinky.antvG2.antvG2Strings.default
import typingsSlinky.antvG2.mod.Styles.background
import typingsSlinky.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasTooltipConfig
  extends CommonTooltipConfig
     with TooltipConfig {
  var boardStyle: js.UndefOr[background] = js.native
  var itemGap: js.UndefOr[Double] = js.native
  var nameStyle: js.UndefOr[text] = js.native
  var titleStyle: js.UndefOr[text] = js.native
  @JSName("type")
  var type_CanvasTooltipConfig: js.UndefOr[default] = js.native
  @JSName("useHtml")
  var useHtml_CanvasTooltipConfig: `false` = js.native
  var valueStyle: js.UndefOr[text] = js.native
}

object CanvasTooltipConfig {
  @scala.inline
  def apply(useHtml: `false`): CanvasTooltipConfig = {
    val __obj = js.Dynamic.literal(useHtml = useHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTooltipConfig]
  }
  @scala.inline
  implicit class CanvasTooltipConfigOps[Self <: CanvasTooltipConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseHtml(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoardStyle(value: background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boardStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoardStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boardStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withItemGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGap")(js.undefined)
        ret
    }
    @scala.inline
    def withNameStyle(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyle(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValueStyle(value: text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueStyle")(js.undefined)
        ret
    }
  }
  
}

