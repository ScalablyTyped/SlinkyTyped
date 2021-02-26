package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.anon.Flags
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> */
@js.native
trait StringLiteral
  extends ASTNode
     with ExpressionKind
     with LiteralKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var regex: js.UndefOr[Flags | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.StringLiteral = js.native
  
  var value: String = js.native
}
object StringLiteral {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.StringLiteral")
  @js.native
  val ^ : Type[StringLiteral] = js.native
  
  @scala.inline
  implicit class StringLiteralMutableBuilder[Self <: StringLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setRegex(value: Flags): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexNull: Self = StObject.set(x, "regex", null)
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
