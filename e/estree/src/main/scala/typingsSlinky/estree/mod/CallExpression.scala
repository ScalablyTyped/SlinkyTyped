package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.SimpleCallExpression
  - typingsSlinky.estree.mod.NewExpression
*/
trait CallExpression extends Expression

object CallExpression {
  @scala.inline
  implicit def apply(value: NewExpression): CallExpression = value.asInstanceOf[CallExpression]
  @scala.inline
  implicit def apply(value: SimpleCallExpression): CallExpression = value.asInstanceOf[CallExpression]
}

