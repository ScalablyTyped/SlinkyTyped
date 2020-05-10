package typingsSlinky.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelGlowSettings extends js.Object {
  /** The glow color, default is `black`. */
  var color: String = js.native
  /** Whether the glow effect will be filled, default is `false`. */
  var fill: Boolean = js.native
  /** Horizontal offset, default is `0`. */
  var offsetx: Double = js.native
  /** Vertical offset, default is `0`. */
  var offsety: Double = js.native
  /** Opacity of the glow effect, default is `0.5`. */
  var opacity: Double = js.native
  /** size of the glow, default is `10`. */
  var width: Double = js.native
}

object RaphaelGlowSettings {
  @scala.inline
  def apply(color: String, fill: Boolean, offsetx: Double, offsety: Double, opacity: Double, width: Double): RaphaelGlowSettings = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], offsetx = offsetx.asInstanceOf[js.Any], offsety = offsety.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelGlowSettings]
  }
  @scala.inline
  implicit class RaphaelGlowSettingsOps[Self <: RaphaelGlowSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsety(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsety")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

