package typingsSlinky.graphql.mod

import typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionQuery
import typingsSlinky.graphql.schemaMod.GraphQLSchemaValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "buildClientSchema")
@js.native
object buildClientSchema extends js.Object {
  
  def apply(introspection: IntrospectionQuery): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def apply(introspection: IntrospectionQuery, options: GraphQLSchemaValidationOptions): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
}
