package typingsSlinky.googleProtobuf.structPbMod.ListValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var valuesList: js.Array[typingsSlinky.googleProtobuf.structPbMod.Value.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(valuesList: js.Array[typingsSlinky.googleProtobuf.structPbMod.Value.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(valuesList = valuesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setValuesListVarargs(value: typingsSlinky.googleProtobuf.structPbMod.Value.AsObject*): Self = this.set("valuesList", js.Array(value :_*))
    
    @scala.inline
    def setValuesList(value: js.Array[typingsSlinky.googleProtobuf.structPbMod.Value.AsObject]): Self = this.set("valuesList", value.asInstanceOf[js.Any])
  }
}
