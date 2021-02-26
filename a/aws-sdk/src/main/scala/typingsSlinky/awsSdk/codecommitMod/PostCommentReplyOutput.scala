package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCommentReplyOutput extends StObject {
  
  /**
    * Information about the reply to a comment.
    */
  var comment: js.UndefOr[Comment] = js.native
}
object PostCommentReplyOutput {
  
  @scala.inline
  def apply(): PostCommentReplyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCommentReplyOutput]
  }
  
  @scala.inline
  implicit class PostCommentReplyOutputMutableBuilder[Self <: PostCommentReplyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
  }
}
