package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirelensConfiguration extends js.Object {
  
  /**
    * The options to use when configuring the log router. This field is optional and can be used to specify a custom configuration file or to add additional metadata, such as the task, task definition, cluster, and container instance details to the log event. If specified, the syntax to use is "options":{"enable-ecs-log-metadata":"true|false","config-file-type:"s3|file","config-file-value":"arn:aws:s3:::mybucket/fluent.conf|filepath"}. For more information, see Creating a Task Definition that Uses a FireLens Configuration in the Amazon Elastic Container Service Developer Guide.
    */
  var options: js.UndefOr[FirelensConfigurationOptionsMap] = js.native
  
  /**
    * The log router to use. The valid values are fluentd or fluentbit.
    */
  var `type`: FirelensConfigurationType = js.native
}
object FirelensConfiguration {
  
  @scala.inline
  def apply(`type`: FirelensConfigurationType): FirelensConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirelensConfiguration]
  }
  
  @scala.inline
  implicit class FirelensConfigurationOps[Self <: FirelensConfiguration] (val x: Self) extends AnyVal {
    
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
    def setType(value: FirelensConfigurationType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: FirelensConfigurationOptionsMap): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
