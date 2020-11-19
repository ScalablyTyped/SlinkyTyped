package typingsSlinky.reactRadioGroup.anon

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactRadioGroup.mod.Omit
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.onChange
import typingsSlinky.reactRadioGroup.reactRadioGroupStrings.role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends js.Object {
  
  var Component: js.UndefOr[ReactType[Omit[HTMLProps[_], onChange | role]]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  var selectedValue: js.UndefOr[js.Any] = js.native
}
object Component {
  
  @scala.inline
  def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    
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
    def setComponentFunctionComponent(value: ReactComponentClass[Omit[HTMLProps[_], onChange | role]]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[Omit[HTMLProps[_], onChange | role]]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ReactType[Omit[HTMLProps[_], onChange | role]]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setSelectedValue(value: js.Any): Self = this.set("selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedValue: Self = this.set("selectedValue", js.undefined)
  }
}
