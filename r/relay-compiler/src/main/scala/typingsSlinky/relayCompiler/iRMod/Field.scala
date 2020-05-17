package typingsSlinky.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.LinkedField
  - typingsSlinky.relayCompiler.iRMod.ScalarField
*/
trait Field extends js.Object

object Field {
  @scala.inline
  implicit def apply(value: LinkedField): Field = value.asInstanceOf[Field]
  @scala.inline
  implicit def apply(value: ScalarField): Field = value.asInstanceOf[Field]
}

