package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportOptionArguments extends js.Object {
  var apiVersion: js.UndefOr[String] = js.native
  var includeZeroImpressions: js.UndefOr[Boolean] = js.native
  var resolveGeoNames: js.UndefOr[Boolean] = js.native
  var returnMoneyInMicros: js.UndefOr[Boolean] = js.native
}

object ReportOptionArguments {
  @scala.inline
  def apply(): ReportOptionArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOptionArguments]
  }
  @scala.inline
  implicit class ReportOptionArgumentsOps[Self <: ReportOptionArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeZeroImpressions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeZeroImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeZeroImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeZeroImpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveGeoNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveGeoNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveGeoNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveGeoNames")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnMoneyInMicros(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnMoneyInMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnMoneyInMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnMoneyInMicros")(js.undefined)
        ret
    }
  }
  
}

