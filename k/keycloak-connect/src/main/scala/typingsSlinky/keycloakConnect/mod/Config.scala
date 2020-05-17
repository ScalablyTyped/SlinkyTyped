package typingsSlinky.keycloakConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.keycloakConnect.mod.StoreConfig
  - typingsSlinky.keycloakConnect.mod.CookiesConfig
  - typingsSlinky.keycloakConnect.mod.BaseConfig
*/
trait Config extends js.Object

object Config {
  @scala.inline
  implicit def apply(value: BaseConfig): Config = value.asInstanceOf[Config]
  @scala.inline
  implicit def apply(value: CookiesConfig): Config = value.asInstanceOf[Config]
  @scala.inline
  implicit def apply(value: StoreConfig): Config = value.asInstanceOf[Config]
}

