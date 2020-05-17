package typingsSlinky.gitlab.anon

import typingsSlinky.gitlab.resourceAccessRequestsMod.AccessLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  accessLevel ? :gitlab.gitlab/dist/types/core/templates/ResourceAccessRequests.AccessLevel} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait accessLevelAccessLevelSud extends js.Object {
  var accessLevel: js.UndefOr[AccessLevel] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object accessLevelAccessLevelSud {
  @scala.inline
  def apply(): accessLevelAccessLevelSud = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[accessLevelAccessLevelSud]
  }
  @scala.inline
  implicit class accessLevelAccessLevelSudOps[Self <: accessLevelAccessLevelSud] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessLevel(value: AccessLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSudo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(js.undefined)
        ret
    }
  }
  
}

