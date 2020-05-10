package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionLayer extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Integer] = js.native
}

object AwsLambdaFunctionLayer {
  @scala.inline
  def apply(): AwsLambdaFunctionLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionLayer]
  }
  @scala.inline
  implicit class AwsLambdaFunctionLayerOps[Self <: AwsLambdaFunctionLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeSize")(js.undefined)
        ret
    }
  }
  
}

