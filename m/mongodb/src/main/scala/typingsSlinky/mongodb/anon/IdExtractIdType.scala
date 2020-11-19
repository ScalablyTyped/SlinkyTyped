package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdExtractIdType[TSchema] extends js.Object {
  
  var _id: ExtractIdType[TSchema] = js.native
}
object IdExtractIdType {
  
  @scala.inline
  def apply[TSchema](_id: ExtractIdType[TSchema]): IdExtractIdType[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdExtractIdType[TSchema]]
  }
  
  @scala.inline
  implicit class IdExtractIdTypeOps[Self <: IdExtractIdType[_], TSchema] (val x: Self with IdExtractIdType[TSchema]) extends AnyVal {
    
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
    def set_id(value: ExtractIdType[TSchema]): Self = this.set("_id", value.asInstanceOf[js.Any])
  }
}
