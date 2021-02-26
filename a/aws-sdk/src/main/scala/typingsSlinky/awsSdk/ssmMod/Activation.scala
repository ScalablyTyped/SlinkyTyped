package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activation extends StObject {
  
  /**
    * The ID created by Systems Manager when you submitted the activation.
    */
  var ActivationId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.ActivationId] = js.native
  
  /**
    * The date the activation was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A name for the managed instance when it is created.
    */
  var DefaultInstanceName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DefaultInstanceName] = js.native
  
  /**
    * A user defined description of the activation.
    */
  var Description: js.UndefOr[ActivationDescription] = js.native
  
  /**
    * The date when this activation can no longer be used to register managed instances.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Whether or not the activation is expired.
    */
  var Expired: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
    */
  var IamRole: js.UndefOr[typingsSlinky.awsSdk.ssmMod.IamRole] = js.native
  
  /**
    * The maximum number of managed instances that can be registered using this activation.
    */
  var RegistrationLimit: js.UndefOr[typingsSlinky.awsSdk.ssmMod.RegistrationLimit] = js.native
  
  /**
    * The number of managed instances already registered with this activation.
    */
  var RegistrationsCount: js.UndefOr[typingsSlinky.awsSdk.ssmMod.RegistrationsCount] = js.native
  
  /**
    * Tags assigned to the activation.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object Activation {
  
  @scala.inline
  def apply(): Activation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activation]
  }
  
  @scala.inline
  implicit class ActivationMutableBuilder[Self <: Activation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationId(value: ActivationId): Self = StObject.set(x, "ActivationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationIdUndefined: Self = StObject.set(x, "ActivationId", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDefaultInstanceName(value: DefaultInstanceName): Self = StObject.set(x, "DefaultInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultInstanceNameUndefined: Self = StObject.set(x, "DefaultInstanceName", js.undefined)
    
    @scala.inline
    def setDescription(value: ActivationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: js.Date): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    @scala.inline
    def setExpired(value: Boolean): Self = StObject.set(x, "Expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredUndefined: Self = StObject.set(x, "Expired", js.undefined)
    
    @scala.inline
    def setIamRole(value: IamRole): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleUndefined: Self = StObject.set(x, "IamRole", js.undefined)
    
    @scala.inline
    def setRegistrationLimit(value: RegistrationLimit): Self = StObject.set(x, "RegistrationLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationLimitUndefined: Self = StObject.set(x, "RegistrationLimit", js.undefined)
    
    @scala.inline
    def setRegistrationsCount(value: RegistrationsCount): Self = StObject.set(x, "RegistrationsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationsCountUndefined: Self = StObject.set(x, "RegistrationsCount", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
