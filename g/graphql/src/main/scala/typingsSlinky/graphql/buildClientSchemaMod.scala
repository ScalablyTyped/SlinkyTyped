package typingsSlinky.graphql

import typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionQuery
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import typingsSlinky.graphql.schemaMod.GraphQLSchemaValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/utilities/buildClientSchema", JSImport.Namespace)
@js.native
object buildClientSchemaMod extends js.Object {
  
  def buildClientSchema(introspection: IntrospectionQuery): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery, options: GraphQLSchemaValidationOptions): GraphQLSchema = js.native
}
