package typingsSlinky.pulumiAws.deploymentMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.restApiMod.RestApi
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentArgs extends js.Object {
  /**
    * The description of the deployment
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * The description of the stage
    */
  val stageDescription: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the stage. If the specified stage already exists, it will be updated to point to the new deployment. If the stage does not exist, a new one will be created and point to this deployment.
    */
  val stageName: js.UndefOr[Input[String]] = js.native
  /**
    * A map that defines variables for the stage
    */
  val variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object DeploymentArgs {
  @scala.inline
  def apply(restApi: Input[String | RestApi]): DeploymentArgs = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentArgs]
  }
  @scala.inline
  implicit class DeploymentArgsOps[Self <: DeploymentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestApi(value: Input[String | RestApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
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
    def withStageDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withStageName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

