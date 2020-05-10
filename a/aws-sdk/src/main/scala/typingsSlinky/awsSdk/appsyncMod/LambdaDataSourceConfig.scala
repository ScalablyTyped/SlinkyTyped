package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaDataSourceConfig extends js.Object {
  /**
    * The ARN for the Lambda function.
    */
  var lambdaFunctionArn: String = js.native
}

object LambdaDataSourceConfig {
  @scala.inline
  def apply(lambdaFunctionArn: String): LambdaDataSourceConfig = {
    val __obj = js.Dynamic.literal(lambdaFunctionArn = lambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaDataSourceConfig]
  }
  @scala.inline
  implicit class LambdaDataSourceConfigOps[Self <: LambdaDataSourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLambdaFunctionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaFunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

