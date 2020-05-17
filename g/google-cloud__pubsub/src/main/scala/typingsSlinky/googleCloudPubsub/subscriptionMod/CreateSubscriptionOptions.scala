package typingsSlinky.googleCloudPubsub.subscriptionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.leaseManagerMod.FlowControlOptions
import typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf.IDuration
import typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IDeadLetterPolicy
import typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IExpirationPolicy
import typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.IPushConfig
import typingsSlinky.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @google-cloud/pubsub.@google-cloud/pubsub/build/src/subscription.SubscriptionMetadata & {  gaxOpts ? :google-gax.google-gax.CallOptions,   flowControl ? :@google-cloud/pubsub.@google-cloud/pubsub/build/src/lease-manager.FlowControlOptions} */
@js.native
trait CreateSubscriptionOptions extends js.Object {
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  var deadLetterPolicy: js.UndefOr[IDeadLetterPolicy] = js.native
  var enableMessageOrdering: js.UndefOr[Boolean] = js.native
  var expirationPolicy: js.UndefOr[IExpirationPolicy] = js.native
  var flowControl: js.UndefOr[FlowControlOptions] = js.native
  var gaxOpts: js.UndefOr[CallOptions] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  var messageRetentionDuration: js.UndefOr[IDuration | Double] = js.native
  var name: js.UndefOr[String] = js.native
  var oidcToken: js.UndefOr[OidcToken] = js.native
  var pushConfig: js.UndefOr[IPushConfig] = js.native
  var pushEndpoint: js.UndefOr[String] = js.native
  var retainAckedMessages: js.UndefOr[Boolean] = js.native
  var topic: js.UndefOr[String] = js.native
}

object CreateSubscriptionOptions {
  @scala.inline
  def apply(): CreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubscriptionOptions]
  }
  @scala.inline
  implicit class CreateSubscriptionOptionsOps[Self <: CreateSubscriptionOptions] (val x: Self) extends AnyVal {
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
    def withFlowControl(value: FlowControlOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowControl")(js.undefined)
        ret
    }
    @scala.inline
    def withGaxOpts(value: CallOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaxOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaxOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaxOpts")(js.undefined)
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
    def withMessageRetentionDuration(value: IDuration | Double): Self = {
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
    def withOidcToken(value: OidcToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oidcToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOidcToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oidcToken")(js.undefined)
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
    def withPushEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushEndpoint")(js.undefined)
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
  }
  
}

