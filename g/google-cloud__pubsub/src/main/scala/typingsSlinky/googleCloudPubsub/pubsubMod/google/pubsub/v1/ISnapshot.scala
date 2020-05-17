package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Snapshot. */
@js.native
trait ISnapshot extends js.Object {
  /** Snapshot expireTime */
  var expireTime: js.UndefOr[ITimestamp | Null] = js.native
  /** Snapshot labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.native
  /** Snapshot name */
  var name: js.UndefOr[String | Null] = js.native
  /** Snapshot topic */
  var topic: js.UndefOr[String | Null] = js.native
}

object ISnapshot {
  @scala.inline
  def apply(): ISnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISnapshot]
  }
  @scala.inline
  implicit class ISnapshotOps[Self <: ISnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpireTime(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpireTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpireTimeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expireTime")(null)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
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
  }
  
}

