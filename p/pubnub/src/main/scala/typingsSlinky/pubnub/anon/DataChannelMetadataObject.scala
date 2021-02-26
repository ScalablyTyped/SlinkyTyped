package typingsSlinky.pubnub.anon

import typingsSlinky.pubnub.mod.ChannelMetadataObject
import typingsSlinky.pubnub.mod.ObjectCustom
import typingsSlinky.pubnub.pubnubStrings.channel
import typingsSlinky.pubnub.pubnubStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataChannelMetadataObject[ChannelCustom /* <: ObjectCustom */] extends StObject {
  
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
  implicit class DataChannelMetadataObjectMutableBuilder[Self <: DataChannelMetadataObject[_], ChannelCustom /* <: ObjectCustom */] (val x: Self with DataChannelMetadataObject[ChannelCustom]) extends AnyVal {
    
    @scala.inline
    def setData(value: ChannelMetadataObject[ChannelCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
