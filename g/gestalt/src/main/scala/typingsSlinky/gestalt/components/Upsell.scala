package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.AccessibilityLabel
import typingsSlinky.gestalt.mod.LinkData
import typingsSlinky.gestalt.mod.UpsellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Upsell {
  
  @JSImport("gestalt", "Upsell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Upsell] {
    
    @scala.inline
    def dismissButton(value: AccessibilityLabel): this.type = set("dismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def primaryLink(value: LinkData): this.type = set("primaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryLink(value: LinkData): this.type = set("secondaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: UpsellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(message: String): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[UpsellProps]))
  }
}
