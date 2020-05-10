package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleSheetsOptions extends js.Object {
  var range: js.UndefOr[String] = js.native
  var skipLeadingRows: js.UndefOr[String] = js.native
}

object GoogleSheetsOptions {
  @scala.inline
  def apply(): GoogleSheetsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSheetsOptions]
  }
  @scala.inline
  implicit class GoogleSheetsOptionsOps[Self <: GoogleSheetsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipLeadingRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLeadingRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipLeadingRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipLeadingRows")(js.undefined)
        ret
    }
  }
  
}

