package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.utilitiesIntrospectionQueryMod.IntrospectionOptions
import typingsSlinky.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "introspectionFromSchema")
@js.native
object introspectionFromSchema extends js.Object {
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema): IntrospectionQuery = js.native
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
}

