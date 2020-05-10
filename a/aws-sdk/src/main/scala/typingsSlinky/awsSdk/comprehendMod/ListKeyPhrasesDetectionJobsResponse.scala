package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListKeyPhrasesDetectionJobsResponse extends js.Object {
  /**
    * A list containing the properties of each job that is returned.
    */
  var KeyPhrasesDetectionJobPropertiesList: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.KeyPhrasesDetectionJobPropertiesList] = js.native
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListKeyPhrasesDetectionJobsResponse {
  @scala.inline
  def apply(): ListKeyPhrasesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyPhrasesDetectionJobsResponse]
  }
  @scala.inline
  implicit class ListKeyPhrasesDetectionJobsResponseOps[Self <: ListKeyPhrasesDetectionJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyPhrasesDetectionJobPropertiesList(value: KeyPhrasesDetectionJobPropertiesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPhrasesDetectionJobPropertiesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPhrasesDetectionJobPropertiesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPhrasesDetectionJobPropertiesList")(js.undefined)
        ret
    }
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
  }
  
}

