package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueValueText extends js.Object {
  
  var value: js.UndefOr[js.Date | Double | String] = js.native
  
  var valueText: js.UndefOr[String] = js.native
}
object ValueValueText {
  
  @scala.inline
  def apply(): ValueValueText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueValueText]
  }
  
  @scala.inline
  implicit class ValueValueTextOps[Self <: ValueValueText] (val x: Self) extends AnyVal {
    
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
    def setValueDate(value: js.Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Date | Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueText(value: String): Self = this.set("valueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueText: Self = this.set("valueText", js.undefined)
  }
}
