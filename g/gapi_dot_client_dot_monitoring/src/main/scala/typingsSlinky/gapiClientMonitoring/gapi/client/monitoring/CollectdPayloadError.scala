package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectdPayloadError extends js.Object {
  /** Records the error status for the payload. If this field is present, the partial errors for nested values won't be populated. */
  var error: js.UndefOr[Status] = js.native
  /** The zero-based index in CreateCollectdTimeSeriesRequest.collectd_payloads. */
  var index: js.UndefOr[Double] = js.native
  /**
    * Records the error status for values that were not written due to an error.Failed payloads for which nothing is written will not include partial value
    * errors.
    */
  var valueErrors: js.UndefOr[js.Array[CollectdValueError]] = js.native
}

object CollectdPayloadError {
  @scala.inline
  def apply(): CollectdPayloadError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectdPayloadError]
  }
  @scala.inline
  implicit class CollectdPayloadErrorOps[Self <: CollectdPayloadError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withValueErrors(value: js.Array[CollectdValueError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueErrors")(js.undefined)
        ret
    }
  }
  
}

