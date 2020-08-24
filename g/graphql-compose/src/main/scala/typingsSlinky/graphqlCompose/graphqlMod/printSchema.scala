package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.printSchemaMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "printSchema")
@js.native
object printSchema extends js.Object {
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema): String = js.native
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, options: Options): String = js.native
}

