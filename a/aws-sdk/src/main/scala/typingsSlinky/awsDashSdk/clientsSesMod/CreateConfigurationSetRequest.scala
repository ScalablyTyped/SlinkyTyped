package typingsSlinky.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetRequest extends js.Object {
  /**
    * A data structure that contains the name of the configuration set.
    */
  var ConfigurationSet: typingsSlinky.awsDashSdk.clientsSesMod.ConfigurationSet = js.native
}

object CreateConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSet: ConfigurationSet): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSet = ConfigurationSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
}

