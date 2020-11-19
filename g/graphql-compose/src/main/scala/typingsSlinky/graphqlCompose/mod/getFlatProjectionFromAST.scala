package typingsSlinky.graphqlCompose.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose", "getFlatProjectionFromAST")
@js.native
object getFlatProjectionFromAST extends js.Object {
  
  def apply(info: GraphQLResolveInfo): StringDictionary[Boolean] = js.native
  def apply(info: GraphQLResolveInfo, fieldNodes: FieldNode): StringDictionary[Boolean] = js.native
  def apply(info: GraphQLResolveInfo, fieldNodes: FragmentDefinitionNode): StringDictionary[Boolean] = js.native
  def apply(info: GraphQLResolveInfo, fieldNodes: InlineFragmentNode): StringDictionary[Boolean] = js.native
}
