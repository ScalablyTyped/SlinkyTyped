package typingsSlinky.googleProtobuf.fieldMaskPbMod.FieldMask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var pathsList: js.Array[String] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(pathsList: js.Array[String]): AsObject = {
    val __obj = js.Dynamic.literal(pathsList = pathsList.asInstanceOf[js.Any])
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
    def setPathsListVarargs(value: String*): Self = this.set("pathsList", js.Array(value :_*))
    
    @scala.inline
    def setPathsList(value: js.Array[String]): Self = this.set("pathsList", value.asInstanceOf[js.Any])
  }
}
