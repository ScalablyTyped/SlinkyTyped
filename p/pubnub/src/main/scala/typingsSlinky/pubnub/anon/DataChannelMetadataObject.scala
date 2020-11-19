package typingsSlinky.pubnub.anon

import typingsSlinky.pubnub.mod.ChannelMetadataObject
import typingsSlinky.pubnub.mod.ObjectCustom
import typingsSlinky.pubnub.pubnubStrings.channel
import typingsSlinky.pubnub.pubnubStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataChannelMetadataObject[ChannelCustom /* <: ObjectCustom */] extends js.Object {
  
  var data: ChannelMetadataObject[ChannelCustom] = js.native
  
  var event: set = js.native
  
  var `type`: channel = js.native
}
object DataChannelMetadataObject {
  
  @scala.inline
  def apply[ChannelCustom /* <: ObjectCustom */](data: ChannelMetadataObject[ChannelCustom], event: set, `type`: channel): DataChannelMetadataObject[ChannelCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChannelMetadataObject[ChannelCustom]]
  }
  
  @scala.inline
  implicit class DataChannelMetadataObjectOps[Self <: DataChannelMetadataObject[_], ChannelCustom /* <: ObjectCustom */] (val x: Self with DataChannelMetadataObject[ChannelCustom]) extends AnyVal {
    
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
    def setData(value: ChannelMetadataObject[ChannelCustom]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: set): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: channel): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
