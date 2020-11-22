package typingsSlinky.nextAuth.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nextAuth.clientMod.ContextProviderProps
import typingsSlinky.nextAuth.clientMod.Session_
import typingsSlinky.nextAuth.clientMod.SetOptionsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("next-auth/client", "Provider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def options(value: SetOptionsParams): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def session(value: Session_): this.type = set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sessionNull: this.type = set("session", null)
  }
  
  def withProps(p: ContextProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
