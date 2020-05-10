package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProposalUser extends js.Object {
  /** Gaia id associated with a user, absent for the Google Tag Manager system. */
  var gaiaId: js.UndefOr[String] = js.native
  /** User type distinguishes between a user and the Google Tag Manager system. */
  var `type`: js.UndefOr[String] = js.native
}

object WorkspaceProposalUser {
  @scala.inline
  def apply(): WorkspaceProposalUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProposalUser]
  }
  @scala.inline
  implicit class WorkspaceProposalUserOps[Self <: WorkspaceProposalUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGaiaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaiaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaiaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaiaId")(js.undefined)
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

