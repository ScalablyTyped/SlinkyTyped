package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
  /**
    * A Source object that specifies the app repository.
    */
  var AppSource: js.UndefOr[Source] = js.native
  /**
    * One or more user-defined key/value pairs to be added to the stack attributes.
    */
  var Attributes: js.UndefOr[AppAttributes] = js.native
  /**
    * The app's data source.
    */
  var DataSources: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.DataSources] = js.native
  /**
    * A description of the app.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The app virtual host settings, with multiple domains separated by commas. For example: 'www.example.com, example.com' 
    */
  var Domains: js.UndefOr[Strings] = js.native
  /**
    * Whether to enable SSL for the app.
    */
  var EnableSsl: js.UndefOr[Boolean] = js.native
  /**
    * An array of EnvironmentVariable objects that specify environment variables to be associated with the app. After you deploy the app, these variables are defined on the associated app server instance. For more information, see  Environment Variables. There is no specific limit on the number of environment variables. However, the size of the associated data structure - which includes the variables' names, values, and protected flag values - cannot exceed 20 KB. This limit should accommodate most if not all use cases. Exceeding it will cause an exception with the message, "Environment: is too large (maximum is 20KB)."  If you have specified one or more environment variables, you cannot modify the stack's Chef version. 
    */
  var Environment: js.UndefOr[EnvironmentVariables] = js.native
  /**
    * The app name.
    */
  var Name: String = js.native
  /**
    * The app's short name.
    */
  var Shortname: js.UndefOr[String] = js.native
  /**
    * An SslConfiguration object with the SSL configuration.
    */
  var SslConfiguration: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.SslConfiguration] = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
  /**
    * The app type. Each supported type is associated with a particular layer. For example, PHP applications are associated with a PHP layer. AWS OpsWorks Stacks deploys an application to those instances that are members of the corresponding layer. If your app isn't one of the standard types, or you prefer to implement your own Deploy recipes, specify other.
    */
  var Type: AppType = js.native
}

object CreateAppRequest {
  @scala.inline
  def apply(Name: String, StackId: String, Type: AppType): CreateAppRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  @scala.inline
  implicit class CreateAppRequestOps[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AppType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppSource")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: AppAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSources(value: DataSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSources")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDomains(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domains")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableSsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableSsl")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: EnvironmentVariables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(js.undefined)
        ret
    }
    @scala.inline
    def withShortname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shortname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shortname")(js.undefined)
        ret
    }
    @scala.inline
    def withSslConfiguration(value: SslConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SslConfiguration")(js.undefined)
        ret
    }
  }
  
}

