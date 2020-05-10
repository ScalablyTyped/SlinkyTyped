package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetActionSummary extends js.Object {
  /**
    * The name of the action which automatically creates the data set's contents.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.native
  /**
    * The type of action by which the data set's contents are automatically created.
    */
  var actionType: js.UndefOr[DatasetActionType] = js.native
}

object DatasetActionSummary {
  @scala.inline
  def apply(): DatasetActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetActionSummary]
  }
  @scala.inline
  implicit class DatasetActionSummaryOps[Self <: DatasetActionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionName(value: DatasetActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(js.undefined)
        ret
    }
    @scala.inline
    def withActionType(value: DatasetActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(js.undefined)
        ret
    }
  }
  
}

