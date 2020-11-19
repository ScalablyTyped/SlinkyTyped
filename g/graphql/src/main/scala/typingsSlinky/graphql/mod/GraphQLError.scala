package typingsSlinky.graphql.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLError")
@js.native
class GraphQLError protected ()
  extends typingsSlinky.graphql.errorMod.GraphQLError {
  def this(
    message: String,
    nodes: js.UndefOr[Maybe[js.Array[ASTNode] | ASTNode]],
    source: js.UndefOr[Maybe[typingsSlinky.graphql.sourceMod.Source]],
    positions: js.UndefOr[Maybe[js.Array[Double]]],
    path: js.UndefOr[Maybe[js.Array[String | Double]]],
    originalError: js.UndefOr[Maybe[js.Error]],
    extensions: js.UndefOr[Maybe[StringDictionary[_]]]
  ) = this()
}
