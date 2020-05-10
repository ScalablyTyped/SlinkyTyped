package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.AnonLevel
import typingsSlinky.exceljs.exceljsStrings.DEFLATE
import typingsSlinky.exceljs.exceljsStrings.STORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSZipGeneratorOptions extends js.Object {
  /**
  	 * @default DEFLATE
  	 */
  var compression: STORE | DEFLATE = js.native
  var compressionOptions: Null | AnonLevel = js.native
}

object JSZipGeneratorOptions {
  @scala.inline
  def apply(compression: STORE | DEFLATE): JSZipGeneratorOptions = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipGeneratorOptions]
  }
  @scala.inline
  implicit class JSZipGeneratorOptionsOps[Self <: JSZipGeneratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompression(value: STORE | DEFLATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressionOptions(value: AnonLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressionOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(null)
        ret
    }
  }
  
}

