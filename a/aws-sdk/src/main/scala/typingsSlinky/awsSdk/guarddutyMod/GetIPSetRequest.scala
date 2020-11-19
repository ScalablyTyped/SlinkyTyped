package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIPSetRequest extends js.Object {
  
  /**
    * The unique ID of the detector that the IPSet is associated with.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The unique ID of the IPSet to retrieve.
    */
  var IpSetId: String = js.native
}
object GetIPSetRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, IpSetId: String): GetIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetRequest]
  }
  
  @scala.inline
  implicit class GetIPSetRequestOps[Self <: GetIPSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetId(value: String): Self = this.set("IpSetId", value.asInstanceOf[js.Any])
  }
}
