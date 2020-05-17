package typingsSlinky.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.orientjs.mod.ORawExpression
  - typingsSlinky.orientjs.mod.OSqlFunction
*/
trait OSqlExpression extends js.Object

object OSqlExpression {
  @scala.inline
  implicit def apply(value: ORawExpression): OSqlExpression = value.asInstanceOf[OSqlExpression]
  @scala.inline
  implicit def apply(value: OSqlFunction): OSqlExpression = value.asInstanceOf[OSqlExpression]
  @scala.inline
  implicit def apply(value: String): OSqlExpression = value.asInstanceOf[OSqlExpression]
}

