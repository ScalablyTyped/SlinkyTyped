package typingsSlinky.graphqlToolsSchema

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.IAddResolversToSchemaOptions
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/schema/addResolversToSchema", JSImport.Namespace)
@js.native
object addResolversToSchemaMod extends js.Object {
  
  def addResolversToSchema(schemaOrOptions: GraphQLSchema): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: GraphQLSchema,
    legacyInputResolvers: js.UndefOr[scala.Nothing],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolversToSchema(schemaOrOptions: GraphQLSchema, legacyInputResolvers: IResolvers[_, _, Record[String, _], _]): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolversToSchema(schemaOrOptions: IAddResolversToSchemaOptions): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: js.UndefOr[scala.Nothing],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _]
  ): GraphQLSchema = js.native
  def addResolversToSchema(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
}
