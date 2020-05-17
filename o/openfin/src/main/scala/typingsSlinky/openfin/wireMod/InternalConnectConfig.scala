package typingsSlinky.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.wireMod.ExistingConnectConfig
  - typingsSlinky.openfin.wireMod.NewConnectConfig
*/
trait InternalConnectConfig extends js.Object

object InternalConnectConfig {
  @scala.inline
  implicit def apply(value: ExistingConnectConfig): InternalConnectConfig = value.asInstanceOf[InternalConnectConfig]
  @scala.inline
  implicit def apply(value: NewConnectConfig): InternalConnectConfig = value.asInstanceOf[InternalConnectConfig]
}

