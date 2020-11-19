package typingsSlinky.giustoInkRouter.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.giustoInkRouter.mod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switch {
  
  @JSImport("@giusto/ink-router", "Switch")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.giustoInkRouter.mod.Switch] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def children(value: ReactElement | js.Array[ReactElement]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notFoundFunctionComponent(value: ReactComponentClass[_]): this.type = set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notFoundFunction0(value: () => _): this.type = set("notFound", js.Any.fromFunction0(value))
    
    @scala.inline
    def notFoundComponentClass(value: ReactComponentClass[_]): this.type = set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notFound(value: js.Function0[_] | ReactComponentClass[_]): this.type = set("notFound", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Switch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
