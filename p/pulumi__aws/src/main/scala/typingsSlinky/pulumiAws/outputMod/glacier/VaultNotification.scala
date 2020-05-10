package typingsSlinky.pulumiAws.outputMod.glacier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VaultNotification extends js.Object {
  /**
    * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
    */
  var events: js.Array[String] = js.native
  /**
    * The SNS Topic ARN.
    */
  var snsTopic: String = js.native
}

object VaultNotification {
  @scala.inline
  def apply(events: js.Array[String], snsTopic: String): VaultNotification = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], snsTopic = snsTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[VaultNotification]
  }
  @scala.inline
  implicit class VaultNotificationOps[Self <: VaultNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnsTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snsTopic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

