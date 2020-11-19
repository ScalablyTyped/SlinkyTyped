package typingsSlinky.pubnub.anon

import typingsSlinky.pubnub.pubnubStrings.delete
import typingsSlinky.pubnub.pubnubStrings.uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataId extends js.Object {
  
  var data: Id = js.native
  
  var event: delete = js.native
  
  var `type`: uuid = js.native
}
object DataId {
  
  @scala.inline
  def apply(data: Id, event: delete, `type`: uuid): DataId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataId]
  }
  
  @scala.inline
  implicit class DataIdOps[Self <: DataId] (val x: Self) extends AnyVal {
    
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
    def setData(value: Id): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: delete): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: uuid): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
