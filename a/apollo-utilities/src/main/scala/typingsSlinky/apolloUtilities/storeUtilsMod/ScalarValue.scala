package typingsSlinky.apolloUtilities.storeUtilsMod

import typingsSlinky.graphql.astMod.BooleanValueNode
import typingsSlinky.graphql.astMod.EnumValueNode
import typingsSlinky.graphql.astMod.StringValueNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.StringValueNode
  - typingsSlinky.graphql.astMod.BooleanValueNode
  - typingsSlinky.graphql.astMod.EnumValueNode
*/
trait ScalarValue extends js.Object

object ScalarValue {
  @scala.inline
  implicit def apply(value: BooleanValueNode): ScalarValue = value.asInstanceOf[ScalarValue]
  @scala.inline
  implicit def apply(value: EnumValueNode): ScalarValue = value.asInstanceOf[ScalarValue]
  @scala.inline
  implicit def apply(value: StringValueNode): ScalarValue = value.asInstanceOf[ScalarValue]
}

