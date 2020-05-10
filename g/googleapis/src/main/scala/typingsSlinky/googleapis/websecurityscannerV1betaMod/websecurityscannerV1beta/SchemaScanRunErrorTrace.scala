package typingsSlinky.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only. Defines an error trace message for a ScanRun.
  */
@js.native
trait SchemaScanRunErrorTrace extends js.Object {
  /**
    * Output only. Indicates the error reason code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Output only. If the scan encounters TOO_MANY_HTTP_ERRORS, this field
    * indicates the most common HTTP error code, if such is available. For
    * example, if this code is 404, the scan has encountered too many NOT_FOUND
    * responses.
    */
  var mostCommonHttpErrorCode: js.UndefOr[Double] = js.native
  /**
    * Output only. If the scan encounters SCAN_CONFIG_ISSUE error, this field
    * has the error message encountered during scan configuration validation
    * that is performed before each scan run.
    */
  var scanConfigError: js.UndefOr[SchemaScanConfigError] = js.native
}

object SchemaScanRunErrorTrace {
  @scala.inline
  def apply(): SchemaScanRunErrorTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScanRunErrorTrace]
  }
  @scala.inline
  implicit class SchemaScanRunErrorTraceOps[Self <: SchemaScanRunErrorTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withMostCommonHttpErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostCommonHttpErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMostCommonHttpErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostCommonHttpErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withScanConfigError(value: SchemaScanConfigError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanConfigError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScanConfigError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanConfigError")(js.undefined)
        ret
    }
  }
  
}

