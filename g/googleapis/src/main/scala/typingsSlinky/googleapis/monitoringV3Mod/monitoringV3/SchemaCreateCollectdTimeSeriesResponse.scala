package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CreateCollectdTimeSeries response.
  */
@js.native
trait SchemaCreateCollectdTimeSeriesResponse extends js.Object {
  /**
    * Records the error status for points that were not written due to an
    * error.Failed requests for which nothing is written will return an error
    * response instead.
    */
  var payloadErrors: js.UndefOr[js.Array[SchemaCollectdPayloadError]] = js.native
}

object SchemaCreateCollectdTimeSeriesResponse {
  @scala.inline
  def apply(): SchemaCreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCollectdTimeSeriesResponse]
  }
  @scala.inline
  implicit class SchemaCreateCollectdTimeSeriesResponseOps[Self <: SchemaCreateCollectdTimeSeriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayloadErrors(value: js.Array[SchemaCollectdPayloadError]): Self = {
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

