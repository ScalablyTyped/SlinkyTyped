package typingsSlinky.exceljs.anon

import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.XlsxWriteOptions> */
@js.native
trait PartialXlsxWriteOptions extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var stream: js.UndefOr[Stream] = js.native
  var useSharedStrings: js.UndefOr[Boolean] = js.native
  var useStyles: js.UndefOr[Boolean] = js.native
  var zip: js.UndefOr[PartialJSZipGeneratorOpti] = js.native
}

object PartialXlsxWriteOptions {
  @scala.inline
  def apply(): PartialXlsxWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialXlsxWriteOptions]
  }
  @scala.inline
  implicit class PartialXlsxWriteOptionsOps[Self <: PartialXlsxWriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Stream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSharedStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSharedStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSharedStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSharedStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withZip(value: PartialJSZipGeneratorOpti): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(js.undefined)
        ret
    }
  }
  
}

