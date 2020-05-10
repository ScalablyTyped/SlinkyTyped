package typingsSlinky.exif.mod

import typingsSlinky.exif.AnonApertureValue
import typingsSlinky.exif.AnonAutoBracketing
import typingsSlinky.exif.AnonCompression
import typingsSlinky.exif.AnonCopyright
import typingsSlinky.exif.AnonGPSAltitude
import typingsSlinky.exif.AnonInteropIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExifData extends js.Object {
  var exif: AnonApertureValue = js.native
  var gps: AnonGPSAltitude = js.native
  var image: AnonCopyright = js.native
  var interoperability: AnonInteropIndex = js.native
  var makernote: AnonAutoBracketing = js.native
  var thumbnail: AnonCompression = js.native
}

object ExifData {
  @scala.inline
  def apply(
    exif: AnonApertureValue,
    gps: AnonGPSAltitude,
    image: AnonCopyright,
    interoperability: AnonInteropIndex,
    makernote: AnonAutoBracketing,
    thumbnail: AnonCompression
  ): ExifData = {
    val __obj = js.Dynamic.literal(exif = exif.asInstanceOf[js.Any], gps = gps.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], interoperability = interoperability.asInstanceOf[js.Any], makernote = makernote.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExifData]
  }
  @scala.inline
  implicit class ExifDataOps[Self <: ExifData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExif(value: AnonApertureValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGps(value: AnonGPSAltitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: AnonCopyright): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteroperability(value: AnonInteropIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interoperability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMakernote(value: AnonAutoBracketing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makernote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: AnonCompression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

