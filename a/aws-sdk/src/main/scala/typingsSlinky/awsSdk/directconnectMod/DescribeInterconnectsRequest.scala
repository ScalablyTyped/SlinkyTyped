package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInterconnectsRequest extends js.Object {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.native
}
object DescribeInterconnectsRequest {
  
  @scala.inline
  def apply(): DescribeInterconnectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInterconnectsRequest]
  }
  
  @scala.inline
  implicit class DescribeInterconnectsRequestOps[Self <: DescribeInterconnectsRequest] (val x: Self) extends AnyVal {
    
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
    def setInterconnectId(value: InterconnectId): Self = this.set("interconnectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterconnectId: Self = this.set("interconnectId", js.undefined)
  }
}
