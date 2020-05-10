package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeldOrgUnit extends js.Object {
  /** When the org unit was put on hold. This property is immutable. */
  var holdTime: js.UndefOr[String] = js.native
  /** The org unit's immutable ID as provided by the admin SDK. */
  var orgUnitId: js.UndefOr[String] = js.native
}

object HeldOrgUnit {
  @scala.inline
  def apply(): HeldOrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldOrgUnit]
  }
  @scala.inline
  implicit class HeldOrgUnitOps[Self <: HeldOrgUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoldTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgUnitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgUnitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnitId")(js.undefined)
        ret
    }
  }
  
}

