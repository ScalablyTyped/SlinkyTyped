package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of a notification channel. The descriptor includes the
  * properties of the channel and the set of labels or fields that must be
  * specified to configure channels of a given type.
  */
@js.native
trait SchemaNotificationChannelDescriptor extends js.Object {
  /**
    * A human-readable description of the notification channel type. The
    * description may include a description of the properties of the channel
    * and pointers to external documentation.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A human-readable name for the notification channel type. This form of the
    * name is suitable for a user interface.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The set of labels that must be defined to identify a particular channel
    * of the corresponding type. Each label includes a description for how that
    * field should be populated.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.native
  /**
    * The full REST resource name for this descriptor. The syntax is:
    * projects/[PROJECT_ID]/notificationChannelDescriptors/[TYPE] In the above,
    * [TYPE] is the value of the type field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The tiers that support this notification channel; the project service
    * tier must be one of the supported_tiers.
    */
  var supportedTiers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The type of notification channel, such as &quot;email&quot;,
    * &quot;sms&quot;, etc. Notification channel types are globally unique.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaNotificationChannelDescriptor {
  @scala.inline
  def apply(): SchemaNotificationChannelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationChannelDescriptor]
  }
  @scala.inline
  implicit class SchemaNotificationChannelDescriptorOps[Self <: SchemaNotificationChannelDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[SchemaLabelDescriptor]): Self = {
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
    def withSupportedTiers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedTiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedTiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedTiers")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

