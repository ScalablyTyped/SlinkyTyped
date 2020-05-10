package typingsSlinky.pulumiAws.environmentMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.applicationVersionMod.ApplicationVersion
import typingsSlinky.pulumiAws.elasticbeanstalkApplicationMod.Application
import typingsSlinky.pulumiAws.inputMod.elasticbeanstalk.EnvironmentSetting
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentArgs extends js.Object {
  /**
    * Name of the application that contains the version
    * to be deployed
    */
  val application: Input[String | Application] = js.native
  /**
    * Prefix to use for the fully qualified DNS name of
    * the Environment.
    */
  val cnamePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Short description of the Environment
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The [ARN][2] of the Elastic Beanstalk [Platform][3]
    * to use in deployment
    */
  val platformArn: js.UndefOr[Input[String]] = js.native
  /**
    * The time between polling the AWS API to
    * check if changes have been applied. Use this to adjust the rate of API calls
    * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
    * use the default behavior, which is an exponential backoff
    */
  val pollInterval: js.UndefOr[Input[String]] = js.native
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: js.UndefOr[Input[js.Array[Input[EnvironmentSetting]]]] = js.native
  /**
    * A solution stack to base your environment
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: js.UndefOr[Input[String]] = js.native
  /**
    * A set of tags to apply to the Environment.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The name of the Elastic Beanstalk Configuration
    * template to use in deployment
    */
  val templateName: js.UndefOr[Input[String]] = js.native
  /**
    * Elastic Beanstalk Environment tier. Valid values are `Worker`
    * or `WebServer`. If tier is left blank `WebServer` will be used.
    */
  val tier: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Elastic Beanstalk Application Version
    * to use in deployment.
    */
  val version: js.UndefOr[Input[ApplicationVersion]] = js.native
  /**
    * The maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
    * wait for an Elastic Beanstalk Environment to be in a ready state before timing
    * out.
    */
  val waitForReadyTimeout: js.UndefOr[Input[String]] = js.native
}

object EnvironmentArgs {
  @scala.inline
  def apply(application: Input[String | Application]): EnvironmentArgs = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentArgs]
  }
  @scala.inline
  implicit class EnvironmentArgsOps[Self <: EnvironmentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Input[String | Application]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCnamePrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCnamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cnamePrefix")(js.undefined)
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
    def withPlatformArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPollInterval(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: Input[js.Array[Input[EnvironmentSetting]]]): Self = {
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
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Input[ApplicationVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForReadyTimeout(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForReadyTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForReadyTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForReadyTimeout")(js.undefined)
        ret
    }
  }
  
}

