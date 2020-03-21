package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.IAddResolveFunctionsToSchemaOptions
import typingsSlinky.graphqlTools.interfacesMod.IResolverValidationOptions
import typingsSlinky.graphqlTools.interfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "addResolveFunctionsToSchema")
@js.native
object addResolveFunctionsToSchema extends js.Object {
  def apply(options: GraphQLSchema): GraphQLSchema = js.native
  def apply(options: GraphQLSchema, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def apply(
    options: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def apply(options: IAddResolveFunctionsToSchemaOptions): GraphQLSchema = js.native
  def apply(options: IAddResolveFunctionsToSchemaOptions, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def apply(
    options: IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
}

