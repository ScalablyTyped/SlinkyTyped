package typingsSlinky.graphqlToolsSchema

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/extendResolversFromInterfaces", JSImport.Namespace)
@js.native
object extendResolversFromInterfacesMod extends js.Object {
  def extendResolversFromInterfaces(schema: GraphQLSchema, resolvers: IResolvers[_, _, Record[String, _], _]): IResolvers[_, _, Record[String, _], _] = js.native
}

