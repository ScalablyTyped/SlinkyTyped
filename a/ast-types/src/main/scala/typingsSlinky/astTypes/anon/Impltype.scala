package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impltype extends js.Object {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var id: IdentifierKind = js.native
  
  var impltype: FlowTypeKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var supertype: FlowTypeKind | Null = js.native
  
  var typeParameters: TypeParameterDeclarationKind | Null = js.native
}
object Impltype {
  
  @scala.inline
  def apply(id: IdentifierKind, impltype: FlowTypeKind): Impltype = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impltype]
  }
  
  @scala.inline
  implicit class ImpltypeOps[Self <: Impltype] (val x: Self) extends AnyVal {
    
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
    def setId(value: IdentifierKind): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpltype(value: FlowTypeKind): Self = this.set("impltype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    
    @scala.inline
    def setLocNull: Self = this.set("loc", null)
    
    @scala.inline
    def setSupertype(value: FlowTypeKind): Self = this.set("supertype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertypeNull: Self = this.set("supertype", null)
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclarationKind): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
