package typingsSlinky.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectType extends js.Object {
  
  var content: js.UndefOr[String] = js.native
  
  var objectType: js.UndefOr[String] = js.native
  
  var originalContent: js.UndefOr[String] = js.native
}
object ObjectType {
  
  @scala.inline
  def apply(): ObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectType]
  }
  
  @scala.inline
  implicit class ObjectTypeOps[Self <: ObjectType] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    
    @scala.inline
    def setOriginalContent(value: String): Self = this.set("originalContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalContent: Self = this.set("originalContent", js.undefined)
  }
}
