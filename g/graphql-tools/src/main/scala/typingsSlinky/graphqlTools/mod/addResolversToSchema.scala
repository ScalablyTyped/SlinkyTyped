package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.IAddResolversToSchemaOptions
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "addResolversToSchema")
@js.native
object addResolversToSchema extends js.Object {
  def apply(schemaOrOptions: GraphQLSchema): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: GraphQLSchema,
    legacyInputResolvers: js.UndefOr[scala.Nothing],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def apply(schemaOrOptions: GraphQLSchema, legacyInputResolvers: IResolvers[_, _, Record[String, _], _]): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def apply(schemaOrOptions: IAddResolversToSchemaOptions): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: js.UndefOr[scala.Nothing],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _]
  ): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
}

