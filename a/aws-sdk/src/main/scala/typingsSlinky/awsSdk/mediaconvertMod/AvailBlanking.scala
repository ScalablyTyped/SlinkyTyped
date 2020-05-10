package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailBlanking extends js.Object {
  /**
    * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
    */
  var AvailBlankingImage: js.UndefOr[stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG] = js.native
}

object AvailBlanking {
  @scala.inline
  def apply(): AvailBlanking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailBlanking]
  }
  @scala.inline
  implicit class AvailBlankingOps[Self <: AvailBlanking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailBlankingImage(value: stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailBlankingImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailBlankingImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailBlankingImage")(js.undefined)
        ret
    }
  }
  
}

