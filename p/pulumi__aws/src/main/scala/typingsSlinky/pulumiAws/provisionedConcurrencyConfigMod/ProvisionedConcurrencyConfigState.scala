package typingsSlinky.pulumiAws.provisionedConcurrencyConfigMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedConcurrencyConfigState extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the Lambda Function.
    */
  val functionName: js.UndefOr[Input[String]] = js.native
  /**
    * Amount of capacity to allocate. Must be greater than or equal to `1`.
    */
  val provisionedConcurrentExecutions: js.UndefOr[Input[Double]] = js.native
  /**
    * Lambda Function version or Lambda Alias name.
    */
  val qualifier: js.UndefOr[Input[String]] = js.native
}

object ProvisionedConcurrencyConfigState {
  @scala.inline
  def apply(): ProvisionedConcurrencyConfigState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedConcurrencyConfigState]
  }
  @scala.inline
  implicit class ProvisionedConcurrencyConfigStateOps[Self <: ProvisionedConcurrencyConfigState] (val x: Self) extends AnyVal {
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
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedConcurrentExecutions(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionedConcurrentExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedConcurrentExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionedConcurrentExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifier")(js.undefined)
        ret
    }
  }
  
}

