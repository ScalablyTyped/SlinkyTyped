package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexConfigurationSummary extends js.Object {
  /**
    * The Unix timestamp when the index was created.
    */
  var CreatedAt: js.Date = js.native
  /**
    * A unique identifier for the index. Use this to identify the index when you are using operations such as Query, DescribeIndex, UpdateIndex, and DeleteIndex.
    */
  var Id: js.UndefOr[IndexId] = js.native
  /**
    * The name of the index.
    */
  var Name: js.UndefOr[IndexName] = js.native
  /**
    * The current status of the index. When the status is ACTIVE, the index is ready to search.
    */
  var Status: IndexStatus = js.native
  /**
    * The Unix timestamp when the index was last updated by the UpdateIndex operation.
    */
  var UpdatedAt: js.Date = js.native
}

object IndexConfigurationSummary {
  @scala.inline
  def apply(CreatedAt: js.Date, Status: IndexStatus, UpdatedAt: js.Date): IndexConfigurationSummary = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexConfigurationSummary]
  }
  @scala.inline
  implicit class IndexConfigurationSummaryOps[Self <: IndexConfigurationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: IndexStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: IndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: IndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

