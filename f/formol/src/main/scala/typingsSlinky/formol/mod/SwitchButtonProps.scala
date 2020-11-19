package typingsSlinky.formol.mod

import slinky.core.facade.ReactElement
import typingsSlinky.formol.anon.Dictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchButtonProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var i18n: js.UndefOr[Dictk] = js.native
  
  var leftLabel: js.UndefOr[ReactElement] = js.native
  
  var rightLabel: js.UndefOr[ReactElement] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SwitchButtonProps {
  
  @scala.inline
  def apply(): SwitchButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchButtonProps]
  }
  
  @scala.inline
  implicit class SwitchButtonPropsOps[Self <: SwitchButtonProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setI18n(value: Dictk): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setLeftLabelReactElement(value: ReactElement): Self = this.set("leftLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftLabel(value: ReactElement): Self = this.set("leftLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftLabel: Self = this.set("leftLabel", js.undefined)
    
    @scala.inline
    def setRightLabelReactElement(value: ReactElement): Self = this.set("rightLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightLabel(value: ReactElement): Self = this.set("rightLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightLabel: Self = this.set("rightLabel", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
