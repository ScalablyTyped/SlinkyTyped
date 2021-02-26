package typingsSlinky.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCodeReviewRequest extends StObject {
  
  /**
    *  Amazon CodeGuru Reviewer uses this value to prevent the accidental creation of duplicate code reviews if there are failures and retries. 
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.codegurureviewerMod.ClientRequestToken] = js.native
  
  /**
    *  The name of the code review. The name of each code review in your AWS account must be unique. 
    */
  var Name: CodeReviewName = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the  RepositoryAssociation  object. You can retrieve this ARN by calling  ListRepositoryAssociations .   A code review can only be created on an associated repository. This is the ARN of the associated repository. 
    */
  var RepositoryAssociationArn: AssociationArn = js.native
  
  /**
    *  The type of code review to create. This is specified using a  CodeReviewType  object. You can create a code review only of type RepositoryAnalysis. 
    */
  var Type: CodeReviewType = js.native
}
object CreateCodeReviewRequest {
  
  @scala.inline
  def apply(Name: CodeReviewName, RepositoryAssociationArn: AssociationArn, Type: CodeReviewType): CreateCodeReviewRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RepositoryAssociationArn = RepositoryAssociationArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCodeReviewRequest]
  }
  
  @scala.inline
  implicit class CreateCodeReviewRequestMutableBuilder[Self <: CreateCodeReviewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setName(value: CodeReviewName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryAssociationArn(value: AssociationArn): Self = StObject.set(x, "RepositoryAssociationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeReviewType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
