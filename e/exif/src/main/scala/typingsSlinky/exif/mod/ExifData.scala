package typingsSlinky.exif.mod

import typingsSlinky.exif.anon.ApertureValue
import typingsSlinky.exif.anon.AutoBracketing
import typingsSlinky.exif.anon.Compression
import typingsSlinky.exif.anon.Copyright
import typingsSlinky.exif.anon.GPSAltitude
import typingsSlinky.exif.anon.InteropIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExifData extends js.Object {
  var exif: ApertureValue = js.native
  var gps: GPSAltitude = js.native
  var image: Copyright = js.native
  var interoperability: InteropIndex = js.native
  var makernote: AutoBracketing = js.native
  var thumbnail: Compression = js.native
}

object ExifData {
  @scala.inline
  def apply(
    exif: ApertureValue,
    gps: GPSAltitude,
    image: Copyright,
    interoperability: InteropIndex,
    makernote: AutoBracketing,
    thumbnail: Compression
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
    def withExif(value: ApertureValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGps(value: GPSAltitude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: Copyright): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteroperability(value: InteropIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interoperability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMakernote(value: AutoBracketing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makernote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: Compression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

