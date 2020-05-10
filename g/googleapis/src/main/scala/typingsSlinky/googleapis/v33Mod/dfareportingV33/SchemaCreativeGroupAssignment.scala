package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Group Assignment.
  */
@js.native
trait SchemaCreativeGroupAssignment extends js.Object {
  /**
    * ID of the creative group to be assigned.
    */
  var creativeGroupId: js.UndefOr[String] = js.native
  /**
    * Creative group number of the creative group assignment.
    */
  var creativeGroupNumber: js.UndefOr[String] = js.native
}

object SchemaCreativeGroupAssignment {
  @scala.inline
  def apply(): SchemaCreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeGroupAssignment]
  }
  @scala.inline
  implicit class SchemaCreativeGroupAssignmentOps[Self <: SchemaCreativeGroupAssignment] (val x: Self) extends AnyVal {
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

