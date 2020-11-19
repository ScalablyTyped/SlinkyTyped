package typingsSlinky.graphqlToolsUtils.interfacesMod

import typingsSlinky.graphql.astMod.InputObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputObjectTypeResolver extends js.Object {
  
  var __astNode: js.UndefOr[InputObjectTypeDefinitionNode] = js.native
  
  var __description: js.UndefOr[String] = js.native
  
  var __extensionASTNodes: js.UndefOr[js.Array[InputObjectTypeExtensionNode]] = js.native
  
  var __extensions: js.UndefOr[Record[String, _]] = js.native
  
  var __name: js.UndefOr[String] = js.native
}
object IInputObjectTypeResolver {
  
  @scala.inline
  def apply(): IInputObjectTypeResolver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputObjectTypeResolver]
  }
  
  @scala.inline
  implicit class IInputObjectTypeResolverOps[Self <: IInputObjectTypeResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__astNode(value: InputObjectTypeDefinitionNode): Self = this.set("__astNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__astNode: Self = this.set("__astNode", js.undefined)
    
    @scala.inline
    def set__description(value: String): Self = this.set("__description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__description: Self = this.set("__description", js.undefined)
    
    @scala.inline
    def set__extensionASTNodesVarargs(value: InputObjectTypeExtensionNode*): Self = this.set("__extensionASTNodes", js.Array(value :_*))
    
    @scala.inline
    def set__extensionASTNodes(value: js.Array[InputObjectTypeExtensionNode]): Self = this.set("__extensionASTNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__extensionASTNodes: Self = this.set("__extensionASTNodes", js.undefined)
    
    @scala.inline
    def set__extensions(value: Record[String, _]): Self = this.set("__extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__extensions: Self = this.set("__extensions", js.undefined)
    
    @scala.inline
    def set__name(value: String): Self = this.set("__name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__name: Self = this.set("__name", js.undefined)
  }
}
