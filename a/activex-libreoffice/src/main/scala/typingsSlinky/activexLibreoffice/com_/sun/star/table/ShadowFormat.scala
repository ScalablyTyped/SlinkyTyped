package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the settings of a cell shadow. */
@js.native
trait ShadowFormat extends js.Object {
  /** contains the color value of the shadow. */
  var Color: typingsSlinky.activexLibreoffice.com_.sun.star.util.Color = js.native
  /** is `TRUE` , if shadow is transparent. */
  var IsTransparent: Boolean = js.native
  /** contains the location of the shadow. */
  var Location: ShadowLocation = js.native
  /** contains the size of the shadow. */
  var ShadowWidth: Double = js.native
}

object ShadowFormat {
  @scala.inline
  def apply(Color: Color, IsTransparent: Boolean, Location: ShadowLocation, ShadowWidth: Double): ShadowFormat = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], IsTransparent = IsTransparent.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], ShadowWidth = ShadowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
  @scala.inline
  implicit class ShadowFormatOps[Self <: ShadowFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: ShadowLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

