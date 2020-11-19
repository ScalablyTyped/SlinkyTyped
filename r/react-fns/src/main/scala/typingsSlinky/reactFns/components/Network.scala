package typingsSlinky.reactFns.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFns.networkNetworkMod.NetworkProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Network {
  
  @JSImport("react-fns", "Network")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFns.mod.Network] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: NetworkProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: (js.Function1[NetworkProps, ReactElement]) | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[NetworkProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[NetworkProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactComponentClass[NetworkProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def render(value: NetworkProps => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps(p: SharedRenderProps[NetworkProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Network.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
