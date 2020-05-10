package typingsSlinky.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProjectNumber extends js.Object {
  /** The project number. */
  var projectNumber: js.UndefOr[String] = js.native
  /** The team. */
  var team: js.UndefOr[String] = js.native
}

object AnonProjectNumber {
  @scala.inline
  def apply(): AnonProjectNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonProjectNumber]
  }
  @scala.inline
  implicit class AnonProjectNumberOps[Self <: AnonProjectNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTeam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(js.undefined)
        ret
    }
  }
  
}

