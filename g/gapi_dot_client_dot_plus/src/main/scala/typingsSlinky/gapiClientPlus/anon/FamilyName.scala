package typingsSlinky.gapiClientPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FamilyName extends js.Object {
  /** The family name ("last name") of the actor. */
  var familyName: js.UndefOr[String] = js.native
  /** The given name ("first name") of the actor. */
  var givenName: js.UndefOr[String] = js.native
}

object FamilyName {
  @scala.inline
  def apply(): FamilyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyName]
  }
  @scala.inline
  implicit class FamilyNameOps[Self <: FamilyName] (val x: Self) extends AnyVal {
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
  }
  
}

