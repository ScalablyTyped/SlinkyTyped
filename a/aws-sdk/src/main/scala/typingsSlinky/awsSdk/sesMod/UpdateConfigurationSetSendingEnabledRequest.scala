package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationSetSendingEnabledRequest extends js.Object {
  /**
    * The name of the configuration set that you want to update.
    */
  var ConfigurationSetName: typingsSlinky.awsSdk.sesMod.ConfigurationSetName = js.native
  /**
    * Describes whether email sending is enabled or disabled for the configuration set. 
    */
  var Enabled: typingsSlinky.awsSdk.sesMod.Enabled = js.native
}

object UpdateConfigurationSetSendingEnabledRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, Enabled: Enabled): UpdateConfigurationSetSendingEnabledRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateConfigurationSetSendingEnabledRequest]
  }
}

