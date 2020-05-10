package typingsSlinky.jsuite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iconfig extends js.Object {
  var columns: js.UndefOr[String] = js.native
  var end: js.UndefOr[Double] = js.native
  var filterExpression: js.UndefOr[js.Any] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var maxUnitsUsage: js.UndefOr[Double] = js.native
  var recordType: js.UndefOr[String] = js.native
  var searchId: js.UndefOr[String] = js.native
  var smartConvert: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[Double] = js.native
}

object Iconfig {
  @scala.inline
  def apply(): Iconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Iconfig]
  }
  @scala.inline
  implicit class IconfigOps[Self <: Iconfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterExpression(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxUnitsUsage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnitsUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUnitsUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnitsUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordType")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchId")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartConvert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartConvert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartConvert")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

