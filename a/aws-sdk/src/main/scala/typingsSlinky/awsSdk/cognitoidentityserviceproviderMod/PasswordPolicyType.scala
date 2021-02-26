package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordPolicyType extends StObject {
  
  /**
    * The minimum length of the password policy that you have set. Cannot be less than 6.
    */
  var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.native
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one lowercase letter in their password.
    */
  var RequireLowercase: js.UndefOr[BooleanType] = js.native
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one number in their password.
    */
  var RequireNumbers: js.UndefOr[BooleanType] = js.native
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one symbol in their password.
    */
  var RequireSymbols: js.UndefOr[BooleanType] = js.native
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one uppercase letter in their password.
    */
  var RequireUppercase: js.UndefOr[BooleanType] = js.native
  
  /**
    * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.  When you set TemporaryPasswordValidityDays for a user pool, you will no longer be able to set the deprecated UnusedAccountValidityDays value for that user pool. 
    */
  var TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType] = js.native
}
object PasswordPolicyType {
  
  @scala.inline
  def apply(): PasswordPolicyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordPolicyType]
  }
  
  @scala.inline
  implicit class PasswordPolicyTypeMutableBuilder[Self <: PasswordPolicyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinimumLength(value: PasswordPolicyMinLengthType): Self = StObject.set(x, "MinimumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLengthUndefined: Self = StObject.set(x, "MinimumLength", js.undefined)
    
    @scala.inline
    def setRequireLowercase(value: BooleanType): Self = StObject.set(x, "RequireLowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireLowercaseUndefined: Self = StObject.set(x, "RequireLowercase", js.undefined)
    
    @scala.inline
    def setRequireNumbers(value: BooleanType): Self = StObject.set(x, "RequireNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireNumbersUndefined: Self = StObject.set(x, "RequireNumbers", js.undefined)
    
    @scala.inline
    def setRequireSymbols(value: BooleanType): Self = StObject.set(x, "RequireSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireSymbolsUndefined: Self = StObject.set(x, "RequireSymbols", js.undefined)
    
    @scala.inline
    def setRequireUppercase(value: BooleanType): Self = StObject.set(x, "RequireUppercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireUppercaseUndefined: Self = StObject.set(x, "RequireUppercase", js.undefined)
    
    @scala.inline
    def setTemporaryPasswordValidityDays(value: TemporaryPasswordValidityDaysType): Self = StObject.set(x, "TemporaryPasswordValidityDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporaryPasswordValidityDaysUndefined: Self = StObject.set(x, "TemporaryPasswordValidityDays", js.undefined)
  }
}
