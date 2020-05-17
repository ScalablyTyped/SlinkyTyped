package typingsSlinky.apolloUtilities.storeUtilsMod

import typingsSlinky.graphql.astMod.FloatValueNode
import typingsSlinky.graphql.astMod.IntValueNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.IntValueNode
  - typingsSlinky.graphql.astMod.FloatValueNode
*/
trait NumberValue extends js.Object

object NumberValue {
  @scala.inline
  implicit def apply(value: FloatValueNode): NumberValue = value.asInstanceOf[NumberValue]
  @scala.inline
  implicit def apply(value: IntValueNode): NumberValue = value.asInstanceOf[NumberValue]
}

