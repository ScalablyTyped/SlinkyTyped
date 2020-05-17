package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PublishResponse. */
@js.native
trait IPublishResponse extends js.Object {
  /** PublishResponse messageIds */
  var messageIds: js.UndefOr[js.Array[String] | Null] = js.native
}

object IPublishResponse {
  @scala.inline
  def apply(): IPublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPublishResponse]
  }
  @scala.inline
  implicit class IPublishResponseOps[Self <: IPublishResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageIds")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageIdsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageIds")(null)
        ret
    }
  }
  
}

