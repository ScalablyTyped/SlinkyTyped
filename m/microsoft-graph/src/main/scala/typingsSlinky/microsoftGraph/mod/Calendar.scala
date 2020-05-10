package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar extends Entity {
  // The calendar view for the calendar. Navigation property. Read-only.
  var calendarView: js.UndefOr[js.Array[Event]] = js.native
  /**
    * True if the user can write to the calendar, false otherwise. This property is true for the user who created the
    * calendar. This property is also true for a user who has been shared a calendar and granted write access.
    */
  var canEdit: js.UndefOr[Boolean] = js.native
  /**
    * True if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can
    * share it.
    */
  var canShare: js.UndefOr[Boolean] = js.native
  // True if the user can read calendar items that have been marked private, false otherwise.
  var canViewPrivateItems: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This
    * allows Exchange to apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[String] = js.native
  /**
    * Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are:
    * LightBlue=0, LightGreen=1, LightOrange=2, LightGray=3, LightYellow=4, LightTeal=5, LightPink=6, LightBrown=7,
    * LightRed=8, MaxColor=9, Auto=-1
    */
  var color: js.UndefOr[CalendarColor] = js.native
  // The events in the calendar. Navigation property. Read-only.
  var events: js.UndefOr[js.Array[Event]] = js.native
  // The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // The calendar name.
  var name: js.UndefOr[String] = js.native
  /**
    * If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the
    * owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who
    * shared that calendar with the user.
    */
  var owner: js.UndefOr[EmailAddress] = js.native
  // The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
}

object Calendar {
  @scala.inline
  def apply(): Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendar]
  }
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarView(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarView")(js.undefined)
        ret
    }
    @scala.inline
    def withCanEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCanShare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanShare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canShare")(js.undefined)
        ret
    }
    @scala.inline
    def withCanViewPrivateItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canViewPrivateItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanViewPrivateItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canViewPrivateItems")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: CalendarColor): Self = {
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
    def withEvents(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(js.undefined)
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
    def withOwner(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(js.undefined)
        ret
    }
  }
  
}

