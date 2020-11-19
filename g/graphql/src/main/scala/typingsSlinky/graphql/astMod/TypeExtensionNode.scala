package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.EnumTypeExtension
import typingsSlinky.graphql.graphqlStrings.InputObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.InterfaceTypeExtension
import typingsSlinky.graphql.graphqlStrings.ObjectTypeExtension
import typingsSlinky.graphql.graphqlStrings.ScalarTypeExtension
import typingsSlinky.graphql.graphqlStrings.UnionTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphql.astMod.ScalarTypeExtensionNode
  - typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
  - typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode
  - typingsSlinky.graphql.astMod.UnionTypeExtensionNode
  - typingsSlinky.graphql.astMod.EnumTypeExtensionNode
  - typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
*/
trait TypeExtensionNode extends TypeSystemExtensionNode
object TypeExtensionNode {
  
  @scala.inline
  def EnumTypeExtensionNode(kind: EnumTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  
  @scala.inline
  def UnionTypeExtensionNode(kind: UnionTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  
  @scala.inline
  def ObjectTypeExtensionNode(kind: ObjectTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  
  @scala.inline
  def ScalarTypeExtensionNode(kind: ScalarTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  
  @scala.inline
  def InputObjectTypeExtensionNode(kind: InputObjectTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
  
  @scala.inline
  def InterfaceTypeExtensionNode(kind: InterfaceTypeExtension, name: NameNode): TypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeExtensionNode]
  }
}
