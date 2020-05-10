package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration controlling usage of a service.
  */
@js.native
trait SchemaUsage extends js.Object {
  /**
    * The full resource name of a channel used for sending notifications to the
    * service producer.  Google Service Management currently only supports
    * [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification
    * channel. To use Google Cloud Pub/Sub as the channel, this must be the
    * name of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name
    * format documented in https://cloud.google.com/pubsub/docs/overview.
    */
  var producerNotificationChannel: js.UndefOr[String] = js.native
  /**
    * Requirements that must be satisfied before a consumer project can use the
    * service. Each requirement is of the form
    * &lt;service.name&gt;/&lt;requirement-id&gt;; for example
    * &#39;serviceusage.googleapis.com/billing-enabled&#39;.
    */
  var requirements: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of usage rules that apply to individual API methods.  **NOTE:**
    * All service configuration rules follow &quot;last one wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaUsageRule]] = js.native
}

object SchemaUsage {
  @scala.inline
  def apply(): SchemaUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsage]
  }
  @scala.inline
  implicit class SchemaUsageOps[Self <: SchemaUsage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProducerNotificationChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerNotificationChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducerNotificationChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerNotificationChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[SchemaUsageRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

