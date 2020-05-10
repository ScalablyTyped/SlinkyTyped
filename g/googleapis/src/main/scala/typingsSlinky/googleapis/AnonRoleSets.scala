package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRoleSets extends js.Object {
  var roleSets: js.UndefOr[js.Array[AnonAdditionalRoles]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonRoleSets {
  @scala.inline
  def apply(): AnonRoleSets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRoleSets]
  }
  @scala.inline
  implicit class AnonRoleSetsOps[Self <: AnonRoleSets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleSets(value: js.Array[AnonAdditionalRoles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleSets")(js.undefined)
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

