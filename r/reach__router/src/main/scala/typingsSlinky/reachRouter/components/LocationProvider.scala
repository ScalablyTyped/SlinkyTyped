package typingsSlinky.reachRouter.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reachRouter.mod.History
import typingsSlinky.reachRouter.mod.LocationContext
import typingsSlinky.reachRouter.mod.LocationProviderProps
import typingsSlinky.reachRouter.mod.LocationProviderRenderFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocationProvider {
  
  @JSImport("@reach/router", "LocationProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reachRouter.mod.LocationProvider] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* context */ LocationContext => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: ReactElement | LocationProviderRenderFn): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def history(value: History): this.type = set("history", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocationProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LocationProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
