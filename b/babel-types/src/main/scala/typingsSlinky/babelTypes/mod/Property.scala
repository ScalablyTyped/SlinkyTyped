package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ObjectProperty_
  - typingsSlinky.babelTypes.mod.ClassProperty_
*/
trait Property extends js.Object

object Property {
  @scala.inline
  implicit def apply(value: ClassProperty_): Property = value.asInstanceOf[Property]
  @scala.inline
  implicit def apply(value: ObjectProperty_): Property = value.asInstanceOf[Property]
}

