package typingsSlinky.backstopjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormat extends js.Object {
  var format: js.UndefOr[String] = js.native
  var testReportFileName: js.UndefOr[String] = js.native
  var testSuiteName: js.UndefOr[String] = js.native
}

object AnonFormat {
  @scala.inline
  def apply(): AnonFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFormat]
  }
  @scala.inline
  implicit class AnonFormatOps[Self <: AnonFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withTestReportFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testReportFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestReportFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testReportFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withTestSuiteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuiteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSuiteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuiteName")(js.undefined)
        ret
    }
  }
  
}

