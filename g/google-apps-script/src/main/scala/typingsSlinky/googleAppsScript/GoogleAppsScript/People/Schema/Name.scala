package typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var displayNameLastFirst: js.UndefOr[String] = js.native
  var familyName: js.UndefOr[String] = js.native
  var givenName: js.UndefOr[String] = js.native
  var honorificPrefix: js.UndefOr[String] = js.native
  var honorificSuffix: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[FieldMetadata] = js.native
  var middleName: js.UndefOr[String] = js.native
  var phoneticFamilyName: js.UndefOr[String] = js.native
  var phoneticFullName: js.UndefOr[String] = js.native
  var phoneticGivenName: js.UndefOr[String] = js.native
  var phoneticHonorificPrefix: js.UndefOr[String] = js.native
  var phoneticHonorificSuffix: js.UndefOr[String] = js.native
  var phoneticMiddleName: js.UndefOr[String] = js.native
}

object Name {
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayNameLastFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayNameLastFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayNameLastFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayNameLastFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
        ret
    }
    @scala.inline
    def withHonorificPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorificPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withHonorificSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHonorificSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: FieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneticFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneticFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticFamilyName")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneticFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneticFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticFullName")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneticGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticGivenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneticGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticGivenName")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneticHonorificPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticHonorificPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneticHonorificPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticHonorificPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneticHonorificSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticHonorificSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneticHonorificSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticHonorificSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneticMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticMiddleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneticMiddleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticMiddleName")(js.undefined)
        ret
    }
  }
  
}

