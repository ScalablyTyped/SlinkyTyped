package typingsSlinky.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoggingConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the web ACL for which you want to get the LoggingConfiguration.
    */
  var ResourceArn: typingsSlinky.awsDashSdk.clientsWafMod.ResourceArn = js.native
}

object GetLoggingConfigurationRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): GetLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLoggingConfigurationRequest]
  }
}

