package typingsSlinky.projectOxford

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccentColor extends js.Object {
  var accentColor: String = js.native
  var dominantColorBackground: String = js.native
  var dominantColorForeground: String = js.native
  var dominantColors: js.Array[String] = js.native
  var isBWImg: Boolean = js.native
}

object AnonAccentColor {
  @scala.inline
  def apply(
    accentColor: String,
    dominantColorBackground: String,
    dominantColorForeground: String,
    dominantColors: js.Array[String],
    isBWImg: Boolean
  ): AnonAccentColor = {
    val __obj = js.Dynamic.literal(accentColor = accentColor.asInstanceOf[js.Any], dominantColorBackground = dominantColorBackground.asInstanceOf[js.Any], dominantColorForeground = dominantColorForeground.asInstanceOf[js.Any], dominantColors = dominantColors.asInstanceOf[js.Any], isBWImg = isBWImg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccentColor]
  }
  @scala.inline
  implicit class AnonAccentColorOps[Self <: AnonAccentColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDominantColorBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantColorBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDominantColorForeground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantColorForeground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDominantColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dominantColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBWImg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBWImg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

