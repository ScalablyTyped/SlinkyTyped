package typingsSlinky.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.mathjs.mod.MathArray
  - typingsSlinky.mathjs.mod.Matrix
*/
trait MathExpression extends js.Object

object MathExpression {
  @scala.inline
  implicit def apply(value: js.Array[String] | MathArray): MathExpression = value.asInstanceOf[MathExpression]
  @scala.inline
  implicit def apply(value: Matrix): MathExpression = value.asInstanceOf[MathExpression]
  @scala.inline
  implicit def apply(value: String): MathExpression = value.asInstanceOf[MathExpression]
}

