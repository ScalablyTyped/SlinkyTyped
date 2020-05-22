package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.Level
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
  var compressionOptions: Null | Level
}

object JSZipGeneratorOptions {
  @scala.inline
  def apply(compression: STORE | DEFLATE, compressionOptions: Level = null): JSZipGeneratorOptions = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], compressionOptions = compressionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipGeneratorOptions]
  }
}

