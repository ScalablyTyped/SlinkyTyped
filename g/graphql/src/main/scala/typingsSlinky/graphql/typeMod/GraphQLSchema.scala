package typingsSlinky.graphql.typeMod

import typingsSlinky.graphql.schemaMod.GraphQLSchemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLSchema")
@js.native
class GraphQLSchema protected ()
  extends typingsSlinky.graphql.schemaMod.GraphQLSchema {
  def this(config: GraphQLSchemaConfig) = this()
}

