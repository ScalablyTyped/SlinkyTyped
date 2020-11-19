package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDeliveryChannelStatusRequest extends js.Object {
  
  /**
    * A list of delivery channel names.
    */
  var DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.native
}
object DescribeDeliveryChannelStatusRequest {
  
  @scala.inline
  def apply(): DescribeDeliveryChannelStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeliveryChannelStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeDeliveryChannelStatusRequestOps[Self <: DescribeDeliveryChannelStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setDeliveryChannelNamesVarargs(value: ChannelName*): Self = this.set("DeliveryChannelNames", js.Array(value :_*))
    
    @scala.inline
    def setDeliveryChannelNames(value: DeliveryChannelNameList): Self = this.set("DeliveryChannelNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryChannelNames: Self = this.set("DeliveryChannelNames", js.undefined)
  }
}
