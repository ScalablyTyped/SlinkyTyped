package typingsSlinky.ionic.libIntegrationsMod

import typingsSlinky.ionic.integrationsCordovaMod.Integration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.integrationsCapacitorMod.Integration
  - typingsSlinky.ionic.integrationsCordovaMod.Integration
  - typingsSlinky.ionic.integrationsEnterpriseMod.Integration
*/
trait IntegationUnion extends js.Object

object IntegationUnion {
  @scala.inline
  implicit def apply(value: Integration): IntegationUnion = value.asInstanceOf[IntegationUnion]
  @scala.inline
  implicit def apply(value: typingsSlinky.ionic.integrationsEnterpriseMod.Integration): IntegationUnion = value.asInstanceOf[IntegationUnion]
  @scala.inline
  implicit def apply(value: typingsSlinky.ionic.integrationsCapacitorMod.Integration): IntegationUnion = value.asInstanceOf[IntegationUnion]
}

