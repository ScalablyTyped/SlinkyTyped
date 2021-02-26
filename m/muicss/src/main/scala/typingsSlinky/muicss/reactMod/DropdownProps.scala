package typingsSlinky.muicss.reactMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.muicss.muicssStrings.left
import typingsSlinky.muicss.muicssStrings.right
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
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
  implicit class DropdownPropsMutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignMenu(value: left | right): Self = StObject.set(x, "alignMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignMenuUndefined: Self = StObject.set(x, "alignMenu", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOnOutsideClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOutsideClickUndefined: Self = StObject.set(x, "onOutsideClick", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
