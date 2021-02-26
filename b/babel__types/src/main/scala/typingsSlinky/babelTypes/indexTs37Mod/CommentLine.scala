package typingsSlinky.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentLine
  extends BaseComment
     with Comment {
  
  @JSName("type")
  var type_CommentLine: typingsSlinky.babelTypes.babelTypesStrings.CommentLine = js.native
}
object CommentLine {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsSlinky.babelTypes.babelTypesStrings.CommentLine,
    value: String
  ): CommentLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentLine]
  }
  
  @scala.inline
  implicit class CommentLineMutableBuilder[Self <: CommentLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.CommentLine): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
