package typingsSlinky.pulumiAws.lambdaAliasMod

import typingsSlinky.pulumiAws.inputMod.lambda.AliasRoutingConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasArgs extends js.Object {
  /**
    * Description of the alias.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The function ARN of the Lambda function for which you want to create an alias.
    */
  val functionName: Input[String] = js.native
  /**
    * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
    */
  val functionVersion: Input[String] = js.native
  /**
    * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Lambda alias' route configuration settings. Fields documented below
    */
  val routingConfig: js.UndefOr[Input[AliasRoutingConfig]] = js.native
}

object AliasArgs {
  @scala.inline
  def apply(functionName: Input[String], functionVersion: Input[String]): AliasArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasArgs]
  }
  @scala.inline
  implicit class AliasArgsOps[Self <: AliasArgs] (val x: Self) extends AnyVal {
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
    def withFunctionVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingConfig(value: Input[AliasRoutingConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingConfig")(js.undefined)
        ret
    }
  }
  
}

