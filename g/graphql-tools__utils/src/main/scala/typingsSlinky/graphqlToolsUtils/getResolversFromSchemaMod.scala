package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/getResolversFromSchema", JSImport.Namespace)
@js.native
object getResolversFromSchemaMod extends js.Object {
  def getResolversFromSchema(schema: GraphQLSchema): IResolvers[_, _, Record[String, _], _] = js.native
}

