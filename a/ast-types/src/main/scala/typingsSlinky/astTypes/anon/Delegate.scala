package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delegate extends js.Object {
  
  var argument: ExpressionKind | Null = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var delegate: js.UndefOr[Boolean] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object Delegate {
  
  @scala.inline
  def apply(): Delegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delegate]
  }
  
  @scala.inline
  implicit class DelegateOps[Self <: Delegate] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: ExpressionKind): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentNull: Self = this.set("argument", null)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setDelegate(value: Boolean): Self = this.set("delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    
    @scala.inline
    def setLocNull: Self = this.set("loc", null)
  }
}
