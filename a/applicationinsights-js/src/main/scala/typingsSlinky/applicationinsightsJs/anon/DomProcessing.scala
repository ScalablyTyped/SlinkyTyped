package typingsSlinky.applicationinsightsJs.anon

import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomProcessing extends js.Object {
  var domProcessing: FieldType = js.native
  var duration: FieldType = js.native
  var measurements: FieldType = js.native
  var name: FieldType = js.native
  var networkConnect: FieldType = js.native
  var perfTotal: FieldType = js.native
  var properties: FieldType = js.native
  var receivedResponse: FieldType = js.native
  var sentRequest: FieldType = js.native
  var url: FieldType = js.native
  var ver: FieldType = js.native
}

object DomProcessing {
  @scala.inline
  def apply(
    domProcessing: FieldType,
    duration: FieldType,
    measurements: FieldType,
    name: FieldType,
    networkConnect: FieldType,
    perfTotal: FieldType,
    properties: FieldType,
    receivedResponse: FieldType,
    sentRequest: FieldType,
    url: FieldType,
    ver: FieldType
  ): DomProcessing = {
    val __obj = js.Dynamic.literal(domProcessing = domProcessing.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkConnect = networkConnect.asInstanceOf[js.Any], perfTotal = perfTotal.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], receivedResponse = receivedResponse.asInstanceOf[js.Any], sentRequest = sentRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomProcessing]
  }
  @scala.inline
  implicit class DomProcessingOps[Self <: DomProcessing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomProcessing(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasurements(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkConnect(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerfTotal(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedResponse(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSentRequest(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVer(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

