package typingsSlinky.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationProfile extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  
  /**
    * The configuration profile description.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.Description] = js.native
  
  /**
    * The configuration profile ID.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.Id] = js.native
  
  /**
    * The URI location of the configuration.
    */
  var LocationUri: js.UndefOr[Uri] = js.native
  
  /**
    * The name of the configuration profile.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.Name] = js.native
  
  /**
    * The ARN of an IAM role with permission to access the configuration at the specified LocationUri.
    */
  var RetrievalRoleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * A list of methods for validating the configuration.
    */
  var Validators: js.UndefOr[ValidatorList] = js.native
}
object ConfigurationProfile {
  
  @scala.inline
  def apply(): ConfigurationProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationProfile]
  }
  
  @scala.inline
  implicit class ConfigurationProfileMutableBuilder[Self <: ConfigurationProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLocationUri(value: Uri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRetrievalRoleArn(value: RoleArn): Self = StObject.set(x, "RetrievalRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievalRoleArnUndefined: Self = StObject.set(x, "RetrievalRoleArn", js.undefined)
    
    @scala.inline
    def setValidators(value: ValidatorList): Self = StObject.set(x, "Validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorsUndefined: Self = StObject.set(x, "Validators", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = StObject.set(x, "Validators", js.Array(value :_*))
  }
}
