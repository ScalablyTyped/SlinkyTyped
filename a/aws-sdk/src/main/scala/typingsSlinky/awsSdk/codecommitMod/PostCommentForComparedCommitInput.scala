package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCommentForComparedCommitInput extends StObject {
  
  /**
    * To establish the directionality of the comparison, the full commit ID of the after commit.
    */
  var afterCommitId: CommitId = js.native
  
  /**
    * To establish the directionality of the comparison, the full commit ID of the before commit. Required for commenting on any commit unless that commit is the initial commit.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The content of the comment you want to make.
    */
  var content: Content = js.native
  
  /**
    * The location of the comparison where you want to comment.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * The name of the repository where you want to post a comment on the comparison between commits.
    */
  var repositoryName: RepositoryName = js.native
}
object PostCommentForComparedCommitInput {
  
  @scala.inline
  def apply(afterCommitId: CommitId, content: Content, repositoryName: RepositoryName): PostCommentForComparedCommitInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentForComparedCommitInput]
  }
  
  @scala.inline
  implicit class PostCommentForComparedCommitInputMutableBuilder[Self <: PostCommentForComparedCommitInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterCommitId(value: CommitId): Self = StObject.set(x, "afterCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCommitId(value: CommitId): Self = StObject.set(x, "beforeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCommitIdUndefined: Self = StObject.set(x, "beforeCommitId", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
