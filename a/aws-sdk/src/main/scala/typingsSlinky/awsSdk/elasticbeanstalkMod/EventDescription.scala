package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDescription extends js.Object {
  /**
    * The application associated with the event.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The name of the environment associated with this event.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The date when the event occurred.
    */
  var EventDate: js.UndefOr[js.Date] = js.native
  /**
    * The event message.
    */
  var Message: js.UndefOr[EventMessage] = js.native
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The web service request ID for the activity of this event.
    */
  var RequestId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.RequestId] = js.native
  /**
    * The severity level of this event.
    */
  var Severity: js.UndefOr[EventSeverity] = js.native
  /**
    * The name of the configuration associated with this event.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
  /**
    * The release label for the application version associated with this event.
    */
  var VersionLabel: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}

object EventDescription {
  @scala.inline
  def apply(): EventDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDescription]
  }
  @scala.inline
  implicit class EventDescriptionOps[Self <: EventDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: EventMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformArn(value: PlatformArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestId(value: RequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: EventSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateName(value: ConfigurationTemplateName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionLabel(value: VersionLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionLabel")(js.undefined)
        ret
    }
  }
  
}

