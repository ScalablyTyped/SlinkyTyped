package typingsSlinky.reactAriaLive.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactAriaLive.anon.Arialive
import typingsSlinky.reactAriaLive.reactAriaLiveStrings.assertive
import typingsSlinky.reactAriaLive.reactAriaLiveStrings.polite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LiveMessage {
  
  @scala.inline
  def apply(`aria-live`: assertive | polite, message: String): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __props.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Arialive]))
  }
  
  @JSImport("react-aria-live", "LiveMessage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def clearOnUnmount(value: Boolean): this.type = set("clearOnUnmount", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Arialive): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
