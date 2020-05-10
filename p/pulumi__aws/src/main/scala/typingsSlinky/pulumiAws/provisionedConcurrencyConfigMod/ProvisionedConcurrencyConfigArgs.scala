package typingsSlinky.pulumiAws.provisionedConcurrencyConfigMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedConcurrencyConfigArgs extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the Lambda Function.
    */
  val functionName: Input[String] = js.native
  /**
    * Amount of capacity to allocate. Must be greater than or equal to `1`.
    */
  val provisionedConcurrentExecutions: Input[Double] = js.native
  /**
    * Lambda Function version or Lambda Alias name.
    */
  val qualifier: Input[String] = js.native
}

object ProvisionedConcurrencyConfigArgs {
  @scala.inline
  def apply(
    functionName: Input[String],
    provisionedConcurrentExecutions: Input[Double],
    qualifier: Input[String]
  ): ProvisionedConcurrencyConfigArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], provisionedConcurrentExecutions = provisionedConcurrentExecutions.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedConcurrencyConfigArgs]
  }
  @scala.inline
  implicit class ProvisionedConcurrencyConfigArgsOps[Self <: ProvisionedConcurrencyConfigArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisionedConcurrentExecutions(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionedConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

