package typingsSlinky.gapiPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFamilyName extends js.Object {
  var familyName: String = js.native
  var formatted: String = js.native
  var givenName: String = js.native
  var honorificPrefix: String = js.native
  var honorificSuffix: String = js.native
  var middleName: String = js.native
}

object AnonFamilyName {
  @scala.inline
  def apply(
    familyName: String,
    formatted: String,
    givenName: String,
    honorificPrefix: String,
    honorificSuffix: String,
    middleName: String
  ): AnonFamilyName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], honorificPrefix = honorificPrefix.asInstanceOf[js.Any], honorificSuffix = honorificSuffix.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFamilyName]
  }
  @scala.inline
  implicit class AnonFamilyNameOps[Self <: AnonFamilyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
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
    def withMiddleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

