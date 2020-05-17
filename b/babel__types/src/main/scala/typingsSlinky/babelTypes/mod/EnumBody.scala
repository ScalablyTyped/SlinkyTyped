package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.EnumBooleanBody_
  - typingsSlinky.babelTypes.mod.EnumNumberBody_
  - typingsSlinky.babelTypes.mod.EnumStringBody_
  - typingsSlinky.babelTypes.mod.EnumSymbolBody_
*/
trait EnumBody extends Node

object EnumBody {
  @scala.inline
  implicit def apply(value: EnumBooleanBody_): EnumBody = value.asInstanceOf[EnumBody]
  @scala.inline
  implicit def apply(value: EnumNumberBody_): EnumBody = value.asInstanceOf[EnumBody]
  @scala.inline
  implicit def apply(value: EnumStringBody_): EnumBody = value.asInstanceOf[EnumBody]
  @scala.inline
  implicit def apply(value: EnumSymbolBody_): EnumBody = value.asInstanceOf[EnumBody]
}

