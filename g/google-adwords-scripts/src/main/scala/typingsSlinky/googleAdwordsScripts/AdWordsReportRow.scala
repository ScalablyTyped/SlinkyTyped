package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdWordsReportRow extends js.Object {
  def formatForUpload(): js.Object = js.native
}

object AdWordsReportRow {
  @scala.inline
  def apply(formatForUpload: () => js.Object): AdWordsReportRow = {
    val __obj = js.Dynamic.literal(formatForUpload = js.Any.fromFunction0(formatForUpload))
    __obj.asInstanceOf[AdWordsReportRow]
  }
  @scala.inline
  implicit class AdWordsReportRowOps[Self <: AdWordsReportRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatForUpload(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatForUpload")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

