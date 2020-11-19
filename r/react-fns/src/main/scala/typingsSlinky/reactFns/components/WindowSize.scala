package typingsSlinky.reactFns.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import typingsSlinky.reactFns.windowSizeWindowSizeMod.WindowSizeConfig
import typingsSlinky.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WindowSize {
  
  @JSImport("react-fns", "WindowSize")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFns.mod.WindowSize] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: WindowSizeProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: (js.Function1[WindowSizeProps, ReactElement]) | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[WindowSizeProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[WindowSizeProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactComponentClass[WindowSizeProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def render(value: WindowSizeProps => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def throttle(value: Double): this.type = set("throttle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: WindowSizeConfig with SharedRenderProps[WindowSizeProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: WindowSize.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
