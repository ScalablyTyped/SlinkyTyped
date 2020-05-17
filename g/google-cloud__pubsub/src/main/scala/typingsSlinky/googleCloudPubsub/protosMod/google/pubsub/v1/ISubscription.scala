package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.IDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Subscription. */
@js.native
trait ISubscription extends js.Object {
  /** Subscription ackDeadlineSeconds */
  var ackDeadlineSeconds: js.UndefOr[Double | Null] = js.native
  /** Subscription deadLetterPolicy */
  var deadLetterPolicy: js.UndefOr[IDeadLetterPolicy | Null] = js.native
  /** Subscription enableMessageOrdering */
  var enableMessageOrdering: js.UndefOr[Boolean | Null] = js.native
  /** Subscription expirationPolicy */
  var expirationPolicy: js.UndefOr[IExpirationPolicy | Null] = js.native
  /** Subscription labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.native
  /** Subscription messageRetentionDuration */
  var messageRetentionDuration: js.UndefOr[IDuration | Null] = js.native
  /** Subscription name */
  var name: js.UndefOr[String | Null] = js.native
  /** Subscription pushConfig */
  var pushConfig: js.UndefOr[IPushConfig | Null] = js.native
  /** Subscription retainAckedMessages */
  var retainAckedMessages: js.UndefOr[Boolean | Null] = js.native
  /** Subscription topic */
  var topic: js.UndefOr[String | Null] = js.native
}

object ISubscription {
  @scala.inline
  def apply(): ISubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscription]
  }
  @scala.inline
  implicit class ISubscriptionOps[Self <: ISubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAckDeadlineSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackDeadlineSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAckDeadlineSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackDeadlineSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withAckDeadlineSecondsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ackDeadlineSeconds")(null)
        ret
    }
    @scala.inline
    def withDeadLetterPolicy(value: IDeadLetterPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadLetterPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadLetterPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadLetterPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withDeadLetterPolicyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadLetterPolicy")(null)
        ret
    }
    @scala.inline
    def withEnableMessageOrdering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMessageOrdering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMessageOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMessageOrdering")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMessageOrderingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMessageOrdering")(null)
        ret
    }
    @scala.inline
    def withExpirationPolicy(value: IExpirationPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationPolicyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationPolicy")(null)
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
    def withMessageRetentionDuration(value: IDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRetentionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageRetentionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRetentionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageRetentionDurationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageRetentionDuration")(null)
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
    def withPushConfig(value: IPushConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withPushConfigNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushConfig")(null)
        ret
    }
    @scala.inline
    def withRetainAckedMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainAckedMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainAckedMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainAckedMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainAckedMessagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainAckedMessages")(null)
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

