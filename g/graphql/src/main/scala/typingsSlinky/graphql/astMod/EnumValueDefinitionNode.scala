package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.EnumValueDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValueDefinitionNode extends ASTNode {
  
  val description: js.UndefOr[StringValueNode] = js.native
  
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  
  val kind: EnumValueDefinition = js.native
  
  val loc: js.UndefOr[Location] = js.native
  
  val name: NameNode = js.native
}
object EnumValueDefinitionNode {
  
  @scala.inline
  def apply(kind: EnumValueDefinition, name: NameNode): EnumValueDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValueDefinitionNode]
  }
  
  @scala.inline
  implicit class EnumValueDefinitionNodeOps[Self <: EnumValueDefinitionNode] (val x: Self) extends AnyVal {
    
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
    def setKind(value: EnumValueDefinition): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: StringValueNode): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: DirectiveNode*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[DirectiveNode]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
}
