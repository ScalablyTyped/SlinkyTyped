package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsSlinky.astTypes.kindsMod.ClassPropertyKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.MethodDefinitionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.VariableDeclaratorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Definition extends js.Object {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object Definition {
  
  @scala.inline
  def apply(
    definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind
  ): Definition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
    
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
    def setDefinition(
      value: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind
    ): Self = this.set("definition", value.asInstanceOf[js.Any])
    
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
  }
}
