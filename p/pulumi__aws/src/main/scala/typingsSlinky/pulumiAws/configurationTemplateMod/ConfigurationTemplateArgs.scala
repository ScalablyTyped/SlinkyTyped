package typingsSlinky.pulumiAws.configurationTemplateMod

import typingsSlinky.pulumiAws.inputMod.elasticbeanstalk.ConfigurationTemplateSetting
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationTemplateArgs extends js.Object {
  /**
    * name of the application to associate with this configuration template
    */
  val application: Input[String] = js.native
  /**
    * Short description of the Template
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the environment used with this configuration template
    */
  val environmentId: js.UndefOr[Input[String]] = js.native
  /**
    * A unique name for this Template.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: js.UndefOr[Input[js.Array[Input[ConfigurationTemplateSetting]]]] = js.native
  /**
    * A solution stack to base your Template
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: js.UndefOr[Input[String]] = js.native
}

object ConfigurationTemplateArgs {
  @scala.inline
  def apply(application: Input[String]): ConfigurationTemplateArgs = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationTemplateArgs]
  }
  @scala.inline
  implicit class ConfigurationTemplateArgsOps[Self <: ConfigurationTemplateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
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
    def withEnvironmentId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(js.undefined)
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
    def withSettings(value: Input[js.Array[Input[ConfigurationTemplateSetting]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withSolutionStackName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionStackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutionStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutionStackName")(js.undefined)
        ret
    }
  }
  
}

