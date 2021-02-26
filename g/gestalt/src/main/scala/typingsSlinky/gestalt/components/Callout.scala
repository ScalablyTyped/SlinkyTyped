package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.AccessibilityLabel
import typingsSlinky.gestalt.gestaltStrings.error
import typingsSlinky.gestalt.gestaltStrings.info
import typingsSlinky.gestalt.gestaltStrings.warning
import typingsSlinky.gestalt.mod.CalloutProps
import typingsSlinky.gestalt.mod.LinkData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Callout {
  
  @scala.inline
  def apply(iconAccessibilityLabel: String, message: String, `type`: error | info | warning): Builder = {
    val __props = js.Dynamic.literal(iconAccessibilityLabel = iconAccessibilityLabel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CalloutProps]))
  }
  
  @JSImport("gestalt", "Callout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Callout] {
    
    @scala.inline
    def dismissButton(value: AccessibilityLabel): this.type = set("dismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def primaryLink(value: LinkData): this.type = set("primaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryLink(value: LinkData): this.type = set("secondaryLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CalloutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
