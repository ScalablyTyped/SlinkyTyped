package typingsSlinky.graphql

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/getOperationAST", JSImport.Namespace)
@js.native
object getOperationASTMod extends js.Object {
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
}

