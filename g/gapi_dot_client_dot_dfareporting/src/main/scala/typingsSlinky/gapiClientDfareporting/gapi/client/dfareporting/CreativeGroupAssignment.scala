package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeGroupAssignment extends js.Object {
  /** ID of the creative group to be assigned. */
  var creativeGroupId: js.UndefOr[String] = js.native
  /** Creative group number of the creative group assignment. */
  var creativeGroupNumber: js.UndefOr[String] = js.native
}

object CreativeGroupAssignment {
  @scala.inline
  def apply(): CreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeGroupAssignment]
  }
  @scala.inline
  implicit class CreativeGroupAssignmentOps[Self <: CreativeGroupAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeGroupNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeGroupNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupNumber")(js.undefined)
        ret
    }
  }
  
}

