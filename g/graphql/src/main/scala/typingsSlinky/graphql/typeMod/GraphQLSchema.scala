package typingsSlinky.graphql.typeMod

import typingsSlinky.graphql.anon.ReadonlyGraphQLSchemaConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/type", "GraphQLSchema")
@js.native
class GraphQLSchema protected ()
  extends typingsSlinky.graphql.schemaMod.GraphQLSchema {
  def this(config: ReadonlyGraphQLSchemaConf) = this()
}
