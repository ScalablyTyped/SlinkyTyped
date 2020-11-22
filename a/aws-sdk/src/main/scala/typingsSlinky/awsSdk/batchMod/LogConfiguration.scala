package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfiguration extends js.Object {
  
  /**
    * The log driver to use for the container. The valid values listed for this parameter are log drivers that the Amazon ECS container agent can communicate with by default. The supported log drivers are awslogs, fluentd, gelf, json-file, journald, logentries, syslog, and splunk.  awslogs  Specifies the Amazon CloudWatch Logs logging driver. For more information, see Using the awslogs Log Driver in the AWS Batch User Guide and Amazon CloudWatch Logs logging driver in the Docker documentation.  fluentd  Specifies the Fluentd logging driver. For more information, including usage and options, see Fluentd logging driver in the Docker documentation.  gelf  Specifies the Graylog Extended Format (GELF) logging driver. For more information, including usage and options, see Graylog Extended Format logging driver in the Docker documentation.  journald  Specifies the journald logging driver. For more information, including usage and options, see Journald logging driver in the Docker documentation.  json-file  Specifies the JSON file logging driver. For more information, including usage and options, see JSON File logging driver in the Docker documentation.  splunk  Specifies the Splunk logging driver. For more information, including usage and options, see Splunk logging driver in the Docker documentation.  syslog  Specifies the syslog logging driver. For more information, including usage and options, see Syslog logging driver in the Docker documentation.    If you have a custom driver that is not listed earlier that you would like to work with the Amazon ECS container agent, you can fork the Amazon ECS container agent project that is available on GitHub and customize it to work with that driver. We encourage you to submit pull requests for changes that you would like to have included. However, Amazon Web Services does not currently support running modified copies of this software.  This parameter requires version 1.18 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log into your container instance and run the following command: sudo docker version | grep "Server API version" 
    */
  var logDriver: LogDriver = js.native
  
  /**
    * The configuration options to send to the log driver. This parameter requires version 1.19 of the Docker Remote API or greater on your container instance. To check the Docker Remote API version on your container instance, log into your container instance and run the following command: sudo docker version | grep "Server API version" 
    */
  var options: js.UndefOr[LogConfigurationOptionsMap] = js.native
  
  /**
    * The secrets to pass to the log configuration. For more information, see Specifying Sensitive Data in the AWS Batch User Guide.
    */
  var secretOptions: js.UndefOr[SecretList] = js.native
}
object LogConfiguration {
  
  @scala.inline
  def apply(logDriver: LogDriver): LogConfiguration = {
    val __obj = js.Dynamic.literal(logDriver = logDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfiguration]
  }
  
  @scala.inline
  implicit class LogConfigurationOps[Self <: LogConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogDriver(value: LogDriver): Self = this.set("logDriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: LogConfigurationOptionsMap): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSecretOptionsVarargs(value: Secret*): Self = this.set("secretOptions", js.Array(value :_*))
    
    @scala.inline
    def setSecretOptions(value: SecretList): Self = this.set("secretOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretOptions: Self = this.set("secretOptions", js.undefined)
  }
}
