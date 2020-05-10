package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashSoundItem extends js.Object {
  var bitRate: String = js.native
  var bits: String = js.native
  var compressionType: String = js.native
  var convertStereoToMono: Boolean = js.native
  var fileLastModifiedDate: String = js.native
  var originalCompressionType: String = js.native
  var quality: String = js.native
  var sampleRate: String = js.native
  var sourceFileExists: Boolean = js.native
  def exportToFile(fileURI: String): Boolean = js.native
}

object FlashSoundItem {
  @scala.inline
  def apply(
    bitRate: String,
    bits: String,
    compressionType: String,
    convertStereoToMono: Boolean,
    exportToFile: String => Boolean,
    fileLastModifiedDate: String,
    originalCompressionType: String,
    quality: String,
    sampleRate: String,
    sourceFileExists: Boolean
  ): FlashSoundItem = {
    val __obj = js.Dynamic.literal(bitRate = bitRate.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any], convertStereoToMono = convertStereoToMono.asInstanceOf[js.Any], exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], originalCompressionType = originalCompressionType.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSoundItem]
  }
  @scala.inline
  implicit class FlashSoundItemOps[Self <: FlashSoundItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvertStereoToMono(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertStereoToMono")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportToFile(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFileLastModifiedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalCompressionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalCompressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFileExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileExists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

