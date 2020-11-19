package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/graphql", "getOperationAST")
@js.native
object getOperationAST extends js.Object {
  
  def apply(documentAST: DocumentNode): Maybe[OperationDefinitionNode] = js.native
  def apply(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
}
