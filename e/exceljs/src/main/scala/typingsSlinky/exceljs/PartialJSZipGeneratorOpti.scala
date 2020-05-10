package typingsSlinky.exceljs

import typingsSlinky.exceljs.exceljsStrings.DEFLATE
import typingsSlinky.exceljs.exceljsStrings.STORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.JSZipGeneratorOptions> */
@js.native
trait PartialJSZipGeneratorOpti extends js.Object {
  var compression: js.UndefOr[STORE | DEFLATE] = js.native
  var compressionOptions: js.UndefOr[AnonLevel] = js.native
}

object PartialJSZipGeneratorOpti {
  @scala.inline
  def apply(): PartialJSZipGeneratorOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJSZipGeneratorOpti]
  }
  @scala.inline
  implicit class PartialJSZipGeneratorOptiOps[Self <: PartialJSZipGeneratorOpti] (val x: Self) extends AnyVal {
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
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionOptions(value: AnonLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionOptions")(js.undefined)
        ret
    }
  }
  
}

