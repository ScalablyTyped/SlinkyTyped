package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Strings.mini
import typingsSlinky.antvG2.mod.Styles.background
import typingsSlinky.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiniTooltipConfig
  extends CommonTooltipConfig
     with TooltipConfig {
  var boardStyle: js.UndefOr[background] = js.native
  var triangleHeight: js.UndefOr[Double] = js.native
  var triangleWidth: js.UndefOr[Double] = js.native
  @JSName("type")
  var type_MiniTooltipConfig: mini = js.native
  var valueStyle: js.UndefOr[text] = js.native
}

object MiniTooltipConfig {
  @scala.inline
  def apply(`type`: mini): MiniTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniTooltipConfig]
  }
  @scala.inline
  implicit class MiniTooltipConfigOps[Self <: MiniTooltipConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: mini): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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
    def withTriangleHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangleHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTriangleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleWidth")(js.undefined)
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

