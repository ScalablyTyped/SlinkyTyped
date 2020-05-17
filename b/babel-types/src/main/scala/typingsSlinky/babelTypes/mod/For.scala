package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ForInStatement_
  - typingsSlinky.babelTypes.mod.ForStatement_
  - typingsSlinky.babelTypes.mod.ForOfStatement_
*/
trait For extends js.Object

object For {
  @scala.inline
  implicit def apply(value: ForInStatement_): For = value.asInstanceOf[For]
  @scala.inline
  implicit def apply(value: ForOfStatement_): For = value.asInstanceOf[For]
  @scala.inline
  implicit def apply(value: ForStatement_): For = value.asInstanceOf[For]
}

