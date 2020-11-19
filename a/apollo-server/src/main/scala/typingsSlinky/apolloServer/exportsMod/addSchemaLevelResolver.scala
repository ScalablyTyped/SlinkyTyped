package typingsSlinky.apolloServer.exportsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "addSchemaLevelResolver")
@js.native
object addSchemaLevelResolver extends js.Object {
  
  def apply(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): GraphQLSchema = js.native
}
