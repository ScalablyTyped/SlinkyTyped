package typingsSlinky.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  var Marker: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Marker] = js.native
  var MaxJobs: js.UndefOr[typingsSlinky.awsSdk.importexportMod.MaxJobs] = js.native
}

object ListJobsInput {
  @scala.inline
  def apply(): ListJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsInput]
  }
  @scala.inline
  implicit class ListJobsInputOps[Self <: ListJobsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPIVersion(value: APIVersion_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAPIVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APIVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxJobs(value: MaxJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxJobs")(js.undefined)
        ret
    }
  }
  
}

