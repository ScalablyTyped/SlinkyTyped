package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFeatureTransformationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the feature transformation to describe.
    */
  var featureTransformationArn: Arn = js.native
}

object DescribeFeatureTransformationRequest {
  @scala.inline
  def apply(featureTransformationArn: Arn): DescribeFeatureTransformationRequest = {
    val __obj = js.Dynamic.literal(featureTransformationArn = featureTransformationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFeatureTransformationRequest]
  }
  @scala.inline
  implicit class DescribeFeatureTransformationRequestOps[Self <: DescribeFeatureTransformationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureTransformationArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureTransformationArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

