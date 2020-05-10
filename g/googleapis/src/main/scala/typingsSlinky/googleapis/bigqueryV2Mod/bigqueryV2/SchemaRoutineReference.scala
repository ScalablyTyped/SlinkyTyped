package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRoutineReference extends js.Object {
  /**
    * [Required] The ID of the dataset containing this routine.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * [Required] The ID of the project containing this routine.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * [Required] The ID of the routine. The ID must contain only letters (a-z,
    * A-Z), numbers (0-9), or underscores (_). The maximum length is 256
    * characters.
    */
  var routineId: js.UndefOr[String] = js.native
}

object SchemaRoutineReference {
  @scala.inline
  def apply(): SchemaRoutineReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutineReference]
  }
  @scala.inline
  implicit class SchemaRoutineReferenceOps[Self <: SchemaRoutineReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutineId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routineId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutineId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routineId")(js.undefined)
        ret
    }
  }
  
}

