package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetGroupsResponse extends js.Object {
  /**
    * The list of your dataset groups.
    */
  var datasetGroups: js.UndefOr[DatasetGroups] = js.native
  /**
    * A token for getting the next set of dataset groups (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDatasetGroupsResponse {
  @scala.inline
  def apply(): ListDatasetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetGroupsResponse]
  }
  @scala.inline
  implicit class ListDatasetGroupsResponseOps[Self <: ListDatasetGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetGroups(value: DatasetGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

