package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelHue extends js.Object {
  var labelHue: js.UndefOr[String] = js.native
  var labelOpacity: js.UndefOr[String] = js.native
  var labelSatLum: js.UndefOr[String] = js.native
  var labelThumbDesc: js.UndefOr[String] = js.native
}

object AnonLabelHue {
  @scala.inline
  def apply(): AnonLabelHue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLabelHue]
  }
  @scala.inline
  implicit class AnonLabelHueOps[Self <: AnonLabelHue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelHue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHue")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOpacity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSatLum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSatLum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSatLum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSatLum")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelThumbDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelThumbDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelThumbDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelThumbDesc")(js.undefined)
        ret
    }
  }
  
}

