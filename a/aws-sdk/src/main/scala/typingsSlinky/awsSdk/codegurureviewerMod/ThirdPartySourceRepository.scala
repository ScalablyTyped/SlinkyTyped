package typingsSlinky.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartySourceRepository extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id. For more information, see  Connection  in the AWS CodeStar Connections API Reference. 
    */
  var ConnectionArn: typingsSlinky.awsSdk.codegurureviewerMod.ConnectionArn = js.native
  
  /**
    *  The name of the third party source repository. 
    */
  var Name: typingsSlinky.awsSdk.codegurureviewerMod.Name = js.native
  
  /**
    *  The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the username for the account that owns the repository. 
    */
  var Owner: typingsSlinky.awsSdk.codegurureviewerMod.Owner = js.native
}
object ThirdPartySourceRepository {
  
  @scala.inline
  def apply(ConnectionArn: ConnectionArn, Name: Name, Owner: Owner): ThirdPartySourceRepository = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartySourceRepository]
  }
  
  @scala.inline
  implicit class ThirdPartySourceRepositoryMutableBuilder[Self <: ThirdPartySourceRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
  }
}
