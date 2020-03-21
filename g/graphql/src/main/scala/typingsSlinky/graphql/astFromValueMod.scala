package typingsSlinky.graphql

import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/astFromValue", JSImport.Namespace)
@js.native
object astFromValueMod extends js.Object {
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
}

