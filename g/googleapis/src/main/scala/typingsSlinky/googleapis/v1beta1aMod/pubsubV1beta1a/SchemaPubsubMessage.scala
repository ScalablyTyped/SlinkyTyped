package typingsSlinky.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message data and its labels.
  */
@js.native
trait SchemaPubsubMessage extends js.Object {
  /**
    * The message payload.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Optional list of labels for this message. Keys in this collection must be
    * unique.
    */
  var label: js.UndefOr[js.Array[SchemaLabel]] = js.native
  /**
    * ID of this message assigned by the server at publication time. Guaranteed
    * to be unique within the topic. This value may be read by a subscriber
    * that receives a PubsubMessage via a Pull call or a push delivery. It must
    * not be populated by a publisher in a Publish call.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * The time at which the message was published. The time is milliseconds
    * since the UNIX epoch.
    */
  var publishTime: js.UndefOr[String] = js.native
}

object SchemaPubsubMessage {
  @scala.inline
  def apply(): SchemaPubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubMessage]
  }
  @scala.inline
  implicit class SchemaPubsubMessageOps[Self <: SchemaPubsubMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: js.Array[SchemaLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishTime")(js.undefined)
        ret
    }
  }
  
}

