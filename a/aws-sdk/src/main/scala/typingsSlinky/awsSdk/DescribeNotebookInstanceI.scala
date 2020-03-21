package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeNotebookInstanceInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeNotebookInstanceI extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the notebook instance that you want information about.
    */
  var NotebookInstanceName: typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceName = js.native
}

