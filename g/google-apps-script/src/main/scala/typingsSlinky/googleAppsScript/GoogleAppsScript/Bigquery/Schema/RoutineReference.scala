package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutineReference extends js.Object {
  var datasetId: js.UndefOr[String] = js.native
  var projectId: js.UndefOr[String] = js.native
  var routineId: js.UndefOr[String] = js.native
}

object RoutineReference {
  @scala.inline
  def apply(): RoutineReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutineReference]
  }
  @scala.inline
  implicit class RoutineReferenceOps[Self <: RoutineReference] (val x: Self) extends AnyVal {
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

