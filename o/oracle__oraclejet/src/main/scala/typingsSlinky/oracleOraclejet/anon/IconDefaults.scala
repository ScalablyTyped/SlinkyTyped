package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconDefaults extends js.Object {
  var borderColor: String = js.native
  var borderWidth: Double = js.native
  var color: String = js.native
  var iconDefaults: Pattern = js.native
  var indicatorColor: String = js.native
  var indicatorIconDefaults: Pattern = js.native
  var labelStyle: js.Object = js.native
  var secondaryLabelStyle: js.Object = js.native
}

object IconDefaults {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    iconDefaults: Pattern,
    indicatorColor: String,
    indicatorIconDefaults: Pattern,
    labelStyle: js.Object,
    secondaryLabelStyle: js.Object
  ): IconDefaults = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], iconDefaults = iconDefaults.asInstanceOf[js.Any], indicatorColor = indicatorColor.asInstanceOf[js.Any], indicatorIconDefaults = indicatorIconDefaults.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], secondaryLabelStyle = secondaryLabelStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDefaults]
  }
  @scala.inline
  implicit class IconDefaultsOps[Self <: IconDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconDefaults(value: Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorIconDefaults(value: Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorIconDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

