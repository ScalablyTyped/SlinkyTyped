package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.DoWhileStatement_
  - typingsSlinky.babelTypes.mod.ForInStatement_
  - typingsSlinky.babelTypes.mod.ForStatement_
  - typingsSlinky.babelTypes.mod.WhileStatement_
  - typingsSlinky.babelTypes.mod.ForOfStatement_
*/
trait Loop extends Node

object Loop {
  @scala.inline
  implicit def apply(value: DoWhileStatement_): Loop = value.asInstanceOf[Loop]
  @scala.inline
  implicit def apply(value: ForInStatement_): Loop = value.asInstanceOf[Loop]
  @scala.inline
  implicit def apply(value: ForOfStatement_): Loop = value.asInstanceOf[Loop]
  @scala.inline
  implicit def apply(value: ForStatement_): Loop = value.asInstanceOf[Loop]
  @scala.inline
  implicit def apply(value: WhileStatement_): Loop = value.asInstanceOf[Loop]
}

