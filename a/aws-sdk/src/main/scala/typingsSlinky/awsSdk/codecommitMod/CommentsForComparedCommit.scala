package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsForComparedCommit extends StObject {
  
  /**
    * The full blob ID of the commit used to establish the after of the comparison.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The full commit ID of the commit used to establish the after of the comparison.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * The full blob ID of the commit used to establish the before of the comparison.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The full commit ID of the commit used to establish the before of the comparison.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * An array of comment objects. Each comment object contains information about a comment on the comparison between commits.
    */
  var comments: js.UndefOr[Comments] = js.native
  
  /**
    * Location information about the comment on the comparison, including the file name, line number, and whether the version of the file where the comment was made is BEFORE or AFTER.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * The name of the repository that contains the compared commits.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object CommentsForComparedCommit {
  
  @scala.inline
  def apply(): CommentsForComparedCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsForComparedCommit]
  }
  
  @scala.inline
  implicit class CommentsForComparedCommitMutableBuilder[Self <: CommentsForComparedCommit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterBlobId(value: ObjectId): Self = StObject.set(x, "afterBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterBlobIdUndefined: Self = StObject.set(x, "afterBlobId", js.undefined)
    
    @scala.inline
    def setAfterCommitId(value: CommitId): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCommitIdUndefined: Self = StObject.set(x, "afterCommitId", js.undefined)
    
    @scala.inline
    def setBeforeBlobId(value: ObjectId): Self = StObject.set(x, "beforeBlobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeBlobIdUndefined: Self = StObject.set(x, "beforeBlobId", js.undefined)
    
    @scala.inline
    def setBeforeCommitId(value: CommitId): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
    
    @scala.inline
    def setComments(value: Comments): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
