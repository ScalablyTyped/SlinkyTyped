package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredMark extends js.Object {
  
  var requiredMark: js.UndefOr[typingsSlinky.antd.formFormMod.RequiredMark] = js.native
}
object RequiredMark {
  
  @scala.inline
  def apply(): RequiredMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredMark]
  }
  
  @scala.inline
  implicit class RequiredMarkOps[Self <: RequiredMark] (val x: Self) extends AnyVal {
    
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
    def setRequiredMark(value: typingsSlinky.antd.formFormMod.RequiredMark): Self = this.set("requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredMark: Self = this.set("requiredMark", js.undefined)
  }
}
