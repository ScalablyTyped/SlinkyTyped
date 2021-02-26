package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SwitchCaseKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cases extends StObject {
  
  var cases: js.Array[SwitchCaseKind] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var discriminant: ExpressionKind = js.native
  
  var lexical: js.UndefOr[Boolean] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object Cases {
  
  @scala.inline
  def apply(cases: js.Array[SwitchCaseKind], discriminant: ExpressionKind): Cases = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cases]
  }
  
  @scala.inline
  implicit class CasesMutableBuilder[Self <: Cases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCases(value: js.Array[SwitchCaseKind]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCasesVarargs(value: SwitchCaseKind*): Self = StObject.set(x, "cases", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDiscriminant(value: ExpressionKind): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexical(value: Boolean): Self = StObject.set(x, "lexical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexicalUndefined: Self = StObject.set(x, "lexical", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
