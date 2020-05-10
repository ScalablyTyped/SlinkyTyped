package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCollectdTimeSeriesResponse extends js.Object {
  /**
    * Records the error status for points that were not written due to an error.Failed requests for which nothing is written will return an error response
    * instead.
    */
  var payloadErrors: js.UndefOr[js.Array[CollectdPayloadError]] = js.native
}

object CreateCollectdTimeSeriesResponse {
  @scala.inline
  def apply(): CreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectdTimeSeriesResponse]
  }
  @scala.inline
  implicit class CreateCollectdTimeSeriesResponseOps[Self <: CreateCollectdTimeSeriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayloadErrors(value: js.Array[CollectdPayloadError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadErrors")(js.undefined)
        ret
    }
  }
  
}

