package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountStatus extends js.Object {
  /**
    * If the account was created successfully, the unique identifier (ID) of the new account. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.AccountId] = js.native
  /**
    * The account name given to the account when it was created.
    */
  var AccountName: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.AccountName] = js.native
  /**
    * The date and time that the account was created and the request completed.
    */
  var CompletedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * If the request failed, a description of the reason for the failure.   ACCOUNT_LIMIT_EXCEEDED: The account could not be created because you have reached the limit on the number of accounts in your organization.   EMAIL_ALREADY_EXISTS: The account could not be created because another AWS account with that email address already exists.   GOVCLOUD_ACCOUNT_ALREADY_EXISTS: The account in the AWS GovCloud (US) Region could not be created because this Region already includes an account with that email address.   INVALID_ADDRESS: The account could not be created because the address you provided is not valid.   INVALID_EMAIL: The account could not be created because the email address you provided is not valid.   INTERNAL_FAILURE: The account could not be created because of an internal failure. Try again later. If the problem persists, contact AWS Support.  
    */
  var FailureReason: js.UndefOr[CreateAccountFailureReason] = js.native
  /**
    * If the account was created successfully, the unique identifier (ID) of the new account in the AWS GovCloud (US) Region.
    */
  var GovCloudAccountId: js.UndefOr[AccountId] = js.native
  /**
    * The unique identifier (ID) that references this request. You get this value from the response of the initial CreateAccount request to create the account. The regex pattern for a create account request ID string requires "car-" followed by from 8 to 32 lower-case letters or digits.
    */
  var Id: js.UndefOr[CreateAccountRequestId] = js.native
  /**
    * The date and time that the request was made for the account creation.
    */
  var RequestedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The status of the request.
    */
  var State: js.UndefOr[CreateAccountState] = js.native
}

object CreateAccountStatus {
  @scala.inline
  def apply(): CreateAccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountStatus]
  }
  @scala.inline
  implicit class CreateAccountStatusOps[Self <: CreateAccountStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountName(value: AccountName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountName")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: CreateAccountFailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withGovCloudAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GovCloudAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGovCloudAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GovCloudAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: CreateAccountRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: CreateAccountState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

