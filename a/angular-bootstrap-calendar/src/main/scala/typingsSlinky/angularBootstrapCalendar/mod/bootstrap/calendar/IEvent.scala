package typingsSlinky.angularBootstrapCalendar.mod.bootstrap.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvent extends js.Object {
  /**
  	         * Actions of the Event
  	         */
  var actions: js.UndefOr[js.Array[IEventAction]] = js.native
  /**
  	         * If set the event will display as all-day event
  	         */
  var allDay: js.UndefOr[Boolean] = js.native
  /**
  	         * Color of the Event
  	         */
  var color: js.UndefOr[IEventColor] = js.native
  /**
    * A CSS class (or more, just separate with spaces) that will be added to the event when it is displayed on each view. Useful for marking an event as selected / active etc
    */
  var cssClass: js.UndefOr[String] = js.native
  /**
    * If delete-event-html is set and this field is explicitly set to false then dont make it deleteable
    */
  var deletable: js.UndefOr[Boolean] = js.native
  /**
    * Allow an event to be dragged and dropped
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * If edit-event-html is set and this field is explicitly set to false then dont make it editable.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * Optional - a javascript date object for when the event ends
    */
  var endsAt: js.UndefOr[js.Date] = js.native
  /**
    * If set to false then will not count towards the badge total amount on the month and year view
    */
  var incrementsBadgeTotal: js.UndefOr[Boolean] = js.native
  /**
    * If set the event will recur on the given period. Valid values are year or month
    */
  var recursOn: js.UndefOr[String] = js.native
  /**
    * Allow an event to be resizable
    */
  var resizable: js.UndefOr[Boolean] = js.native
  /**
    * A javascript date object for when the event starts
    */
  var startsAt: js.Date = js.native
  /**
    * The title of the event
    */
  var title: String = js.native
  /**
    * The type of the event (determines its color). Can be important, warning, info, inverse, success or special
    */
  var `type`: js.UndefOr[String] = js.native
}

object IEvent {
  @scala.inline
  def apply(startsAt: js.Date, title: String): IEvent = {
    val __obj = js.Dynamic.literal(startsAt = startsAt.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartsAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: js.Array[IEventAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: IEventColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletable")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEndsAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndsAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsAt")(js.undefined)
        ret
    }
    @scala.inline
    def withIncrementsBadgeTotal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementsBadgeTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrementsBadgeTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementsBadgeTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursOn")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
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

