package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateTopicRequest. */
@js.native
trait IUpdateTopicRequest extends js.Object {
  /** UpdateTopicRequest topic */
  var topic: js.UndefOr[ITopic | Null] = js.native
  /** UpdateTopicRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}

object IUpdateTopicRequest {
  @scala.inline
  def apply(): IUpdateTopicRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateTopicRequest]
  }
  @scala.inline
  implicit class IUpdateTopicRequestOps[Self <: IUpdateTopicRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopic(value: ITopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(null)
        ret
    }
    @scala.inline
    def withUpdateMask(value: IFieldMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(null)
        ret
    }
  }
  
}

