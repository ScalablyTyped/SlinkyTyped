package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typingsSlinky.applicationinsightsJs.AI.PageViewPerfData
import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typingsSlinky.applicationinsightsJs.anon.DomProcessing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageViewPerformance
  extends PageViewPerfData
     with ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_PageViewPerformance: DomProcessing = js.native
  var durationMs: js.Any = js.native
  /**
    * Field indicating whether this instance of PageViewPerformance is valid and should be sent
    */
  var isValid: js.Any = js.native
  /**
    * Gets the total duration (PLT) in milliseconds. Check getIsValid() before using this method.
    */
  def getDurationMs(): Double = js.native
  /**
    * Indicates whether this instance of PageViewPerformance is valid and should be sent
    */
  def getIsValid(): Boolean = js.native
}

object PageViewPerformance {
  @scala.inline
  def apply(
    aiDataContract: DomProcessing,
    domProcessing: String,
    duration: String,
    durationMs: js.Any,
    getDurationMs: () => Double,
    getIsValid: () => Boolean,
    isValid: js.Any,
    measurements: js.Any,
    name: String,
    networkConnect: String,
    perfTotal: String,
    properties: js.Any,
    receivedResponse: String,
    referrer: String,
    referrerData: String,
    sentRequest: String,
    url: String,
    ver: Double
  ): PageViewPerformance = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], domProcessing = domProcessing.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], durationMs = durationMs.asInstanceOf[js.Any], getDurationMs = js.Any.fromFunction0(getDurationMs), getIsValid = js.Any.fromFunction0(getIsValid), isValid = isValid.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkConnect = networkConnect.asInstanceOf[js.Any], perfTotal = perfTotal.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], receivedResponse = receivedResponse.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerData = referrerData.asInstanceOf[js.Any], sentRequest = sentRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageViewPerformance]
  }
  @scala.inline
  implicit class PageViewPerformanceOps[Self <: PageViewPerformance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAiDataContract(value: DomProcessing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aiDataContract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationMs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDurationMs(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDurationMs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

