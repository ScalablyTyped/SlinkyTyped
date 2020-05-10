package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionOptions extends js.Object {
  var backgroundColor: String = js.native
  var backgroundOpacity: Double = js.native
  var color: String = js.native
  var edgeStyle: String = js.native
  var fontFamily: String = js.native
  var fontOpacity: Double = js.native
  var fontSize: Double = js.native
  var windowColor: String = js.native
  var windowOpacity: Double = js.native
}

object CaptionOptions {
  @scala.inline
  def apply(
    backgroundColor: String,
    backgroundOpacity: Double,
    color: String,
    edgeStyle: String,
    fontFamily: String,
    fontOpacity: Double,
    fontSize: Double,
    windowColor: String,
    windowOpacity: Double
  ): CaptionOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundOpacity = backgroundOpacity.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], edgeStyle = edgeStyle.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontOpacity = fontOpacity.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], windowColor = windowColor.asInstanceOf[js.Any], windowOpacity = windowOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionOptions]
  }
  @scala.inline
  implicit class CaptionOptionsOps[Self <: CaptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowOpacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

