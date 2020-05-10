package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the organization.
    */
  var ARN: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The alias for an organization.
    */
  var Alias: js.UndefOr[OrganizationName] = js.native
  /**
    * The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
    */
  var CompletedDate: js.UndefOr[js.Date] = js.native
  /**
    * The default mail domain associated with the organization.
    */
  var DefaultMailDomain: js.UndefOr[String] = js.native
  /**
    * The identifier for the directory associated with an Amazon WorkMail organization.
    */
  var DirectoryId: js.UndefOr[String] = js.native
  /**
    * The type of directory associated with the WorkMail organization.
    */
  var DirectoryType: js.UndefOr[String] = js.native
  /**
    * (Optional) The error message indicating if unexpected behavior was encountered with regards to the organization.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The identifier of an organization.
    */
  var OrganizationId: js.UndefOr[typingsSlinky.awsSdk.workmailMod.OrganizationId] = js.native
  /**
    * The state of an organization.
    */
  var State: js.UndefOr[String] = js.native
}

object DescribeOrganizationResponse {
  @scala.inline
  def apply(): DescribeOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationResponse]
  }
  @scala.inline
  implicit class DescribeOrganizationResponseOps[Self <: DescribeOrganizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(js.undefined)
        ret
    }
    @scala.inline
    def withAlias(value: OrganizationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultMailDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMailDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultMailDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultMailDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryType")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationId(value: OrganizationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
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

