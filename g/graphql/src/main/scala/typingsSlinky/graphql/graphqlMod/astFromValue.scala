package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageAstMod.ValueNode
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "astFromValue")
@js.native
object astFromValue extends js.Object {
  def apply(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
}

