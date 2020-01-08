package typingsSlinky.graphql

import typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
import typingsSlinky.graphql.typeSchemaMod.GraphQLSchemaValidationOptions
import typingsSlinky.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildClientSchema", JSImport.Namespace)
@js.native
object utilitiesBuildClientSchemaMod extends js.Object {
  def buildClientSchema(introspection: IntrospectionQuery): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery, options: Options): GraphQLSchema = js.native
  type Options = GraphQLSchemaValidationOptions
}

