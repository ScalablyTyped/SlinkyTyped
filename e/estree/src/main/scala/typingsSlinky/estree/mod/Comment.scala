package typingsSlinky.estree.mod

import typingsSlinky.estree.estreeStrings.Block
import typingsSlinky.estree.estreeStrings.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends BaseNodeWithoutComments {
  
  @JSName("type")
  var type_Comment: Line | Block = js.native
  
  var value: String = js.native
}
object Comment {
  
  @scala.inline
  def apply(`type`: Line | Block, value: String): Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Line | Block): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
