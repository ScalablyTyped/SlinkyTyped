package typingsSlinky.graphql.mod

import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.coerceValueMod.CoercedValue
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "coerceValue")
@js.native
object coerceValue extends js.Object {
  def apply(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def apply(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def apply(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
}

