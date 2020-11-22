package typingsSlinky.reactIntl.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactIntl.componentsInjectIntlMod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedComponent[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] extends js.Object {
  
  var WrappedComponent: ReactComponentClass[P] = js.native
}
object WrappedComponent {
  
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */](WrappedComponent: ReactComponentClass[P]): WrappedComponent[P, IntlPropName] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponent[P, IntlPropName]]
  }
  
  @scala.inline
  implicit class WrappedComponentOps[Self <: WrappedComponent[_, _], P /* <: WrappedComponentProps[IntlPropName] */, IntlPropName /* <: String */] (val x: Self with (WrappedComponent[P, IntlPropName])) extends AnyVal {
    
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
    def setWrappedComponent(value: ReactComponentClass[P]): Self = this.set("WrappedComponent", value.asInstanceOf[js.Any])
  }
}
