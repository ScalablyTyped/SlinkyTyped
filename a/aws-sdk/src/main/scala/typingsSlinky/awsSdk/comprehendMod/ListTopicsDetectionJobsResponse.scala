package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTopicsDetectionJobsResponse extends js.Object {
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list containing the properties of each job that is returned.
    */
  var TopicsDetectionJobPropertiesList: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.TopicsDetectionJobPropertiesList] = js.native
}

object ListTopicsDetectionJobsResponse {
  @scala.inline
  def apply(): ListTopicsDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsDetectionJobsResponse]
  }
  @scala.inline
  implicit class ListTopicsDetectionJobsResponseOps[Self <: ListTopicsDetectionJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicsDetectionJobPropertiesList(value: TopicsDetectionJobPropertiesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicsDetectionJobPropertiesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicsDetectionJobPropertiesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicsDetectionJobPropertiesList")(js.undefined)
        ret
    }
  }
  
}

