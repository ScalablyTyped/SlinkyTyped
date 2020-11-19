package typingsSlinky.baseui.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronReact.mod.StyletronBase
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledEndEnhancerContainer {
  
  @JSImport("baseui/list", "StyledEndEnhancerContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def $asFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $asComponentClass(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $as(value: StyletronBase): this.type = set("$as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $styleFunction1(value: js.Object => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    @scala.inline
    def $style(value: StyleProp[js.Object]): this.type = set("$style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[js.Object with StyletronComponentInjectedProps[js.Object]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StyledEndEnhancerContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
