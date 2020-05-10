package typingsSlinky.awsSdkClientGlacierNode.typesVaultNotificationConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledVaultNotificationConfig extends VaultNotificationConfig {
  /**
    * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
    */
  @JSName("Events")
  var Events_UnmarshalledVaultNotificationConfig: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledVaultNotificationConfig {
  @scala.inline
  def apply(): UnmarshalledVaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledVaultNotificationConfig]
  }
  @scala.inline
  implicit class UnmarshalledVaultNotificationConfigOps[Self <: UnmarshalledVaultNotificationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(js.undefined)
        ret
    }
  }
  
}

