package typingsSlinky.muicss.reactMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.muicss.muicssStrings.left
import typingsSlinky.muicss.muicssStrings.right
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownProps extends HTMLAttributes[HTMLDivElement] {
  
  var alignMenu: js.UndefOr[left | right] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[ReactElement] = js.native
  
  var onOutsideClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var variant: js.UndefOr[String] = js.native
}
object DropdownProps {
  
  @scala.inline
  def apply(): DropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownProps]
  }
  
  @scala.inline
  implicit class DropdownPropsOps[Self <: DropdownProps] (val x: Self) extends AnyVal {
    
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
    def setAlignMenu(value: left | right): Self = this.set("alignMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignMenu: Self = this.set("alignMenu", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ReactElement): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnOutsideClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onOutsideClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOutsideClick: Self = this.set("onOutsideClick", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
