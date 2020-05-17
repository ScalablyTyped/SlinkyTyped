package typingsSlinky.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.wireMod.ExistingConnectConfig
  - typingsSlinky.openfin.wireMod.NewConnectConfig
  - typingsSlinky.openfin.wireMod.ExternalConfig
*/
trait ConnectConfig extends js.Object

object ConnectConfig {
  @scala.inline
  implicit def apply(value: ExistingConnectConfig): ConnectConfig = value.asInstanceOf[ConnectConfig]
  @scala.inline
  implicit def apply(value: ExternalConfig): ConnectConfig = value.asInstanceOf[ConnectConfig]
  @scala.inline
  implicit def apply(value: NewConnectConfig): ConnectConfig = value.asInstanceOf[ConnectConfig]
}

