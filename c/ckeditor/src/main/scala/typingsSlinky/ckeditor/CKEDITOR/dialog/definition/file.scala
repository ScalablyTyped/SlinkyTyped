package typingsSlinky.ckeditor.CKEDITOR.dialog.definition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait file extends labeledElement {
  
  var action: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var validate: js.UndefOr[js.Function0[Boolean]] = js.native
}
object file {
  
  @scala.inline
  def apply(): file = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[file]
  }
  
  @scala.inline
  implicit class fileOps[Self <: file] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setValidate(value: () => Boolean): Self = this.set("validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
