package typingsSlinky.graphql

import typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
import typingsSlinky.graphql.utilitiesIntrospectionQueryMod.IntrospectionOptions
import typingsSlinky.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/introspectionFromSchema", JSImport.Namespace)
@js.native
object utilitiesIntrospectionFromSchemaMod extends js.Object {
  def introspectionFromSchema(schema: GraphQLSchema): IntrospectionQuery = js.native
  def introspectionFromSchema(schema: GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
}

