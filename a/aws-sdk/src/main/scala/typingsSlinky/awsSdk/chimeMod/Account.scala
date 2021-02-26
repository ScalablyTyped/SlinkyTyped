package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: String = js.native
  
  /**
    * The Amazon Chime account type. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  var AccountType: js.UndefOr[typingsSlinky.awsSdk.chimeMod.AccountType] = js.native
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: String = js.native
  
  /**
    * The Amazon Chime account creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The default license for the Amazon Chime account.
    */
  var DefaultLicense: js.UndefOr[License] = js.native
  
  /**
    * The Amazon Chime account name.
    */
  var Name: String = js.native
  
  /**
    * The sign-in delegate groups associated with the account.
    */
  var SigninDelegateGroups: js.UndefOr[SigninDelegateGroupList] = js.native
  
  /**
    * Supported licenses for the Amazon Chime account.
    */
  var SupportedLicenses: js.UndefOr[LicenseList] = js.native
}
object Account {
  
  @scala.inline
  def apply(AccountId: String, AwsAccountId: String, Name: String): Account = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountType(value: AccountType): Self = StObject.set(x, "AccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountTypeUndefined: Self = StObject.set(x, "AccountType", js.undefined)
    
    @scala.inline
    def setAwsAccountId(value: String): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setDefaultLicense(value: License): Self = StObject.set(x, "DefaultLicense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLicenseUndefined: Self = StObject.set(x, "DefaultLicense", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigninDelegateGroups(value: SigninDelegateGroupList): Self = StObject.set(x, "SigninDelegateGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigninDelegateGroupsUndefined: Self = StObject.set(x, "SigninDelegateGroups", js.undefined)
    
    @scala.inline
    def setSigninDelegateGroupsVarargs(value: SigninDelegateGroup*): Self = StObject.set(x, "SigninDelegateGroups", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLicenses(value: LicenseList): Self = StObject.set(x, "SupportedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedLicensesUndefined: Self = StObject.set(x, "SupportedLicenses", js.undefined)
    
    @scala.inline
    def setSupportedLicensesVarargs(value: License*): Self = StObject.set(x, "SupportedLicenses", js.Array(value :_*))
  }
}
