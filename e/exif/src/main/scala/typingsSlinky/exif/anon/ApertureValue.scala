package typingsSlinky.exif.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApertureValue extends js.Object {
  var ApertureValue: js.UndefOr[Double] = js.native
  var BrightnessValue: js.UndefOr[Double] = js.native
  var ColorSpace: js.UndefOr[Double] = js.native
  var ComponentsConfiguration: js.UndefOr[Buffer] = js.native
  var CompressedBitsPerPixel: js.UndefOr[Double] = js.native
  var CreateDate: js.UndefOr[String] = js.native
  var DateTimeOriginal: js.UndefOr[String] = js.native
  var ExifImageHeight: js.UndefOr[Double] = js.native
  var ExifImageWidth: js.UndefOr[Double] = js.native
  var ExifVersion: js.UndefOr[Buffer] = js.native
  var ExposureCompensation: js.UndefOr[Double] = js.native
  var ExposureMode: js.UndefOr[Double] = js.native
  var ExposureProgram: js.UndefOr[Double] = js.native
  var ExposureTime: js.UndefOr[Double] = js.native
  var FNumber: js.UndefOr[Double] = js.native
  var FileSource: js.UndefOr[Buffer] = js.native
  var Flash: js.UndefOr[Double] = js.native
  var FlashpixVersion: js.UndefOr[Buffer] = js.native
  var FocalLength: js.UndefOr[Double] = js.native
  var FocalLengthIn35mmFormat: js.UndefOr[Double] = js.native
  var FocalPlaneResolutionUnit: js.UndefOr[Double] = js.native
  var FocalPlaneXResolution: js.UndefOr[Double] = js.native
  var FocalPlaneYResolution: js.UndefOr[Double] = js.native
  var ISO: js.UndefOr[Double] = js.native
  var ImageUniqueID: js.UndefOr[String] = js.native
  var InteropOffset: js.UndefOr[Double] = js.native
  var MakerNote: js.UndefOr[Buffer] = js.native
  var MaxApertureValue: js.UndefOr[Double] = js.native
  var MeteringMode: js.UndefOr[Double] = js.native
  var SceneCaptureType: js.UndefOr[Double] = js.native
  var SceneType: js.UndefOr[Buffer] = js.native
  var SensingMethod: js.UndefOr[Double] = js.native
  var ShutterSpeedValue: js.UndefOr[Double] = js.native
  var UserComment: js.UndefOr[Buffer] = js.native
  var WhiteBalance: js.UndefOr[Double] = js.native
}

object ApertureValue {
  @scala.inline
  def apply(): ApertureValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApertureValue]
  }
  @scala.inline
  implicit class ApertureValueOps[Self <: ApertureValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApertureValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApertureValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApertureValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApertureValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightnessValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrightnessValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightnessValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BrightnessValue")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentsConfiguration(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressedBitsPerPixel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompressedBitsPerPixel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressedBitsPerPixel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompressedBitsPerPixel")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeOriginal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTimeOriginal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeOriginal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTimeOriginal")(js.undefined)
        ret
    }
    @scala.inline
    def withExifImageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExifImageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExifImageHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExifImageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withExifImageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExifImageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExifImageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExifImageWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withExifVersion(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExifVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExifVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExifVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureCompensation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureCompensation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureCompensation")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureMode")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureProgram(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureProgram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureProgram")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposureTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSource(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSource")(js.undefined)
        ret
    }
    @scala.inline
    def withFlash(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flash")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashpixVersion(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlashpixVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashpixVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlashpixVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFocalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocalLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalLength")(js.undefined)
        ret
    }
    @scala.inline
    def withFocalLengthIn35mmFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalLengthIn35mmFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocalLengthIn35mmFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalLengthIn35mmFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFocalPlaneResolutionUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalPlaneResolutionUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocalPlaneResolutionUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalPlaneResolutionUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withFocalPlaneXResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalPlaneXResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocalPlaneXResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalPlaneXResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withFocalPlaneYResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalPlaneYResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocalPlaneYResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocalPlaneYResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withISO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutISO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISO")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUniqueID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUniqueID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUniqueID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUniqueID")(js.undefined)
        ret
    }
    @scala.inline
    def withInteropOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InteropOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteropOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InteropOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withMakerNote(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MakerNote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMakerNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MakerNote")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxApertureValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxApertureValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxApertureValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxApertureValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMeteringMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeteringMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeteringMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeteringMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneCaptureType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SceneCaptureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSceneCaptureType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SceneCaptureType")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneType(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SceneType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSceneType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SceneType")(js.undefined)
        ret
    }
    @scala.inline
    def withSensingMethod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SensingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SensingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withShutterSpeedValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShutterSpeedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutterSpeedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShutterSpeedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withUserComment(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserComment")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhiteBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhiteBalance")(js.undefined)
        ret
    }
  }
  
}

