package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryCredentials extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.  When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret exists in the same Region as the task that you are launching then you can use either the full ARN or the name of the secret. When you are using the AWS Management Console, you must specify the full ARN of the secret. 
    */
  var credentialsParameter: String = js.native
}
object RepositoryCredentials {
  
  @scala.inline
  def apply(credentialsParameter: String): RepositoryCredentials = {
    val __obj = js.Dynamic.literal(credentialsParameter = credentialsParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryCredentials]
  }
  
  @scala.inline
  implicit class RepositoryCredentialsMutableBuilder[Self <: RepositoryCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialsParameter(value: String): Self = StObject.set(x, "credentialsParameter", value.asInstanceOf[js.Any])
  }
}
