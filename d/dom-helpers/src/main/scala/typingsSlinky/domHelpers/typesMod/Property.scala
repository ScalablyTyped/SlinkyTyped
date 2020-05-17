package typingsSlinky.domHelpers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.domHelpers.typesMod.HyphenProperty
  - typingsSlinky.domHelpers.typesMod.CamelProperty
*/
trait Property extends js.Object

object Property {
  @scala.inline
  implicit def apply(value: CamelProperty): Property = value.asInstanceOf[Property]
  @scala.inline
  implicit def apply(value: HyphenProperty): Property = value.asInstanceOf[Property]
}

