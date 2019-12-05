package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.languageAstMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldConfigMap
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInterfaceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionASTNodesFields extends js.Object {
  var extensionASTNodes: js.Array[ObjectTypeExtensionNode]
  var fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]]
  var interfaces: js.Array[GraphQLInterfaceType]
}

object Anon_ExtensionASTNodesFields {
  @scala.inline
  def apply(
    extensionASTNodes: js.Array[ObjectTypeExtensionNode],
    fields: GraphQLFieldConfigMap[_, _, StringDictionary[_]],
    interfaces: js.Array[GraphQLInterfaceType]
  ): Anon_ExtensionASTNodesFields = {
    val __obj = js.Dynamic.literal(extensionASTNodes = extensionASTNodes.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExtensionASTNodesFields]
  }
}

