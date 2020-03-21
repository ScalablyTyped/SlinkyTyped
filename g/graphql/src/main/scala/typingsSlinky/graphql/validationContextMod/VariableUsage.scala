package typingsSlinky.graphql.validationContextMod

import typingsSlinky.graphql.astMod.VariableNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableUsage extends js.Object {
  val defaultValue: Maybe[_]
  val node: VariableNode
  val `type`: Maybe[GraphQLInputType]
}

object VariableUsage {
  @scala.inline
  def apply(node: VariableNode, defaultValue: Maybe[_] = null, `type`: Maybe[GraphQLInputType] = null): VariableUsage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableUsage]
  }
}

