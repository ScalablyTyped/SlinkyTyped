package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.gestaltStrings.dark
import typingsSlinky.gestalt.gestaltStrings.light
import typingsSlinky.gestalt.gestaltStrings.userPreference
import typingsSlinky.gestalt.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("gestalt", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Provider] {
    
    @scala.inline
    def colorScheme(value: light | dark | userPreference): this.type = set("colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
