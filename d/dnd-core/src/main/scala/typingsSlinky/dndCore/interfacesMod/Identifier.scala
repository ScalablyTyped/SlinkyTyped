package typingsSlinky.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Symbol
*/
trait Identifier extends TargetType

object Identifier {
  @scala.inline
  implicit def apply(value: String): Identifier = value.asInstanceOf[Identifier]
  @scala.inline
  implicit def apply(value: js.Symbol): Identifier = value.asInstanceOf[Identifier]
}

