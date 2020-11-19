package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.InterfaceTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceTypeExtensionNode
  extends TypeExtensionNode
     with ASTNode {
  
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  
  val fields: js.UndefOr[js.Array[FieldDefinitionNode]] = js.native
  
  val interfaces: js.UndefOr[js.Array[NamedTypeNode]] = js.native
  
  val kind: InterfaceTypeExtension = js.native
  
  val loc: js.UndefOr[Location] = js.native
  
  val name: NameNode = js.native
}
object InterfaceTypeExtensionNode {
  
  @scala.inline
  def apply(kind: InterfaceTypeExtension, name: NameNode): InterfaceTypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeExtensionNode]
  }
  
  @scala.inline
  implicit class InterfaceTypeExtensionNodeOps[Self <: InterfaceTypeExtensionNode] (val x: Self) extends AnyVal {
    
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
    def setKind(value: InterfaceTypeExtension): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: DirectiveNode*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[DirectiveNode]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FieldDefinitionNode*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[FieldDefinitionNode]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setInterfacesVarargs(value: NamedTypeNode*): Self = this.set("interfaces", js.Array(value :_*))
    
    @scala.inline
    def setInterfaces(value: js.Array[NamedTypeNode]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaces: Self = this.set("interfaces", js.undefined)
    
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
}
