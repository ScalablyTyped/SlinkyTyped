package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typingsSlinky.applicationinsightsJs.AI.PageViewData
import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typingsSlinky.applicationinsightsJs.anon.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageView
  extends PageViewData
     with ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_PageView: Duration
}

object PageView {
  @scala.inline
  def apply(
    aiDataContract: Duration,
    duration: String,
    measurements: js.Any,
    name: String,
    properties: js.Any,
    referrer: String,
    referrerData: String,
    url: String,
    ver: Double
  ): PageView = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerData = referrerData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageView]
  }
}

