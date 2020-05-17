package typingsSlinky.nodeRsa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeRsa.mod.AdvancedSigningSchemePSS
  - typingsSlinky.nodeRsa.mod.AdvancedSigningSchemePKCS1
*/
trait AdvancedSigningScheme extends js.Object

object AdvancedSigningScheme {
  @scala.inline
  implicit def apply(value: AdvancedSigningSchemePKCS1): AdvancedSigningScheme = value.asInstanceOf[AdvancedSigningScheme]
  @scala.inline
  implicit def apply(value: AdvancedSigningSchemePSS): AdvancedSigningScheme = value.asInstanceOf[AdvancedSigningScheme]
}

