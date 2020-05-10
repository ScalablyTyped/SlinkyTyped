package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Membership extends js.Object {
  /** The contact group membership. */
  var contactGroupMembership: js.UndefOr[ContactGroupMembership] = js.native
  /** Output only. The domain membership. */
  var domainMembership: js.UndefOr[DomainMembership] = js.native
  /** Metadata about the membership. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
}

object Membership {
  @scala.inline
  def apply(): Membership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Membership]
  }
  @scala.inline
  implicit class MembershipOps[Self <: Membership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactGroupMembership(value: ContactGroupMembership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroupMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactGroupMembership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroupMembership")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainMembership(value: DomainMembership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMembership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainMembership: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainMembership")(js.undefined)
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
  }
  
}

