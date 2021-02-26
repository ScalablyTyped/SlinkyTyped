package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCommentReactionsInput extends StObject {
  
  /**
    * The ID of the comment for which you want to get reactions information.
    */
  var commentId: CommentId = js.native
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results. The default is the same as the allowed maximum, 1,000.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction information.
    */
  var reactionUserArn: js.UndefOr[Arn] = js.native
}
object GetCommentReactionsInput {
  
  @scala.inline
  def apply(commentId: CommentId): GetCommentReactionsInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentReactionsInput]
  }
  
  @scala.inline
  implicit class GetCommentReactionsInputMutableBuilder[Self <: GetCommentReactionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentId(value: CommentId): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReactionUserArn(value: Arn): Self = StObject.set(x, "reactionUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionUserArnUndefined: Self = StObject.set(x, "reactionUserArn", js.undefined)
  }
}
