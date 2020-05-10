package typingsSlinky.gm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageInfo extends js.Object {
  var `Background Color`: String = js.native
  var `Border Color`: String = js.native
  var `Channel Depths`: ChannelInfo[String] = js.native
  var `Channel Statistics`: ChannelInfo[ColorStatistics] = js.native
  var Class: String = js.native
  var Compose: String = js.native
  var Compression: String = js.native
  var Depth: String = js.native
  var Dispose: String = js.native
  var Filesize: String = js.native
  var Format: String = js.native
  var Geometry: String = js.native
  var Interlace: String = js.native
  var Iterations: String = js.native
  var `JPEG-Colorspace`: js.UndefOr[String] = js.native
  var `JPEG-Colorspace-Name`: js.UndefOr[String] = js.native
  var `JPEG-Quality`: js.UndefOr[String] = js.native
  var `JPEG-Sampling-factors`: js.UndefOr[String] = js.native
  var `Matte Color`: String = js.native
  var Orientation: String = js.native
  var `Page geometry`: String = js.native
  var `Profile-EXIF`: js.UndefOr[StringDictionary[String]] = js.native
  var `Profile-XMP`: js.UndefOr[String] = js.native
  var `Profile-color`: js.UndefOr[String] = js.native
  var `Profile-iptc`: js.UndefOr[StringDictionary[String]] = js.native
  var Resolution: js.UndefOr[String] = js.native
  var Signature: String = js.native
  var Software: String = js.native
  var Tainted: String = js.native
  var Type: String = js.native
  var color: Double = js.native
  var depth: Double = js.native
  var format: String = js.native
  var path: String = js.native
  var size: Dimensions = js.native
}

object ImageInfo {
  @scala.inline
  def apply(
    `Background Color`: String,
    `Border Color`: String,
    `Channel Depths`: ChannelInfo[String],
    `Channel Statistics`: ChannelInfo[ColorStatistics],
    Class: String,
    Compose: String,
    Compression: String,
    Depth: String,
    Dispose: String,
    Filesize: String,
    Format: String,
    Geometry: String,
    Interlace: String,
    Iterations: String,
    `Matte Color`: String,
    Orientation: String,
    `Page geometry`: String,
    Signature: String,
    Software: String,
    Tainted: String,
    Type: String,
    color: Double,
    depth: Double,
    format: String,
    path: String,
    size: Dimensions
  ): ImageInfo = {
    val __obj = js.Dynamic.literal(Class = Class.asInstanceOf[js.Any], Compose = Compose.asInstanceOf[js.Any], Compression = Compression.asInstanceOf[js.Any], Depth = Depth.asInstanceOf[js.Any], Dispose = Dispose.asInstanceOf[js.Any], Filesize = Filesize.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Geometry = Geometry.asInstanceOf[js.Any], Interlace = Interlace.asInstanceOf[js.Any], Iterations = Iterations.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], Software = Software.asInstanceOf[js.Any], Tainted = Tainted.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("Background Color")((`Background Color`).asInstanceOf[js.Any])
    __obj.updateDynamic("Border Color")((`Border Color`).asInstanceOf[js.Any])
    __obj.updateDynamic("Channel Depths")((`Channel Depths`).asInstanceOf[js.Any])
    __obj.updateDynamic("Channel Statistics")((`Channel Statistics`).asInstanceOf[js.Any])
    __obj.updateDynamic("Matte Color")((`Matte Color`).asInstanceOf[js.Any])
    __obj.updateDynamic("Page geometry")((`Page geometry`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  @scala.inline
  implicit class ImageInfoOps[Self <: ImageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBackground Color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Background Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBorder Color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withChannel Depths`(value: ChannelInfo[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channel Depths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withChannel Statistics`(value: ChannelInfo[ColorStatistics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channel Statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dispose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterlace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interlace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMatte Color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Matte Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage geometry`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftware(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Software")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTainted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tainted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withJPEG-Colorspace`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPEG-Colorspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJPEG-Colorspace`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPEG-Colorspace")(js.undefined)
        ret
    }
    @scala.inline
    def `withJPEG-Colorspace-Name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPEG-Colorspace-Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJPEG-Colorspace-Name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPEG-Colorspace-Name")(js.undefined)
        ret
    }
    @scala.inline
    def `withJPEG-Quality`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPEG-Quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJPEG-Quality`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPEG-Quality")(js.undefined)
        ret
    }
    @scala.inline
    def `withJPEG-Sampling-factors`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPEG-Sampling-factors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJPEG-Sampling-factors`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JPEG-Sampling-factors")(js.undefined)
        ret
    }
    @scala.inline
    def `withProfile-EXIF`(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile-EXIF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProfile-EXIF`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile-EXIF")(js.undefined)
        ret
    }
    @scala.inline
    def `withProfile-XMP`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile-XMP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProfile-XMP`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile-XMP")(js.undefined)
        ret
    }
    @scala.inline
    def `withProfile-color`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProfile-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withProfile-iptc`(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile-iptc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProfile-iptc`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Profile-iptc")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolution")(js.undefined)
        ret
    }
  }
  
}

