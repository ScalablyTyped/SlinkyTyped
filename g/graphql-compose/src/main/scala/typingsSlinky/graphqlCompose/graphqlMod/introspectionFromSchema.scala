package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionOptions
import typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "introspectionFromSchema")
@js.native
object introspectionFromSchema extends js.Object {
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema): IntrospectionQuery = js.native
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
}

