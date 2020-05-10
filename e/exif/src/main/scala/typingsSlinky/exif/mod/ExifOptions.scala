package typingsSlinky.exif.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExifOptions extends js.Object {
  var agfaMaxEntries: js.UndefOr[Double] = js.native
  var epsonMaxEntries: js.UndefOr[Double] = js.native
  /** node-exif corrects the thumbnail offset in order to have an offset from the start of the buffer/file. */
  var fixThumbnailOffset: js.UndefOr[Boolean] = js.native
  var fujifilmMaxEntries: js.UndefOr[Double] = js.native
  var ifd0MaxEntries: js.UndefOr[Double] = js.native
  var ifd1MaxEntries: js.UndefOr[Double] = js.native
  /**
    * The image to get Exif data from can be either a filesystem path or a Buffer.
    *
    * If `image` is not specified, the developer must call `loadImage()` to parse the image.
    */
  var image: js.UndefOr[String | Buffer] = js.native
  /** Specifies the maximum entries to be parsed */
  var maxEntries: js.UndefOr[Double] = js.native
  var maxGpsEntries: js.UndefOr[Double] = js.native
  var maxInteroperabilityEntries: js.UndefOr[Double] = js.native
  var noPadding: js.UndefOr[Boolean] = js.native
  var olympusMaxEntries: js.UndefOr[Double] = js.native
  var panasonicMaxEntries: js.UndefOr[Double] = js.native
  var sanyoMaxEntries: js.UndefOr[Double] = js.native
  /** An object named "offsets" is added to exifData and contains lot of offsets needed to get thumbnail and other things. */
  var tiffOffsets: js.UndefOr[Double] = js.native
}

object ExifOptions {
  @scala.inline
  def apply(): ExifOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExifOptions]
  }
  @scala.inline
  implicit class ExifOptionsOps[Self <: ExifOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgfaMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agfaMaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgfaMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agfaMaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withEpsonMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epsonMaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpsonMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epsonMaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withFixThumbnailOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixThumbnailOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixThumbnailOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixThumbnailOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withFujifilmMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fujifilmMaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFujifilmMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fujifilmMaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withIfd0MaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifd0MaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfd0MaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifd0MaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withIfd1MaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifd1MaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfd1MaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifd1MaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxGpsEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGpsEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxGpsEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGpsEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInteroperabilityEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInteroperabilityEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInteroperabilityEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInteroperabilityEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withOlympusMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olympusMaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOlympusMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olympusMaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withPanasonicMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panasonicMaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanasonicMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panasonicMaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withSanyoMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanyoMaxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSanyoMaxEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanyoMaxEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withTiffOffsets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiffOffsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiffOffsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiffOffsets")(js.undefined)
        ret
    }
  }
  
}

