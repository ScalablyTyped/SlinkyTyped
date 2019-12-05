package typingsSlinky.apolloDashServer.apolloDashServerMod

import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.graphqlDashTools.distInterfacesMod.IAddResolveFunctionsToSchemaOptions
import typingsSlinky.graphqlDashTools.distInterfacesMod.IResolverValidationOptions
import typingsSlinky.graphqlDashTools.distInterfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "addResolveFunctionsToSchema")
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

