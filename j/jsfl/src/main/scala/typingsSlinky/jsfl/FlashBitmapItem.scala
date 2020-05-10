package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashBitmapItem extends js.Object {
  var allowSmoothing: Boolean = js.native
  var compressionType: String = js.native
  var fileLastModifiedDate: String = js.native
  var originalCompressionType: String = js.native
  var sourceFileExists: Boolean = js.native
  var sourceFileIsCurrent: Boolean = js.native
  var sourceFilePath: String = js.native
  var useDeblocking: Boolean = js.native
  var useImportedJPEGQuality: Boolean = js.native
  def exportToFile(fileURI: String): Boolean = js.native
}

object FlashBitmapItem {
  @scala.inline
  def apply(
    allowSmoothing: Boolean,
    compressionType: String,
    exportToFile: String => Boolean,
    fileLastModifiedDate: String,
    originalCompressionType: String,
    sourceFileExists: Boolean,
    sourceFileIsCurrent: Boolean,
    sourceFilePath: String,
    useDeblocking: Boolean,
    useImportedJPEGQuality: Boolean
  ): FlashBitmapItem = {
    val __obj = js.Dynamic.literal(allowSmoothing = allowSmoothing.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any], exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], originalCompressionType = originalCompressionType.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any], sourceFileIsCurrent = sourceFileIsCurrent.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], useDeblocking = useDeblocking.asInstanceOf[js.Any], useImportedJPEGQuality = useImportedJPEGQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmapItem]
  }
  @scala.inline
  implicit class FlashBitmapItemOps[Self <: FlashBitmapItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSmoothing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSmoothing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionType")(value.asInstanceOf[js.Any])
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
    def withSourceFileExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFileIsCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFileIsCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseDeblocking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDeblocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseImportedJPEGQuality(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useImportedJPEGQuality")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

