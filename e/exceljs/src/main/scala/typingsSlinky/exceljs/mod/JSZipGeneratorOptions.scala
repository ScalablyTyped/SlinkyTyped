package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.AnonLevel
import typingsSlinky.exceljs.exceljsStrings.DEFLATE
import typingsSlinky.exceljs.exceljsStrings.STORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipGeneratorOptions extends js.Object {
  /**
  	 * @default DEFLATE
  	 */
  var compression: STORE | DEFLATE
  var compressionOptions: Null | AnonLevel
}

object JSZipGeneratorOptions {
  @scala.inline
  def apply(compression: STORE | DEFLATE, compressionOptions: AnonLevel = null): JSZipGeneratorOptions = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any])
    if (compressionOptions != null) __obj.updateDynamic("compressionOptions")(compressionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipGeneratorOptions]
  }
}

