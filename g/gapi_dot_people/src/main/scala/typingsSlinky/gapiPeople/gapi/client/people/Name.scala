package typingsSlinky.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var displayName: String = js.native
  var displayNameLastFirst: String = js.native
  var familyName: String = js.native
  var givenName: String = js.native
  var honorificPrefix: String = js.native
  var honorificSuffix: String = js.native
  var metadata: FieldMetadata = js.native
  var middleName: String = js.native
  var phoneticFamilyName: String = js.native
  var phoneticFullName: String = js.native
  var phoneticGivenName: String = js.native
  var phoneticHonorificPrefix: String = js.native
  var phoneticHonorificSuffix: String = js.native
  var phoneticMiddleName: String = js.native
}

object Name {
  @scala.inline
  def apply(
    displayName: String,
    displayNameLastFirst: String,
    familyName: String,
    givenName: String,
    honorificPrefix: String,
    honorificSuffix: String,
    metadata: FieldMetadata,
    middleName: String,
    phoneticFamilyName: String,
    phoneticFullName: String,
    phoneticGivenName: String,
    phoneticHonorificPrefix: String,
    phoneticHonorificSuffix: String,
    phoneticMiddleName: String
  ): Name = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], displayNameLastFirst = displayNameLastFirst.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], honorificPrefix = honorificPrefix.asInstanceOf[js.Any], honorificSuffix = honorificSuffix.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], phoneticFamilyName = phoneticFamilyName.asInstanceOf[js.Any], phoneticFullName = phoneticFullName.asInstanceOf[js.Any], phoneticGivenName = phoneticGivenName.asInstanceOf[js.Any], phoneticHonorificPrefix = phoneticHonorificPrefix.asInstanceOf[js.Any], phoneticHonorificSuffix = phoneticHonorificSuffix.asInstanceOf[js.Any], phoneticMiddleName = phoneticMiddleName.asInstanceOf[js.Any])
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
    def withDisplayNameLastFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayNameLastFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHonorificPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHonorificSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("honorificSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: FieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneticFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticFamilyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneticFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticFullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneticGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticGivenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneticHonorificPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticHonorificPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneticHonorificSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticHonorificSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneticMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneticMiddleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

