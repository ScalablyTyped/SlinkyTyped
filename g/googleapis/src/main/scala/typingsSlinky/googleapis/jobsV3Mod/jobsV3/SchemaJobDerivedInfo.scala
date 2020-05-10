package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Derived details about the job posting.
  */
@js.native
trait SchemaJobDerivedInfo extends js.Object {
  /**
    * Job categories derived from Job.title and Job.description.
    */
  var jobCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Structured locations of the job, resolved from Job.addresses.  locations
    * are exactly matched to Job.addresses in the same order.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.native
}

object SchemaJobDerivedInfo {
  @scala.inline
  def apply(): SchemaJobDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobDerivedInfo]
  }
  @scala.inline
  implicit class SchemaJobDerivedInfoOps[Self <: SchemaJobDerivedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[SchemaLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
  }
  
}

