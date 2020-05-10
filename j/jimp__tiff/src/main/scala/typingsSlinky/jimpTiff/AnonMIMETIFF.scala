package typingsSlinky.jimpTiff

import typingsSlinky.jimpTiff.jimpTiffStrings.imageSlashtiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMIMETIFF extends js.Object {
  var MIME_TIFF: imageSlashtiff = js.native
}

object AnonMIMETIFF {
  @scala.inline
  def apply(MIME_TIFF: imageSlashtiff): AnonMIMETIFF = {
    val __obj = js.Dynamic.literal(MIME_TIFF = MIME_TIFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMIMETIFF]
  }
  @scala.inline
  implicit class AnonMIMETIFFOps[Self <: AnonMIMETIFF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMIME_TIFF(value: imageSlashtiff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIME_TIFF")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

