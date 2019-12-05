package typingsSlinky.relayDashCompiler

import typingsSlinky.graphql.graphqlMod.GraphQLError
import typingsSlinky.graphql.languageAstMod.ASTNode
import typingsSlinky.relayDashCompiler.libCoreGraphQLIRMod.Location
import typingsSlinky.relayDashCompiler.libCoreRelayCompilerErrorMod.UserError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/core/RelayCompilerError", JSImport.Namespace)
@js.native
object libCoreRelayCompilerErrorMod extends js.Object {
  def createUserError(message: String): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location]): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location], nodes: js.Array[ASTNode]): UserError = js.native
  type UserError = GraphQLError
}

