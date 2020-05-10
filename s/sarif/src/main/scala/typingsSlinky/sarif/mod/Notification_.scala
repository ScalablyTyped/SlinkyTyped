package typingsSlinky.sarif.mod

import typingsSlinky.sarif.mod.Notification.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification_ extends js.Object {
  /**
    * A reference used to locate the rule descriptor associated with this notification.
    */
  var associatedRule: js.UndefOr[ReportingDescriptorReference] = js.native
  /**
    * A reference used to locate the descriptor relevant to this notification.
    */
  var descriptor: js.UndefOr[ReportingDescriptorReference] = js.native
  /**
    * The runtime exception, if any, relevant to this notification.
    */
  var exception: js.UndefOr[Exception] = js.native
  /**
    * A value specifying the severity level of the notification.
    */
  var level: js.UndefOr[level] = js.native
  /**
    * The locations relevant to this notification.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.native
  /**
    * A message that describes the condition that was encountered.
    */
  var message: Message = js.native
  /**
    * Key/value pairs that provide additional information about the notification.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The thread identifier of the code that generated the notification.
    */
  var threadId: js.UndefOr[Double] = js.native
  /**
    * The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification.
    */
  var timeUtc: js.UndefOr[String] = js.native
}

object Notification_ {
  @scala.inline
  def apply(message: Message): Notification_ = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification_]
  }
  @scala.inline
  implicit class Notification_Ops[Self <: Notification_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatedRule(value: ReportingDescriptorReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedRule")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptor(value: ReportingDescriptorReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withException(value: Exception): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeUtc")(js.undefined)
        ret
    }
  }
  
}

