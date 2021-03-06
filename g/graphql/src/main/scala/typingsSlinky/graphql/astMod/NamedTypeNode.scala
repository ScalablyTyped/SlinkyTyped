package typingsSlinky.graphql.astMod

import typingsSlinky.graphql.graphqlStrings.NamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedTypeNode
  extends ASTNode
     with TypeNode {
  
  val kind: NamedType = js.native
  
  val loc: js.UndefOr[Location] = js.native
  
  val name: NameNode = js.native
}
object NamedTypeNode {
  
  @scala.inline
  def apply(kind: NamedType, name: NameNode): NamedTypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedTypeNode]
  }
  
  @scala.inline
  implicit class NamedTypeNodeOps[Self <: NamedTypeNode] (val x: Self) extends AnyVal {
    
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
    def setKind(value: NamedType): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
}
