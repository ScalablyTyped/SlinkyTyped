package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SeekRequest. */
@js.native
trait ISeekRequest extends js.Object {
  /** SeekRequest snapshot */
  var snapshot: js.UndefOr[String | Null] = js.native
  /** SeekRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.native
  /** SeekRequest time */
  var time: js.UndefOr[ITimestamp | Null] = js.native
}

object ISeekRequest {
  @scala.inline
  def apply(): ISeekRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeekRequest]
  }
  @scala.inline
  implicit class ISeekRequestOps[Self <: ISeekRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(null)
        ret
    }
    @scala.inline
    def withSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription")(null)
        ret
    }
    @scala.inline
    def withTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(null)
        ret
    }
  }
  
}

