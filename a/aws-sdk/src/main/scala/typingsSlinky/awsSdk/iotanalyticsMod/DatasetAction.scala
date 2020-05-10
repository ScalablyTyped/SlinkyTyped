package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetAction extends js.Object {
  /**
    * The name of the data set action by which data set contents are automatically created.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.native
  /**
    * Information which allows the system to run a containerized application in order to create the data set contents. The application must be in a Docker container along with any needed support libraries.
    */
  var containerAction: js.UndefOr[ContainerDatasetAction] = js.native
  /**
    * An "SqlQueryDatasetAction" object that uses an SQL query to automatically create data set contents.
    */
  var queryAction: js.UndefOr[SqlQueryDatasetAction] = js.native
}

object DatasetAction {
  @scala.inline
  def apply(): DatasetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetAction]
  }
  @scala.inline
  implicit class DatasetActionOps[Self <: DatasetAction] (val x: Self) extends AnyVal {
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
    def withContainerAction(value: ContainerDatasetAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerAction")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryAction(value: SqlQueryDatasetAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryAction")(js.undefined)
        ret
    }
  }
  
}

