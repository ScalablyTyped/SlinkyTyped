package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.utilitiesBuildClientSchemaMod.Options
import typingsSlinky.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildClientSchema")
@js.native
object buildClientSchema extends js.Object {
  def apply(introspection: IntrospectionQuery): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(introspection: IntrospectionQuery, options: Options): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
}

