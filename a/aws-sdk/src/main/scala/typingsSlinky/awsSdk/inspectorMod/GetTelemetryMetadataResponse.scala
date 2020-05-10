package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTelemetryMetadataResponse extends js.Object {
  /**
    * Telemetry details.
    */
  var telemetryMetadata: TelemetryMetadataList = js.native
}

object GetTelemetryMetadataResponse {
  @scala.inline
  def apply(telemetryMetadata: TelemetryMetadataList): GetTelemetryMetadataResponse = {
    val __obj = js.Dynamic.literal(telemetryMetadata = telemetryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTelemetryMetadataResponse]
  }
  @scala.inline
  implicit class GetTelemetryMetadataResponseOps[Self <: GetTelemetryMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTelemetryMetadata(value: TelemetryMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetryMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

