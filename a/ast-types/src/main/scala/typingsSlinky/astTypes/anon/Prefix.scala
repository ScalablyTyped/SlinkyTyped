package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.astTypesStrings.PlussignPlussign
import typingsSlinky.astTypes.astTypesStrings.`--`
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prefix extends js.Object {
  
  var argument: ExpressionKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var operator: PlussignPlussign | `--` = js.native
  
  var prefix: Boolean = js.native
}
object Prefix {
  
  @scala.inline
  def apply(argument: ExpressionKind, operator: PlussignPlussign | `--`, prefix: Boolean): Prefix = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
  
  @scala.inline
  implicit class PrefixOps[Self <: Prefix] (val x: Self) extends AnyVal {
    
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
    def setOperator(value: PlussignPlussign | `--`): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
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
