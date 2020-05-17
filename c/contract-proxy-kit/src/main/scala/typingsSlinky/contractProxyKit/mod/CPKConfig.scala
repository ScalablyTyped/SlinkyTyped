package typingsSlinky.contractProxyKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.contractProxyKit.mod.Web3SpecificConfig
  - typingsSlinky.contractProxyKit.mod.EthersSpecificConfig
*/
trait CPKConfig extends js.Object

object CPKConfig {
  @scala.inline
  implicit def apply(value: EthersSpecificConfig): CPKConfig = value.asInstanceOf[CPKConfig]
  @scala.inline
  implicit def apply(value: Web3SpecificConfig): CPKConfig = value.asInstanceOf[CPKConfig]
}

