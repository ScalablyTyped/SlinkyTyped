package typingsSlinky.reactAuthKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactChildren
import typingsSlinky.reactAuthKit.reactAuthKitStrings.cookie
import typingsSlinky.reactAuthKit.reactAuthKitStrings.localstorage
import typingsSlinky.reactAuthKit.typesMod.AuthProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthProvider {
  
  @scala.inline
  def apply(
    authStorageName: String,
    authStorageType: cookie | localstorage,
    authTimeStorageName: String,
    children: ReactChildren,
    stateStorageName: String
  ): Builder = {
    val __props = js.Dynamic.literal(authStorageName = authStorageName.asInstanceOf[js.Any], authStorageType = authStorageType.asInstanceOf[js.Any], authTimeStorageName = authTimeStorageName.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], stateStorageName = stateStorageName.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AuthProviderProps]))
  }
  
  @JSImport("react-auth-kit", "AuthProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def cookieDomain(value: String): this.type = set("cookieDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cookieSecure(value: Boolean): this.type = set("cookieSecure", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AuthProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
