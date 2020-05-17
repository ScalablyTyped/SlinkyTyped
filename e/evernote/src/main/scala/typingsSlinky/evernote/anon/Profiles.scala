package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.UserStore.BootstrapProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profiles extends js.Object {
  var profiles: js.UndefOr[js.Array[BootstrapProfile]] = js.native
}

object Profiles {
  @scala.inline
  def apply(): Profiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profiles]
  }
  @scala.inline
  implicit class ProfilesOps[Self <: Profiles] (val x: Self) extends AnyVal {
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

