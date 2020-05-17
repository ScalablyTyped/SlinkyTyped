package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.sagemakerMod.NotebookInstanceName
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

object DescribeNotebookInstanceI {
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): DescribeNotebookInstanceI = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookInstanceI]
  }
  @scala.inline
  implicit class DescribeNotebookInstanceIOps[Self <: DescribeNotebookInstanceI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotebookInstanceName(value: NotebookInstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotebookInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

