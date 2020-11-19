package typingsSlinky.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDetectorsRequest extends js.Object {
  
  /**
    * The name of the detector model whose detectors (instances) are listed.
    */
  var detectorModelName: DetectorModelName = js.native
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A filter that limits results to those detectors (instances) in the given state.
    */
  var stateName: js.UndefOr[StateName] = js.native
}
object ListDetectorsRequest {
  
  @scala.inline
  def apply(detectorModelName: DetectorModelName): ListDetectorsRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDetectorsRequest]
  }
  
  @scala.inline
  implicit class ListDetectorsRequestOps[Self <: ListDetectorsRequest] (val x: Self) extends AnyVal {
    
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
    def setDetectorModelName(value: DetectorModelName): Self = this.set("detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setStateName(value: StateName): Self = this.set("stateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateName: Self = this.set("stateName", js.undefined)
  }
}
