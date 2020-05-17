package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ObjectMethod_
  - typingsSlinky.babelTypes.mod.ClassMethod_
  - typingsSlinky.babelTypes.mod.ClassPrivateMethod_
*/
trait Method extends Node

object Method {
  @scala.inline
  implicit def apply(value: ClassMethod_): Method = value.asInstanceOf[Method]
  @scala.inline
  implicit def apply(value: ClassPrivateMethod_): Method = value.asInstanceOf[Method]
  @scala.inline
  implicit def apply(value: ObjectMethod_): Method = value.asInstanceOf[Method]
}

