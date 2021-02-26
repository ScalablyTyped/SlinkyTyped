package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitConfig extends StObject {
  
  /**
    * The default branch for the Git repository.
    */
  var Branch: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Branch] = js.native
  
  /**
    * The URL where the Git repository is located.
    */
  var RepositoryUrl: GitConfigUrl = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SecretArn] = js.native
}
object GitConfig {
  
  @scala.inline
  def apply(RepositoryUrl: GitConfigUrl): GitConfig = {
    val __obj = js.Dynamic.literal(RepositoryUrl = RepositoryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConfig]
  }
  
  @scala.inline
  implicit class GitConfigMutableBuilder[Self <: GitConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: Branch): Self = StObject.set(x, "Branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "Branch", js.undefined)
    
    @scala.inline
    def setRepositoryUrl(value: GitConfigUrl): Self = StObject.set(x, "RepositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
  }
}
