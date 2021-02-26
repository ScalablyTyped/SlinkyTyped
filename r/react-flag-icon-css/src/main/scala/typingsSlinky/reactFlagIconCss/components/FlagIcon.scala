package typingsSlinky.reactFlagIconCss.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFlagIconCss.mod.FlagIconFlip
import typingsSlinky.reactFlagIconCss.mod.FlagIconProps
import typingsSlinky.reactFlagIconCss.mod.FlagIconRotate
import typingsSlinky.reactFlagIconCss.mod.FlagIconSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlagIcon {
  
  @scala.inline
  def apply(code: String): Builder = {
    val __props = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FlagIconProps]))
  }
  
  @JSImport("react-flag-icon-css", "FlagIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFlagIconCss.mod.FlagIcon] {
    
    @scala.inline
    def Component(value: String): this.type = set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flip(value: FlagIconFlip): this.type = set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rotate(value: FlagIconRotate): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: FlagIconSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def squared(value: Boolean): this.type = set("squared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleName(value: String): this.type = set("styleName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlagIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
