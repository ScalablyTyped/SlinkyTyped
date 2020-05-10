package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionEnvironment extends js.Object {
  /**
    * An AwsLambdaFunctionEnvironmentError object.
    */
  var Error: js.UndefOr[AwsLambdaFunctionEnvironmentError] = js.native
  /**
    * Environment variable key-value pairs.
    */
  var Variables: js.UndefOr[FieldMap] = js.native
}

object AwsLambdaFunctionEnvironment {
  @scala.inline
  def apply(): AwsLambdaFunctionEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionEnvironment]
  }
  @scala.inline
  implicit class AwsLambdaFunctionEnvironmentOps[Self <: AwsLambdaFunctionEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: AwsLambdaFunctionEnvironmentError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: FieldMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Variables")(js.undefined)
        ret
    }
  }
  
}

