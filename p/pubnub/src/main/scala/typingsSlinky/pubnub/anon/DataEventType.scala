package typingsSlinky.pubnub.anon

import typingsSlinky.pubnub.mod.ObjectCustom
import typingsSlinky.pubnub.mod.UUIDMetadataObject
import typingsSlinky.pubnub.pubnubStrings.set
import typingsSlinky.pubnub.pubnubStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataEventType[UUIDCustom /* <: ObjectCustom */] extends js.Object {
  
  var data: UUIDMetadataObject[UUIDCustom] = js.native
  
  var event: set = js.native
  
  var `type`: uuid = js.native
}
object DataEventType {
  
  @scala.inline
  def apply[UUIDCustom /* <: ObjectCustom */](data: UUIDMetadataObject[UUIDCustom], event: set, `type`: uuid): DataEventType[UUIDCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEventType[UUIDCustom]]
  }
  
  @scala.inline
  implicit class DataEventTypeOps[Self <: DataEventType[_], UUIDCustom /* <: ObjectCustom */] (val x: Self with DataEventType[UUIDCustom]) extends AnyVal {
    
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
    def setData(value: UUIDMetadataObject[UUIDCustom]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: set): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: uuid): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
