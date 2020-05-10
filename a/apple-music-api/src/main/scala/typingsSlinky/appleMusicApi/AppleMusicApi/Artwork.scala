package typingsSlinky.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artwork
@js.native
trait Artwork extends js.Object {
  var bgColor: js.UndefOr[String] = js.native
  var height: Double = js.native
  var textColor1: js.UndefOr[String] = js.native
  var textColor2: js.UndefOr[String] = js.native
  var textColor3: js.UndefOr[String] = js.native
  var textColor4: js.UndefOr[String] = js.native
  var url: String = js.native
  var width: Double = js.native
}

object Artwork {
  @scala.inline
  def apply(height: Double, url: String, width: Double): Artwork = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artwork]
  }
  @scala.inline
  implicit class ArtworkOps[Self <: Artwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor1")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor2")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor3")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor4")(js.undefined)
        ret
    }
  }
  
}

