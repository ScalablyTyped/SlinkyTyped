package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelemetryMetadata extends js.Object {
  /**
    * The count of messages that the agent sends to the Amazon Inspector service.
    */
  var count: Long = js.native
  /**
    * The data size of messages that the agent sends to the Amazon Inspector service.
    */
  var dataSize: js.UndefOr[Long] = js.native
  /**
    * A specific type of behavioral data that is collected by the agent.
    */
  var messageType: MessageType = js.native
}

object TelemetryMetadata {
  @scala.inline
  def apply(count: Long, messageType: MessageType): TelemetryMetadata = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryMetadata]
  }
  @scala.inline
  implicit class TelemetryMetadataOps[Self <: TelemetryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageType(value: MessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSize(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSize")(js.undefined)
        ret
    }
  }
  
}

