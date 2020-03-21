package typingsSlinky.graphql.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLError")
@js.native
class GraphQLError protected ()
  extends typingsSlinky.graphql.errorMod.GraphQLError {
  def this(
    message: String,
    nodes: js.UndefOr[ASTNode | js.Array[ASTNode]],
    source: js.UndefOr[Maybe[typingsSlinky.graphql.sourceMod.Source]],
    positions: js.UndefOr[Maybe[js.Array[Double]]],
    path: js.UndefOr[Maybe[js.Array[Double | String]]],
    originalError: js.UndefOr[Maybe[js.Error]],
    extensions: js.UndefOr[Maybe[StringDictionary[_]]]
  ) = this()
}

