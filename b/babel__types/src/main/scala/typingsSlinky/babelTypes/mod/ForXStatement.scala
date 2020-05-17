package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ForInStatement_
  - typingsSlinky.babelTypes.mod.ForOfStatement_
*/
trait ForXStatement extends Node

object ForXStatement {
  @scala.inline
  implicit def apply(value: ForInStatement_): ForXStatement = value.asInstanceOf[ForXStatement]
  @scala.inline
  implicit def apply(value: ForOfStatement_): ForXStatement = value.asInstanceOf[ForXStatement]
}

