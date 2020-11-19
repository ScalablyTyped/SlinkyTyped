package typingsSlinky.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.CommentBlock
  - typingsSlinky.babelTypes.mod.CommentLine
*/
trait Comment extends js.Object
object Comment {
  
  @scala.inline
  def CommentBlock(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsSlinky.babelTypes.babelTypesStrings.CommentBlock,
    value: String
  ): Comment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  def CommentLine(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsSlinky.babelTypes.babelTypesStrings.CommentLine,
    value: String
  ): Comment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}
