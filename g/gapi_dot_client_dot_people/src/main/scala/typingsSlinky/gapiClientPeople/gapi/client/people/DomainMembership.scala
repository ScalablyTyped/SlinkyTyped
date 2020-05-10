package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMembership extends js.Object {
  /** True if the person is in the viewer's G Suite domain. */
  var inViewerDomain: js.UndefOr[Boolean] = js.native
}

object DomainMembership {
  @scala.inline
  def apply(): DomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMembership]
  }
  @scala.inline
  implicit class DomainMembershipOps[Self <: DomainMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInViewerDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inViewerDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInViewerDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inViewerDomain")(js.undefined)
        ret
    }
  }
  
}

