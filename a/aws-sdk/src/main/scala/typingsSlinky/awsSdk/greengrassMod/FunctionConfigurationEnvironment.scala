package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionConfigurationEnvironment extends js.Object {
  /**
    * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass container.
    */
  var AccessSysfs: js.UndefOr[boolean] = js.native
  /**
    * Configuration related to executing the Lambda function
    */
  var Execution: js.UndefOr[FunctionExecutionConfig] = js.native
  /**
    * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a Greengrass container.
    */
  var ResourceAccessPolicies: js.UndefOr[listOfResourceAccessPolicy] = js.native
  /**
    * Environment variables for the Lambda function's configuration.
    */
  var Variables: js.UndefOr[mapOfString] = js.native
}

object FunctionConfigurationEnvironment {
  @scala.inline
  def apply(): FunctionConfigurationEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfigurationEnvironment]
  }
  @scala.inline
  implicit class FunctionConfigurationEnvironmentOps[Self <: FunctionConfigurationEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessSysfs(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessSysfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessSysfs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessSysfs")(js.undefined)
        ret
    }
    @scala.inline
    def withExecution(value: FunctionExecutionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execution")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAccessPolicies(value: listOfResourceAccessPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAccessPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAccessPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAccessPolicies")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: mapOfString): Self = {
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

