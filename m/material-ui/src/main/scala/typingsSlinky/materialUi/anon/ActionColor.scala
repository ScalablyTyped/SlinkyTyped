package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionColor extends js.Object {
  
  var actionColor: js.UndefOr[String] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object ActionColor {
  
  @scala.inline
  def apply(): ActionColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionColor]
  }
  
  @scala.inline
  implicit class ActionColorOps[Self <: ActionColor] (val x: Self) extends AnyVal {
    
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
    def setActionColor(value: String): Self = this.set("actionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionColor: Self = this.set("actionColor", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
