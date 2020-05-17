package typingsSlinky.exceljs.anon

import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.WorkbookStreamWriterOptions> */
@js.native
trait PartialWorkbookStreamWrit extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var stream: js.UndefOr[Stream] = js.native
  var useSharedStrings: js.UndefOr[Boolean] = js.native
  var useStyles: js.UndefOr[Boolean] = js.native
  var zip: js.UndefOr[PartialArchiverZipOptions] = js.native
}

object PartialWorkbookStreamWrit {
  @scala.inline
  def apply(): PartialWorkbookStreamWrit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWorkbookStreamWrit]
  }
  @scala.inline
  implicit class PartialWorkbookStreamWritOps[Self <: PartialWorkbookStreamWrit] (val x: Self) extends AnyVal {
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
    def withZip(value: PartialArchiverZipOptions): Self = {
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

