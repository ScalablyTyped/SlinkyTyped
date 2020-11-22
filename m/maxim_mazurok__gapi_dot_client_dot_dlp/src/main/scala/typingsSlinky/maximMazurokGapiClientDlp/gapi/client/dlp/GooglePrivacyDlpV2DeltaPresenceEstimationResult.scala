package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeltaPresenceEstimationResult extends js.Object {
  
  /**
    * The intervals [min_probability, max_probability) do not overlap. If a value doesn't correspond to any such interval, the associated frequency is zero. For example, the following
    * records: {min_probability: 0, max_probability: 0.1, frequency: 17} {min_probability: 0.2, max_probability: 0.3, frequency: 42} {min_probability: 0.3, max_probability: 0.4,
    * frequency: 99} mean that there are no record with an estimated probability in [0.1, 0.2) nor larger or equal to 0.4.
    */
  var deltaPresenceEstimationHistogram: js.UndefOr[js.Array[GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]] = js.native
}
object GooglePrivacyDlpV2DeltaPresenceEstimationResult {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeltaPresenceEstimationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeltaPresenceEstimationResult]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeltaPresenceEstimationResultOps[Self <: GooglePrivacyDlpV2DeltaPresenceEstimationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeltaPresenceEstimationHistogramVarargs(value: GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket*): Self = this.set("deltaPresenceEstimationHistogram", js.Array(value :_*))
    
    @scala.inline
    def setDeltaPresenceEstimationHistogram(value: js.Array[GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]): Self = this.set("deltaPresenceEstimationHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeltaPresenceEstimationHistogram: Self = this.set("deltaPresenceEstimationHistogram", js.undefined)
  }
}
