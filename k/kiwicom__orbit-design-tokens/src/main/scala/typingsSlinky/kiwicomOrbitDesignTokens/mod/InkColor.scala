package typingsSlinky.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InkColor extends js.Object {
  var light: String = js.native
  var lightActive: String = js.native
  var lightHover: String = js.native
  var lighter: String = js.native
  var lighterActive: String = js.native
  var lighterHover: String = js.native
  var normal: String = js.native
  var normalActive: String = js.native
  var normalHover: String = js.native
}

object InkColor {
  @scala.inline
  def apply(
    light: String,
    lightActive: String,
    lightHover: String,
    lighter: String,
    lighterActive: String,
    lighterHover: String,
    normal: String,
    normalActive: String,
    normalHover: String
  ): InkColor = {
    val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any], lightActive = lightActive.asInstanceOf[js.Any], lightHover = lightHover.asInstanceOf[js.Any], lighter = lighter.asInstanceOf[js.Any], lighterActive = lighterActive.asInstanceOf[js.Any], lighterHover = lighterHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkColor]
  }
  @scala.inline
  implicit class InkColorOps[Self <: InkColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLighter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLighterActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighterActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLighterHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighterHover")(value.asInstanceOf[js.Any])
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

