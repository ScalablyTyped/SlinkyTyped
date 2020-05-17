package typingsSlinky.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FamilyRole extends js.Object {
  /** The role of the user in the family. */
  var familyRole: js.UndefOr[String] = js.native
  /**
    * Whether or not this volume can be shared with the family by the user. This includes sharing eligibility of both the volume and the user. If the value
    * is true, the user can initiate a family sharing action.
    */
  var isSharingAllowed: js.UndefOr[Boolean] = js.native
  /** Whether or not sharing this volume is temporarily disabled due to issues with the Family Wallet. */
  var isSharingDisabledByFop: js.UndefOr[Boolean] = js.native
}

object FamilyRole {
  @scala.inline
  def apply(): FamilyRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyRole]
  }
  @scala.inline
  implicit class FamilyRoleOps[Self <: FamilyRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamilyRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyRole")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSharingAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSharingAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSharingAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSharingAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSharingDisabledByFop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSharingDisabledByFop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSharingDisabledByFop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSharingDisabledByFop")(js.undefined)
        ret
    }
  }
  
}

