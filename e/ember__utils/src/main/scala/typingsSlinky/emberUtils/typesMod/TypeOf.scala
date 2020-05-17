package typingsSlinky.emberUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.emberUtils.typesMod.KeysOfType[Base, Condition]
  - typingsSlinky.emberUtils.emberUtilsStrings.`object`
*/
trait TypeOf[Base, Condition] extends js.Object

object TypeOf {
  @scala.inline
  def `object`[Base, Condition]: typingsSlinky.emberUtils.emberUtilsStrings.`object` = "object".asInstanceOf[typingsSlinky.emberUtils.emberUtilsStrings.`object`]
  @scala.inline
  implicit def apply[Base, Condition](value: KeysOfType[Base, Condition]): TypeOf[Base, Condition] = value.asInstanceOf[TypeOf[Base, Condition]]
}

