package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIcon extends js.Object {
  var icon: AnonBorderRadius = js.native
  var labelStyle: js.Object = js.native
  var showDisclosure: off | on = js.native
}

object AnonIcon {
  @scala.inline
  def apply(icon: AnonBorderRadius, labelStyle: js.Object, showDisclosure: off | on): AnonIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
  @scala.inline
  implicit class AnonIconOps[Self <: AnonIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: AnonBorderRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDisclosure(value: off | on): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDisclosure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

