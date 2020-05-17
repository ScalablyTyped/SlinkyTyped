package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.EnumBooleanMember_
  - typingsSlinky.babelTypes.mod.EnumNumberMember_
  - typingsSlinky.babelTypes.mod.EnumStringMember_
  - typingsSlinky.babelTypes.mod.EnumDefaultedMember_
*/
trait EnumMember extends Node

object EnumMember {
  @scala.inline
  implicit def apply(value: EnumBooleanMember_): EnumMember = value.asInstanceOf[EnumMember]
  @scala.inline
  implicit def apply(value: EnumDefaultedMember_): EnumMember = value.asInstanceOf[EnumMember]
  @scala.inline
  implicit def apply(value: EnumNumberMember_): EnumMember = value.asInstanceOf[EnumMember]
  @scala.inline
  implicit def apply(value: EnumStringMember_): EnumMember = value.asInstanceOf[EnumMember]
}

