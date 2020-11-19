package typingsSlinky.ionicReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicReact.ionRedirectMod.IonRedirectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonRedirect {
  
  @JSImport("@ionic/react", "IonRedirect")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.ionicReact.mod.IonRedirect] {
    
    @scala.inline
    def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def path(value: String): this.type = set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def routerOptions(value: js.Any): this.type = set("routerOptions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IonRedirectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(to: String): Builder = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IonRedirectProps]))
  }
}
