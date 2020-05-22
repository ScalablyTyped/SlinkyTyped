package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.BooleanValue
import typingsSlinky.graphql.graphqlStrings.EnumValue
import typingsSlinky.graphql.graphqlStrings.FloatValue
import typingsSlinky.graphql.graphqlStrings.IntValue
import typingsSlinky.graphql.graphqlStrings.ListValue
import typingsSlinky.graphql.graphqlStrings.NullValue
import typingsSlinky.graphql.graphqlStrings.ObjectValue
import typingsSlinky.graphql.graphqlStrings.StringValue
import typingsSlinky.graphql.graphqlStrings.Variable
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
  def StringValueNode(kind: StringValue, value: String, block: js.UndefOr[Boolean] = js.undefined, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.get.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def EnumValueNode(kind: EnumValue, value: String, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ObjectValueNode(fields: js.Array[ObjectFieldNode], kind: ObjectValue, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def BooleanValueNode(kind: BooleanValue, value: Boolean, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ListValueNode(kind: ListValue, values: js.Array[ValueNode], loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def IntValueNode(kind: IntValue, value: String, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def NullValueNode(kind: NullValue, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def FloatValueNode(kind: FloatValue, value: String, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def VariableNode(kind: Variable, name: NameNode, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}

