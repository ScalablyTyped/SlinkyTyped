package typingsSlinky.pulumiAws.opsworksApplicationMod

import typingsSlinky.pulumiAws.inputMod.opsworks.ApplicationAppSource
import typingsSlinky.pulumiAws.inputMod.opsworks.ApplicationEnvironment
import typingsSlinky.pulumiAws.inputMod.opsworks.ApplicationSslConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationArgs extends js.Object {
  /**
    * SCM configuration of the app as described below.
    */
  val appSources: js.UndefOr[Input[js.Array[Input[ApplicationAppSource]]]] = js.native
  /**
    * Run bundle install when deploying for application of type `rails`.
    */
  val autoBundleOnDeploy: js.UndefOr[Input[String]] = js.native
  /**
    * Specify activity and workflow workers for your app using the aws-flow gem.
    */
  val awsFlowRubySettings: js.UndefOr[Input[String]] = js.native
  /**
    * The data source's ARN.
    */
  val dataSourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The database name.
    */
  val dataSourceDatabaseName: js.UndefOr[Input[String]] = js.native
  /**
    * The data source's type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
    */
  val dataSourceType: js.UndefOr[Input[String]] = js.native
  /**
    * A description of the app.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Subfolder for the document root for application of type `rails`.
    */
  val documentRoot: js.UndefOr[Input[String]] = js.native
  /**
    * A list of virtual host alias.
    */
  val domains: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
    */
  val enableSsl: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Object to define environment variables.  Object is described below.
    */
  val environments: js.UndefOr[Input[js.Array[Input[ApplicationEnvironment]]]] = js.native
  /**
    * A human-readable name for the application.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Rails environment for application of type `rails`.
    */
  val railsEnv: js.UndefOr[Input[String]] = js.native
  /**
    * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
    */
  val shortName: js.UndefOr[Input[String]] = js.native
  /**
    * The SSL configuration of the app. Object is described below.
    */
  val sslConfigurations: js.UndefOr[Input[js.Array[Input[ApplicationSslConfiguration]]]] = js.native
  /**
    * The id of the stack the application will belong to.
    */
  val stackId: Input[String] = js.native
  /**
    * The type of source to use. For example, "archive".
    */
  val `type`: Input[String] = js.native
}

object ApplicationArgs {
  @scala.inline
  def apply(stackId: Input[String], `type`: Input[String]): ApplicationArgs = {
    val __obj = js.Dynamic.literal(stackId = stackId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationArgs]
  }
  @scala.inline
  implicit class ApplicationArgsOps[Self <: ApplicationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppSources(value: Input[js.Array[Input[ApplicationAppSource]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appSources")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBundleOnDeploy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBundleOnDeploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBundleOnDeploy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBundleOnDeploy")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsFlowRubySettings(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsFlowRubySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsFlowRubySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsFlowRubySettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceDatabaseName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceDatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceType")(js.undefined)
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
    def withDocumentRoot(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withDomains(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSsl(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSsl")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironments(value: Input[js.Array[Input[ApplicationEnvironment]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(js.undefined)
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
    def withRailsEnv(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railsEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailsEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railsEnv")(js.undefined)
        ret
    }
    @scala.inline
    def withShortName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(js.undefined)
        ret
    }
    @scala.inline
    def withSslConfigurations(value: Input[js.Array[Input[ApplicationSslConfiguration]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslConfigurations")(js.undefined)
        ret
    }
  }
  
}

