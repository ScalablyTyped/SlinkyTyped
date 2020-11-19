package typingsSlinky.baseui.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.listMod.StyledContentPropsT
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronReact.mod.StyletronBase
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledContent {
  
  @JSImport("baseui/list", "StyledContent")
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
    def $styleFunction1(value: StyledContentPropsT => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
    
    @scala.inline
    def $style(value: StyleProp[StyledContentPropsT]): this.type = set("$style", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: PropsWithChildren[StyledContentPropsT with StyletronComponentInjectedProps[StyledContentPropsT]]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply($mLeft: Boolean, $sublist: Boolean): Builder = {
    val __props = js.Dynamic.literal($mLeft = $mLeft.asInstanceOf[js.Any], $sublist = $sublist.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[StyledContentPropsT with StyletronComponentInjectedProps[StyledContentPropsT]]]))
  }
}
