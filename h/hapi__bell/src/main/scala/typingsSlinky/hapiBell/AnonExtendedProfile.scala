package typingsSlinky.hapiBell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtendedProfile extends js.Object {
  var extendedProfile: js.UndefOr[Boolean] = js.native
  var getMethod: js.UndefOr[String] = js.native
}

object AnonExtendedProfile {
  @scala.inline
  def apply(): AnonExtendedProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExtendedProfile]
  }
  @scala.inline
  implicit class AnonExtendedProfileOps[Self <: AnonExtendedProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendedProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMethod")(js.undefined)
        ret
    }
  }
  
}

