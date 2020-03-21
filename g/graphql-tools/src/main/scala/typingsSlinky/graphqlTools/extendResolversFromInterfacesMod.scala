package typingsSlinky.graphqlTools

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlTools.interfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/extendResolversFromInterfaces", JSImport.Namespace)
@js.native
object extendResolversFromInterfacesMod extends js.Object {
  def default(schema: GraphQLSchema, resolvers: IResolvers[_, _]): IResolvers[_, _] = js.native
}

