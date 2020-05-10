package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransformJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typingsSlinky.awsSdk.sagemakerMod.TransformJobArn = js.native
}

object CreateTransformJobResponse {
  @scala.inline
  def apply(TransformJobArn: TransformJobArn): CreateTransformJobResponse = {
    val __obj = js.Dynamic.literal(TransformJobArn = TransformJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransformJobResponse]
  }
  @scala.inline
  implicit class CreateTransformJobResponseOps[Self <: CreateTransformJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformJobArn(value: TransformJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformJobArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

