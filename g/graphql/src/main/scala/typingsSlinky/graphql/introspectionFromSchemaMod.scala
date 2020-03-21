package typingsSlinky.graphql

import typingsSlinky.graphql.introspectionQueryMod.IntrospectionOptions
import typingsSlinky.graphql.introspectionQueryMod.IntrospectionQuery_
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/introspectionFromSchema", JSImport.Namespace)
@js.native
object introspectionFromSchemaMod extends js.Object {
  def introspectionFromSchema(schema: GraphQLSchema): IntrospectionQuery_ = js.native
  def introspectionFromSchema(schema: GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery_ = js.native
}

