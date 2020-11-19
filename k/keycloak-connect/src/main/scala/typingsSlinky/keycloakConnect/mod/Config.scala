package typingsSlinky.keycloakConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.keycloakConnect.mod.StoreConfig
  - typingsSlinky.keycloakConnect.mod.CookiesConfig
  - typingsSlinky.keycloakConnect.mod.BaseConfig
*/
trait Config extends js.Object
object Config {
  
  @scala.inline
  def StoreConfig(store: js.Any): Config = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  def CookiesConfig(cookies: js.Any): Config = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  def BaseConfig(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
}
