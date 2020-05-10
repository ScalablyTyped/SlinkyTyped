package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Field Assignment.
  */
@js.native
trait SchemaCreativeFieldAssignment extends js.Object {
  /**
    * ID of the creative field.
    */
  var creativeFieldId: js.UndefOr[String] = js.native
  /**
    * ID of the creative field value.
    */
  var creativeFieldValueId: js.UndefOr[String] = js.native
}

object SchemaCreativeFieldAssignment {
  @scala.inline
  def apply(): SchemaCreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeFieldAssignment]
  }
  @scala.inline
  implicit class SchemaCreativeFieldAssignmentOps[Self <: SchemaCreativeFieldAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeFieldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeFieldId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeFieldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeFieldId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeFieldValueId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeFieldValueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeFieldValueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeFieldValueId")(js.undefined)
        ret
    }
  }
  
}

