package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.sagemakerMod.ProcessingJobName
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeProcessingJobRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeProcessingJobRequ extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
    */
  var ProcessingJobName: typingsSlinky.awsSdk.sagemakerMod.ProcessingJobName = js.native
}

object DescribeProcessingJobRequ {
  @scala.inline
  def apply(ProcessingJobName: ProcessingJobName): DescribeProcessingJobRequ = {
    val __obj = js.Dynamic.literal(ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProcessingJobRequ]
  }
  @scala.inline
  implicit class DescribeProcessingJobRequOps[Self <: DescribeProcessingJobRequ] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessingJobName(value: ProcessingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessingJobName")(value.asInstanceOf[js.Any])
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

