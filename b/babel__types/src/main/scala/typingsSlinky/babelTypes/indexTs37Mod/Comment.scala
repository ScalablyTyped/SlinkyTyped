package typingsSlinky.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.CommentBlock
  - typingsSlinky.babelTypes.indexTs37Mod.CommentLine
*/
trait Comment extends StObject
object Comment {
  
  @scala.inline
  def CommentBlock(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsSlinky.babelTypes.babelTypesStrings.CommentBlock,
    value: String
  ): typingsSlinky.babelTypes.indexTs37Mod.CommentBlock = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.CommentBlock]
  }
  
  @scala.inline
  def CommentLine(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsSlinky.babelTypes.babelTypesStrings.CommentLine,
    value: String
  ): typingsSlinky.babelTypes.indexTs37Mod.CommentLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.CommentLine]
  }
}
