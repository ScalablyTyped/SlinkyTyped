package typingsSlinky.pubnub.anon

import typingsSlinky.pubnub.mod.ObjectCustom
import typingsSlinky.pubnub.pubnubStrings.membership
import typingsSlinky.pubnub.pubnubStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataChannel[MembershipCustom /* <: ObjectCustom */] extends js.Object {
  
  var data: Channel[MembershipCustom] = js.native
  
  var event: set = js.native
  
  var `type`: membership = js.native
}
object DataChannel {
  
  @scala.inline
  def apply[MembershipCustom /* <: ObjectCustom */](data: Channel[MembershipCustom], event: set, `type`: membership): DataChannel[MembershipCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChannel[MembershipCustom]]
  }
  
  @scala.inline
  implicit class DataChannelOps[Self <: DataChannel[_], MembershipCustom /* <: ObjectCustom */] (val x: Self with DataChannel[MembershipCustom]) extends AnyVal {
    
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
    def setData(value: Channel[MembershipCustom]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: set): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: membership): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
