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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def StringValueNode(kind: StringValue, value: String): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def EnumValueNode(kind: EnumValue, value: String): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def ObjectValueNode(fields: js.Array[ObjectFieldNode], kind: ObjectValue): ValueNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def BooleanValueNode(kind: BooleanValue, value: Boolean): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def ListValueNode(kind: ListValue, values: js.Array[ValueNode]): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def IntValueNode(kind: IntValue, value: String): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def NullValueNode(kind: NullValue): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def FloatValueNode(kind: FloatValue, value: String): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  def VariableNode(kind: Variable, name: NameNode): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}
