package typingsSlinky.relayDashCompiler

import typingsSlinky.graphql.typeDefinitionMod.GraphQLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/GraphQLSchemaUtils", JSImport.Namespace)
@js.native
object libCoreGraphQLSchemaUtilsMod extends js.Object {
  def isAbstractType(`type`: GraphQLType): Boolean = js.native
}

