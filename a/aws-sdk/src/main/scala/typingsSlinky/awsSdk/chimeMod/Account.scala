package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
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
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountType(value: AccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLicense(value: License): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultLicense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultLicense")(js.undefined)
        ret
    }
    @scala.inline
    def withSigninDelegateGroups(value: SigninDelegateGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigninDelegateGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigninDelegateGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigninDelegateGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedLicenses(value: LicenseList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedLicenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedLicenses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedLicenses")(js.undefined)
        ret
    }
  }
  
}

