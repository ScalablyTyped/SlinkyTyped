package typingsSlinky.awsSdkClientGlacierNode.typesVaultNotificationConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultNotificationConfig extends js.Object {
  /**
    * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
    */
  var Events: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).</p>
    */
  var SNSTopic: js.UndefOr[String] = js.native
}

object VaultNotificationConfig {
  @scala.inline
  def apply(): VaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultNotificationConfig]
  }
  @scala.inline
  implicit class VaultNotificationConfigOps[Self <: VaultNotificationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String] | js.Iterable[String]): Self = {
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
    @scala.inline
    def withSNSTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSTopic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSNSTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SNSTopic")(js.undefined)
        ret
    }
  }
  
}

