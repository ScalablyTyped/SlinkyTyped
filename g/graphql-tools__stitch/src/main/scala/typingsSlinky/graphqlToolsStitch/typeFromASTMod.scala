package typingsSlinky.graphqlToolsStitch

import typingsSlinky.graphql.astMod.DefinitionNode
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/stitch/typeFromAST", JSImport.Namespace)
@js.native
object typeFromASTMod extends js.Object {
  
  def default(node: DefinitionNode): GraphQLNamedType | GraphQLDirective | Null = js.native
  
  def getBlockStringIndentation(lines: js.Array[String]): Double = js.native
}
