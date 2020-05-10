package typingsSlinky.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusColor extends js.Object {
  var dark: String = js.native
  var darkActive: String = js.native
  var darkHover: String = js.native
  var darker: String = js.native
  var light: String = js.native
  var lightActive: String = js.native
  var lightHover: String = js.native
  var normal: String = js.native
  var normalActive: String = js.native
  var normalHover: String = js.native
}

object StatusColor {
  @scala.inline
  def apply(
    dark: String,
    darkActive: String,
    darkHover: String,
    darker: String,
    light: String,
    lightActive: String,
    lightHover: String,
    normal: String,
    normalActive: String,
    normalHover: String
  ): StatusColor = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], darkActive = darkActive.asInstanceOf[js.Any], darkHover = darkHover.asInstanceOf[js.Any], darker = darker.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], lightActive = lightActive.asInstanceOf[js.Any], lightHover = lightHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusColor]
  }
  @scala.inline
  implicit class StatusColorOps[Self <: StatusColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDarkActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDarkHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalHover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

