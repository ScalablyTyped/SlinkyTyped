package typingsSlinky.reactMdIcon.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdIcon.textIconSpacingMod.TextIconSpacingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextIconSpacing {
  
  @JSImport("@react-md/icon", "TextIconSpacing")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def aboveClassName(value: String): this.type = set("aboveClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def afterClassName(value: String): this.type = set("afterClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeClassName(value: String): this.type = set("beforeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def belowClassName(value: String): this.type = set("belowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceIconWrap(value: Boolean): this.type = set("forceIconWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconAfter(value: Boolean): this.type = set("iconAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TextIconSpacing.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextIconSpacingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
