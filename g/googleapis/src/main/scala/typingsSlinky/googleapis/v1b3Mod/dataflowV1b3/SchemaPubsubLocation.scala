package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a pubsub location to use for transferring data into or out of a
  * streaming Dataflow job.
  */
@js.native
trait SchemaPubsubLocation extends js.Object {
  /**
    * Indicates whether the pipeline allows late-arriving data.
    */
  var dropLateData: js.UndefOr[Boolean] = js.native
  /**
    * If set, contains a pubsub label from which to extract record ids. If left
    * empty, record deduplication will be strictly best effort.
    */
  var idLabel: js.UndefOr[String] = js.native
  /**
    * A pubsub subscription, in the form of
    * &quot;pubsub.googleapis.com/subscriptions/&lt;project-id&gt;/&lt;subscription-name&gt;&quot;
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * If set, contains a pubsub label from which to extract record timestamps.
    * If left empty, record timestamps will be generated upon arrival.
    */
  var timestampLabel: js.UndefOr[String] = js.native
  /**
    * A pubsub topic, in the form of
    * &quot;pubsub.googleapis.com/topics/&lt;project-id&gt;/&lt;topic-name&gt;&quot;
    */
  var topic: js.UndefOr[String] = js.native
  /**
    * If set, specifies the pubsub subscription that will be used for tracking
    * custom time timestamps for watermark estimation.
    */
  var trackingSubscription: js.UndefOr[String] = js.native
  /**
    * If true, then the client has requested to get pubsub attributes.
    */
  var withAttributes: js.UndefOr[Boolean] = js.native
}

object SchemaPubsubLocation {
  @scala.inline
  def apply(): SchemaPubsubLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubLocation]
  }
  @scala.inline
  implicit class SchemaPubsubLocationOps[Self <: SchemaPubsubLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropLateData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropLateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropLateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropLateData")(js.undefined)
        ret
    }
    @scala.inline
    def withIdLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idLabel")(js.undefined)
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
    def withTimestampLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampLabel")(js.undefined)
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
    def withTrackingSubscription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingSubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingSubscription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingSubscription")(js.undefined)
        ret
    }
    @scala.inline
    def withWithAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withAttributes")(js.undefined)
        ret
    }
  }
  
}

