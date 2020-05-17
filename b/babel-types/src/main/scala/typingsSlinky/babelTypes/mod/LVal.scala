package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.Identifier_
  - typingsSlinky.babelTypes.mod.MemberExpression_
  - typingsSlinky.babelTypes.mod.RestElement_
  - typingsSlinky.babelTypes.mod.AssignmentPattern_
  - typingsSlinky.babelTypes.mod.ArrayPattern_
  - typingsSlinky.babelTypes.mod.ObjectPattern_
  - typingsSlinky.babelTypes.mod.TSParameterProperty
*/
trait LVal extends js.Object

object LVal {
  @scala.inline
  implicit def apply(value: ArrayPattern_): LVal = value.asInstanceOf[LVal]
  @scala.inline
  implicit def apply(value: AssignmentPattern_): LVal = value.asInstanceOf[LVal]
  @scala.inline
  implicit def apply(value: Identifier_): LVal = value.asInstanceOf[LVal]
  @scala.inline
  implicit def apply(value: MemberExpression_): LVal = value.asInstanceOf[LVal]
  @scala.inline
  implicit def apply(value: ObjectPattern_): LVal = value.asInstanceOf[LVal]
  @scala.inline
  implicit def apply(value: RestElement_): LVal = value.asInstanceOf[LVal]
  @scala.inline
  implicit def apply(value: TSParameterProperty): LVal = value.asInstanceOf[LVal]
}

