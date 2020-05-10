package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedFormat extends js.Object {
  var columnDelimiter: js.UndefOr[String] = js.native
  var fileEncoding: js.UndefOr[String] = js.native
  var quotingMode: js.UndefOr[String] = js.native
}

object DatafeedFormat {
  @scala.inline
  def apply(): DatafeedFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedFormat]
  }
  @scala.inline
  implicit class DatafeedFormatOps[Self <: DatafeedFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withFileEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotingMode")(js.undefined)
        ret
    }
  }
  
}

