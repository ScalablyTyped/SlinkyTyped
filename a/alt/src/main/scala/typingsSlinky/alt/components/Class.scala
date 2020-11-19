package typingsSlinky.alt.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.alt.AltJS.Alt
import typingsSlinky.alt.AltJS.AltStore
import typingsSlinky.alt.altContainerMod.ContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Class {
  
  @JSImport("alt/AltContainer", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.alt.altContainerMod.Class] {
    
    @scala.inline
    def component(value: ReactComponentClass[_]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flux(value: Alt): this.type = set("flux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def render(value: /* repeated */ js.Any => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def shouldComponentUpdate(value: /* props */ js.Any => Boolean): this.type = set("shouldComponentUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def store(value: AltStore[_]): this.type = set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def storesVarargs(value: AltStore[js.Any]*): this.type = set("stores", js.Array(value :_*))
    
    @scala.inline
    def stores(value: js.Array[AltStore[_]]): this.type = set("stores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transform(value: (/* store */ AltStore[_], /* actions */ js.Any) => _): this.type = set("transform", js.Any.fromFunction2(value))
  }
  
  def withProps(p: ContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Class.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
