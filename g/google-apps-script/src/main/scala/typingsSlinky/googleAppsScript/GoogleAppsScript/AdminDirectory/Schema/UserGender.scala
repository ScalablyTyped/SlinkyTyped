package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserGender extends js.Object {
  var addressMeAs: js.UndefOr[String] = js.native
  var customGender: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object UserGender {
  @scala.inline
  def apply(): UserGender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGender]
  }
  @scala.inline
  implicit class UserGenderOps[Self <: UserGender] (val x: Self) extends AnyVal {
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

