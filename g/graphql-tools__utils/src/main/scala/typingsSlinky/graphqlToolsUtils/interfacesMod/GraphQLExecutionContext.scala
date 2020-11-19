package typingsSlinky.graphqlToolsUtils.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLExecutionContext extends js.Object {
  
  var contextValue: js.Any = js.native
  
  var errors: js.Array[GraphQLError] = js.native
  
  def fieldResolver(source: js.Any, args: StringDictionary[js.Any], context: js.Any, info: GraphQLResolveInfo): js.Any = js.native
  @JSName("fieldResolver")
  var fieldResolver_Original: GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  
  var fragments: Record[String, FragmentDefinitionNode] = js.native
  
  var operation: OperationDefinitionNode = js.native
  
  var rootValue: js.Any = js.native
  
  var schema: GraphQLSchema = js.native
  
  var variableValues: Record[String, _] = js.native
}
