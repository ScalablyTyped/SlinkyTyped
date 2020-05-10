package typingsSlinky.evernote

import typingsSlinky.evernote.mod.UserStore.BootstrapProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProfiles extends js.Object {
  var profiles: js.UndefOr[js.Array[BootstrapProfile]] = js.native
}

object AnonProfiles {
  @scala.inline
  def apply(): AnonProfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonProfiles]
  }
  @scala.inline
  implicit class AnonProfilesOps[Self <: AnonProfiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfiles(value: js.Array[BootstrapProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(js.undefined)
        ret
    }
  }
  
}

