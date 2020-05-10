package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpaqueColor extends js.Object {
  /** An opaque RGB color. */
  var rgbColor: js.UndefOr[RgbColor] = js.native
  /** An opaque theme color. */
  var themeColor: js.UndefOr[String] = js.native
}

object OpaqueColor {
  @scala.inline
  def apply(): OpaqueColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpaqueColor]
  }
  @scala.inline
  implicit class OpaqueColorOps[Self <: OpaqueColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRgbColor(value: RgbColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRgbColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgbColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeColor")(js.undefined)
        ret
    }
  }
  
}

