package typingsSlinky.graphql.mod

import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "astFromValue")
@js.native
object astFromValue extends js.Object {
  def apply(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
}

