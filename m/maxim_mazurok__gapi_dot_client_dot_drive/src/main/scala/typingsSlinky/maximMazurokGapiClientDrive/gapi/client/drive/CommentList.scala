package typingsSlinky.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentList extends StObject {
  
  /** The list of comments. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var comments: js.UndefOr[js.Array[Comment]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#commentList". */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The page token for the next page of comments. This will be absent if the end of the comments list has been reached. If the token is rejected for any reason, it should be discarded,
    * and pagination should be restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object CommentList {
  
  @scala.inline
  def apply(): CommentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentList]
  }
  
  @scala.inline
  implicit class CommentListMutableBuilder[Self <: CommentList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
