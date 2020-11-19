package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.ListType
import typingsSlinky.graphql.graphqlStrings.NamedType
import typingsSlinky.graphql.graphqlStrings.NonNullType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.NamedTypeNode
  - typingsSlinky.graphql.astMod.ListTypeNode
  - typingsSlinky.graphql.astMod.NonNullTypeNode
*/
trait TypeNode extends js.Object
object TypeNode {
  
  @scala.inline
  def NamedTypeNode(kind: NamedType, name: NameNode): TypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeNode]
  }
  
  @scala.inline
  def ListTypeNode(kind: ListType, `type`: TypeNode): TypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeNode]
  }
  
  @scala.inline
  def NonNullTypeNode(kind: NonNullType, `type`: NamedTypeNode | ListTypeNode): TypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeNode]
  }
}
