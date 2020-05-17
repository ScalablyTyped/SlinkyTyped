package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PubsubMessage. */
@js.native
trait IPubsubMessage extends js.Object {
  /** PubsubMessage attributes */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.native
  /** PubsubMessage data */
  var data: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** PubsubMessage messageId */
  var messageId: js.UndefOr[String | Null] = js.native
  /** PubsubMessage orderingKey */
  var orderingKey: js.UndefOr[String | Null] = js.native
  /** PubsubMessage publishTime */
  var publishTime: js.UndefOr[ITimestamp | Null] = js.native
}

object IPubsubMessage {
  @scala.inline
  def apply(): IPubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPubsubMessage]
  }
  @scala.inline
  implicit class IPubsubMessageOps[Self <: IPubsubMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(null)
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.Uint8Array): Self = {
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
    def withDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
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
    def withMessageIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageId")(null)
        ret
    }
    @scala.inline
    def withOrderingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderingKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderingKey")(null)
        ret
    }
    @scala.inline
    def withPublishTime(value: ITimestamp): Self = {
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
    @scala.inline
    def withPublishTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishTime")(null)
        ret
    }
  }
  
}

