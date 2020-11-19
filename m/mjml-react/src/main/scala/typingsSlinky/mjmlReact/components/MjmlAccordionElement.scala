package typingsSlinky.mjmlReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.csstype.mod.Property.BackgroundColor
import typingsSlinky.mjmlReact.mjmlReactStrings.left
import typingsSlinky.mjmlReact.mjmlReactStrings.right
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlAccordionElementProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlAccordionElement {
  
  @JSImport("mjml-react", "MjmlAccordionElement")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlAccordionElement] {
    
    @scala.inline
    def backgroundColor(value: BackgroundColor): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconAlign(value: String): this.type = set("iconAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconHeight(value: String): this.type = set("iconHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconPosition(value: left | right): this.type = set("iconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconUnwrappedAlt(value: String): this.type = set("iconUnwrappedAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconUnwrappedUrl(value: String): this.type = set("iconUnwrappedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconWidth(value: String): this.type = set("iconWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconWrappedAlt(value: String): this.type = set("iconWrappedAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconWrappedUrl(value: String): this.type = set("iconWrappedUrl", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RequiredChildrenProps with MjmlAccordionElementProps with ClassNameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MjmlAccordionElement.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
