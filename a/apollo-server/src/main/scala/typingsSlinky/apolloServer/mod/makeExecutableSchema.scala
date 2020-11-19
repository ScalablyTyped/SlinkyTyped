package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsSchema.typesMod.IExecutableSchemaDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "makeExecutableSchema")
@js.native
object makeExecutableSchema extends js.Object {
  
  def apply[TContext](
    hasTypeDefsResolversLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesSchemaTransformsParseOptionsInheritResolversFromInterfacesPruningOptions: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
}
