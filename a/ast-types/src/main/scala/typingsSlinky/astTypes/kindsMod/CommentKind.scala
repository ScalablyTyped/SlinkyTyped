package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Block
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Line
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine
*/
trait CommentKind extends StObject
object CommentKind {
  
  @scala.inline
  def Block(`type`: typingsSlinky.astTypes.astTypesStrings.Block, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.Block = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Block]
  }
  
  @scala.inline
  def CommentBlock(`type`: typingsSlinky.astTypes.astTypesStrings.CommentBlock, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentBlock]
  }
  
  @scala.inline
  def CommentLine(`type`: typingsSlinky.astTypes.astTypesStrings.CommentLine, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.CommentLine]
  }
  
  @scala.inline
  def Line(`type`: typingsSlinky.astTypes.astTypesStrings.Line, value: String): typingsSlinky.astTypes.namedTypesMod.namedTypes.Line = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Line]
  }
}
