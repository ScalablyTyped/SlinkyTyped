package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCommentForComparedCommitOutput extends StObject {
  
  /**
    * In the directionality you established, the blob ID of the after blob.
    */
  var afterBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * In the directionality you established, the full commit ID of the after commit.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * In the directionality you established, the blob ID of the before blob.
    */
  var beforeBlobId: js.UndefOr[ObjectId] = js.native
  
  /**
    * In the directionality you established, the full commit ID of the before commit.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * The content of the comment you posted.
    */
  var comment: js.UndefOr[Comment] = js.native
  
  /**
    * The location of the comment in the comparison between the two commits.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * The name of the repository where you posted a comment on the comparison between commits.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object PostCommentForComparedCommitOutput {
  
  @scala.inline
  def apply(): PostCommentForComparedCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostCommentForComparedCommitOutput]
  }
  
  @scala.inline
  implicit class PostCommentForComparedCommitOutputMutableBuilder[Self <: PostCommentForComparedCommitOutput] (val x: Self) extends AnyVal {
    
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
    def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
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
