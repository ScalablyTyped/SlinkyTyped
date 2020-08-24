package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsSchema.typesMod.IExecutableSchemaDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "makeExecutableSchema")
@js.native
object makeExecutableSchema extends js.Object {
  def apply[TContext](
    hasTypeDefsResolversLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesSchemaTransformsParseOptionsInheritResolversFromInterfacesPruningOptions: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
}

