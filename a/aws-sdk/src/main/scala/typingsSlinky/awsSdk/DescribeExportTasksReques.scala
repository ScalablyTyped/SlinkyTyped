package typingsSlinky.awsSdk

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

