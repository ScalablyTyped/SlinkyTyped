package typingsSlinky.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait radio extends js.Object {
  
  var default: js.Any = js.native
  
  var items: js.Array[(js.Tuple2[String, String]) | js.Array[String]] = js.native
  
  var validate: js.UndefOr[js.Function0[Boolean]] = js.native
}
object radio {
  
  @scala.inline
  def apply(default: js.Any, items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): radio = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[radio]
  }
  
  @scala.inline
  implicit class radioOps[Self <: radio] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ((js.Tuple2[String, String]) | js.Array[String])*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: () => Boolean): Self = this.set("validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
