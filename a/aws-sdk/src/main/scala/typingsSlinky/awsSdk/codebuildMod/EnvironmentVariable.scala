package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentVariable extends StObject {
  
  /**
    * The name or key of the environment variable.
    */
  var name: NonEmptyString = js.native
  
  /**
    * The type of environment variable. Valid values include:    PARAMETER_STORE: An environment variable stored in Amazon EC2 Systems Manager Parameter Store. To learn how to specify a parameter store environment variable, see env/parameter-store in the AWS CodeBuild User Guide.    PLAINTEXT: An environment variable in plain text format. This is the default value.    SECRETS_MANAGER: An environment variable stored in AWS Secrets Manager. To learn how to specify a secrets manager environment variable, see env/secrets-manager in the AWS CodeBuild User Guide.  
    */
  var `type`: js.UndefOr[EnvironmentVariableType] = js.native
  
  /**
    * The value of the environment variable.  We strongly discourage the use of PLAINTEXT environment variables to store sensitive values, especially AWS secret key IDs and secret access keys. PLAINTEXT environment variables can be displayed in plain text using the AWS CodeBuild console and the AWS Command Line Interface (AWS CLI). For sensitive values, we recommend you use an environment variable of type PARAMETER_STORE or SECRETS_MANAGER.  
    */
  var value: String = js.native
}
object EnvironmentVariable {
  
  @scala.inline
  def apply(name: NonEmptyString, value: String): EnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVariable]
  }
  
  @scala.inline
  implicit class EnvironmentVariableMutableBuilder[Self <: EnvironmentVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EnvironmentVariableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
