package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.AccessibilityLabel
import typingsSlinky.gestalt.anon.Href
import typingsSlinky.gestalt.gestaltStrings.complete
import typingsSlinky.gestalt.gestaltStrings.needsAttention
import typingsSlinky.gestalt.gestaltStrings.notStarted
import typingsSlinky.gestalt.gestaltStrings.pending
import typingsSlinky.gestalt.mod.ActivationCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActivationCard {
  
  @JSImport("gestalt", "ActivationCard")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.ActivationCard] {
    
    @scala.inline
    def dismissButton(value: AccessibilityLabel): this.type = set("dismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def link(value: Href): this.type = set("link", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActivationCardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    message: String,
    status: notStarted | pending | needsAttention | complete,
    statusMessage: String,
    title: String
  ): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActivationCardProps]))
  }
}
