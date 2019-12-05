package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.utilitiesSchemaPrinterMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "printSchema")
@js.native
object printSchema extends js.Object {
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema): String = js.native
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, options: Options): String = js.native
}

