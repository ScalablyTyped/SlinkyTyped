package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUserGender extends js.Object {
  /**
    * AddressMeAs. A human-readable string containing the proper way to refer
    * to the profile owner by humans, for example &quot;he/him/his&quot; or
    * &quot;they/them/their&quot;.
    */
  var addressMeAs: js.UndefOr[String] = js.native
  /**
    * Custom gender.
    */
  var customGender: js.UndefOr[String] = js.native
  /**
    * Gender.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaUserGender {
  @scala.inline
  def apply(): SchemaUserGender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserGender]
  }
  @scala.inline
  implicit class SchemaUserGenderOps[Self <: SchemaUserGender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddressMeAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressMeAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressMeAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addressMeAs")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customGender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customGender")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

