package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.sagemakerMod.TransformJobName
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeTransformJobRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeTransformJobReque extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the transform job that you want to view details of.
    */
  var TransformJobName: typingsSlinky.awsSdk.sagemakerMod.TransformJobName = js.native
}

object DescribeTransformJobReque {
  @scala.inline
  def apply(TransformJobName: TransformJobName): DescribeTransformJobReque = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransformJobReque]
  }
  @scala.inline
  implicit class DescribeTransformJobRequeOps[Self <: DescribeTransformJobReque] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformJobName(value: TransformJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformJobName")(value.asInstanceOf[js.Any])
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

