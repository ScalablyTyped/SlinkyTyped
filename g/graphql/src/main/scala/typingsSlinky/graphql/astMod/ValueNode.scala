package typingsSlinky.graphql.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.VariableNode
  - typingsSlinky.graphql.astMod.IntValueNode
  - typingsSlinky.graphql.astMod.FloatValueNode
  - typingsSlinky.graphql.astMod.StringValueNode
  - typingsSlinky.graphql.astMod.BooleanValueNode
  - typingsSlinky.graphql.astMod.NullValueNode
  - typingsSlinky.graphql.astMod.EnumValueNode
  - typingsSlinky.graphql.astMod.ListValueNode
  - typingsSlinky.graphql.astMod.ObjectValueNode
*/
trait ValueNode extends js.Object

object ValueNode {
  @scala.inline
  implicit def apply(value: BooleanValueNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: EnumValueNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: FloatValueNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: IntValueNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: ListValueNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: NullValueNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: ObjectValueNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: StringValueNode): ValueNode = value.asInstanceOf[ValueNode]
  @scala.inline
  implicit def apply(value: VariableNode): ValueNode = value.asInstanceOf[ValueNode]
}

