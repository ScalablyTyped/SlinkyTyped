package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.kindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arguments extends js.Object {
  
  var arguments: js.Array[ExpressionKind | SpreadElementKind] = js.native
  
  var callee: ExpressionKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.native
}
object Arguments {
  
  @scala.inline
  def apply(arguments: js.Array[ExpressionKind | SpreadElementKind], callee: ExpressionKind): Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  
  @scala.inline
  implicit class ArgumentsOps[Self <: Arguments] (val x: Self) extends AnyVal {
    
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
    def setArgumentsVarargs(value: (ExpressionKind | SpreadElementKind)*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[ExpressionKind | SpreadElementKind]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallee(value: ExpressionKind): Self = this.set("callee", value.asInstanceOf[js.Any])
    
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
    def setTypeArguments(value: TypeParameterInstantiationKind): Self = this.set("typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeArguments: Self = this.set("typeArguments", js.undefined)
    
    @scala.inline
    def setTypeArgumentsNull: Self = this.set("typeArguments", null)
  }
}
