package typingsSlinky.apolloGraphql

import typingsSlinky.graphql.astMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-graphql/lib/utilities/graphql", JSImport.Namespace)
@js.native
object graphqlMod extends js.Object {
  
  def isDocumentNode(node: ASTNode): /* is graphql.graphql/language/ast.DocumentNode */ Boolean = js.native
  
  def isNode(maybeNode: js.Any): /* is graphql.graphql/language/ast.ASTNode */ Boolean = js.native
}
