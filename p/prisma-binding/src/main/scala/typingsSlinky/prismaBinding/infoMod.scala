package typingsSlinky.prismaBinding

import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/info", JSImport.Namespace)
@js.native
object infoMod extends js.Object {
  def buildExistsInfo(rootFieldName: String, schema: GraphQLSchema): GraphQLResolveInfo = js.native
}

