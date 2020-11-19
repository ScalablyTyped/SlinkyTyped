package typingsSlinky.primereact.listBoxItemMod

import slinky.core.facade.ReactElement
import typingsSlinky.primereact.anon.OptionOriginalEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxItemProps extends js.Object {
  
  var onClick: js.UndefOr[js.Function1[/* e */ OptionOriginalEvent, Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[/* e */ OptionOriginalEvent, Unit]] = js.native
  
  var option: js.UndefOr[js.Any] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[ReactElement]]] = js.native
}
object ListBoxItemProps {
  
  @scala.inline
  def apply(): ListBoxItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxItemProps]
  }
  
  @scala.inline
  implicit class ListBoxItemPropsOps[Self <: ListBoxItemProps] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: /* e */ OptionOriginalEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* e */ OptionOriginalEvent => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOption(value: js.Any): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setTemplate(value: /* item */ js.Any => js.UndefOr[ReactElement]): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
