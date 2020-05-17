package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://docs.mongodb.com/manual/reference/operator/query-bitwise */
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.bson.mod.Binary
  - js.Array[scala.Double]
*/
trait BitwiseQuery extends js.Object

object BitwiseQuery {
  @scala.inline
  implicit def apply(value: js.Array[scala.Double]): BitwiseQuery = value.asInstanceOf[BitwiseQuery]
  @scala.inline
  implicit def apply(value: typingsSlinky.bson.mod.Binary): BitwiseQuery = value.asInstanceOf[BitwiseQuery]
  @scala.inline
  implicit def apply(value: scala.Double): BitwiseQuery = value.asInstanceOf[BitwiseQuery]
}

