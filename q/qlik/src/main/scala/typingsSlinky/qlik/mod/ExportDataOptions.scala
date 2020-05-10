package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.A
import typingsSlinky.qlik.qlikStrings.CSV_C
import typingsSlinky.qlik.qlikStrings.CSV_T
import typingsSlinky.qlik.qlikStrings.OOXML
import typingsSlinky.qlik.qlikStrings.P
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDataOptions extends js.Object {
  var download: Boolean = js.native
  var filename: js.UndefOr[String] = js.native
  var format: OOXML | CSV_C | CSV_T = js.native
  var state: A | P = js.native
}

object ExportDataOptions {
  @scala.inline
  def apply(download: Boolean, format: OOXML | CSV_C | CSV_T, state: A | P): ExportDataOptions = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDataOptions]
  }
  @scala.inline
  implicit class ExportDataOptionsOps[Self <: ExportDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: OOXML | CSV_C | CSV_T): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: A | P): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

