package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackStyle extends js.Object {
  var backgroundColor: String = js.native
  var customData: js.Object = js.native
  var edgeColor: String = js.native
  var edgeType: TextTrackEdgeType = js.native
  var fontFamily: String = js.native
  var fontGenericFamily: TextTrackFontGenericFamily = js.native
  var fontScale: Double = js.native
  var fontStyle: TextTrackFontStyle = js.native
  var foregroundColor: String = js.native
  var windowColor: String = js.native
  var windowRoundedCornerRadius: Double = js.native
  var windowType: TextTrackWindowType = js.native
}

object TextTrackStyle {
  @scala.inline
  def apply(
    backgroundColor: String,
    customData: js.Object,
    edgeColor: String,
    edgeType: TextTrackEdgeType,
    fontFamily: String,
    fontGenericFamily: TextTrackFontGenericFamily,
    fontScale: Double,
    fontStyle: TextTrackFontStyle,
    foregroundColor: String,
    windowColor: String,
    windowRoundedCornerRadius: Double,
    windowType: TextTrackWindowType
  ): TextTrackStyle = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], edgeColor = edgeColor.asInstanceOf[js.Any], edgeType = edgeType.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontGenericFamily = fontGenericFamily.asInstanceOf[js.Any], fontScale = fontScale.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], windowColor = windowColor.asInstanceOf[js.Any], windowRoundedCornerRadius = windowRoundedCornerRadius.asInstanceOf[js.Any], windowType = windowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackStyle]
  }
  @scala.inline
  implicit class TextTrackStyleOps[Self <: TextTrackStyle] (val x: Self) extends AnyVal {
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
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeType(value: TextTrackEdgeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontGenericFamily(value: TextTrackFontGenericFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontGenericFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontStyle(value: TextTrackFontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForegroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowRoundedCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowRoundedCornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowType(value: TextTrackWindowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

