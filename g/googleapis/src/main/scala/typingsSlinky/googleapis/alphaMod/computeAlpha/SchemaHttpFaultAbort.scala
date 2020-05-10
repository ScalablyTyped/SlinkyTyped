package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification for how requests are aborted as part of fault injection.
  */
@js.native
trait SchemaHttpFaultAbort extends js.Object {
  /**
    * The HTTP status code used to abort the request. The value must be between
    * 200 and 599 inclusive.
    */
  var httpStatus: js.UndefOr[Double] = js.native
  /**
    * The percentage of traffic (connections/operations/requests) which will be
    * aborted as part of fault injection. The value must be between 0.0 and
    * 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double] = js.native
}

object SchemaHttpFaultAbort {
  @scala.inline
  def apply(): SchemaHttpFaultAbort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpFaultAbort]
  }
  @scala.inline
  implicit class SchemaHttpFaultAbortOps[Self <: SchemaHttpFaultAbort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage")(js.undefined)
        ret
    }
  }
  
}

