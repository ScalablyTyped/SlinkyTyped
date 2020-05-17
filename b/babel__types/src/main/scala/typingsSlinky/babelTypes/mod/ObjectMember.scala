package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ObjectMethod_
  - typingsSlinky.babelTypes.mod.ObjectProperty_
*/
trait ObjectMember extends Node

object ObjectMember {
  @scala.inline
  implicit def apply(value: ObjectMethod_): ObjectMember = value.asInstanceOf[ObjectMember]
  @scala.inline
  implicit def apply(value: ObjectProperty_): ObjectMember = value.asInstanceOf[ObjectMember]
}

