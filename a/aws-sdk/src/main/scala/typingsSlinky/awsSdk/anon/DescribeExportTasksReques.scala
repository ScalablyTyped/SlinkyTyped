package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.ec2Mod.ExportTaskIdStringList
import typingsSlinky.awsSdk.ec2Mod.FilterList
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeExportTasksRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeExportTasksReques extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The export task IDs.
    */
  var ExportTaskIds: js.UndefOr[ExportTaskIdStringList] = js.native
  /**
    * the filters for the export tasks.
    */
  var Filters: js.UndefOr[FilterList] = js.native
}

object DescribeExportTasksReques {
  @scala.inline
  def apply(): DescribeExportTasksReques = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksReques]
  }
  @scala.inline
  implicit class DescribeExportTasksRequesOps[Self <: DescribeExportTasksReques] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withExportTaskIds(value: ExportTaskIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTaskIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportTaskIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportTaskIds")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
  }
  
}

