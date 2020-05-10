package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserMetadata extends js.Object {
  /**
    * The email address of the user.
    */
  var EmailAddress: js.UndefOr[EmailAddressType] = js.native
  /**
    * The given name of the user before a rename operation.
    */
  var GivenName: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The ID of the user.
    */
  var Id: js.UndefOr[IdType] = js.native
  /**
    * The surname of the user.
    */
  var Surname: js.UndefOr[UserAttributeValueType] = js.native
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[UsernameType] = js.native
}

object UserMetadata {
  @scala.inline
  def apply(): UserMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserMetadata]
  }
  @scala.inline
  implicit class UserMetadataOps[Self <: UserMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailAddress(value: EmailAddressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: UserAttributeValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GivenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GivenName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: IdType): Self = {
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
    def withSurname(value: UserAttributeValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Surname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Surname")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: UsernameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}

