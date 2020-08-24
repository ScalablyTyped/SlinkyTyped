package typingsSlinky.graphqlToolsMerge

import typingsSlinky.graphql.astMod.InterfaceTypeDefinitionNode
import typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode
import typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/typedefs-mergers/interface", JSImport.Namespace)
@js.native
object interfaceMod extends js.Object {
  def mergeInterface(node: InterfaceTypeDefinitionNode, existingNode: InterfaceTypeDefinitionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  def mergeInterface(node: InterfaceTypeDefinitionNode, existingNode: InterfaceTypeExtensionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  def mergeInterface(node: InterfaceTypeExtensionNode, existingNode: InterfaceTypeDefinitionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  def mergeInterface(node: InterfaceTypeExtensionNode, existingNode: InterfaceTypeExtensionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
}

