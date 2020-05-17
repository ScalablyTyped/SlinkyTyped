package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ClassPrivateProperty_
  - typingsSlinky.babelTypes.mod.ClassPrivateMethod_
  - typingsSlinky.babelTypes.mod.PrivateName_
*/
trait Private extends Node

object Private {
  @scala.inline
  implicit def apply(value: ClassPrivateMethod_): Private = value.asInstanceOf[Private]
  @scala.inline
  implicit def apply(value: ClassPrivateProperty_): Private = value.asInstanceOf[Private]
  @scala.inline
  implicit def apply(value: PrivateName_): Private = value.asInstanceOf[Private]
}

