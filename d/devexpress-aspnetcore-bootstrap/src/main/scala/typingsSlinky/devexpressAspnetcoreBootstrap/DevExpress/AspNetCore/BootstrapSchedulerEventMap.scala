package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSchedulerEventMap extends ControlEventMap {
  var activeViewChanged: EventArgs = js.native
  var activeViewChanging: ActiveViewChangingEventArgs = js.native
  var appointmentClick: AppointmentClickEventArgs = js.native
  var appointmentDeleting: AppointmentDeletingEventArgs = js.native
  var appointmentDoubleClick: AppointmentClickEventArgs = js.native
  var appointmentDrag: AppointmentDragEventArgs = js.native
  var appointmentDrop: AppointmentDropEventArgs = js.native
  var appointmentResize: AppointmentResizeEventArgs = js.native
  var appointmentResizing: AppointmentResizingEventArgs = js.native
  var appointmentToolTipShowing: AppointmentToolTipShowingEventArgs = js.native
  var appointmentsSelectionChanged: AppointmentsSelectionEventArgs = js.native
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var cellClick: CellClickEventArgs = js.native
  var cellDoubleClick: CellClickEventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var menuItemClicked: MenuItemClickedEventArgs = js.native
  var moreButtonClicked: MoreButtonClickedEventArgs = js.native
  var selectionChanged: EventArgs = js.native
  var selectionChanging: EventArgs = js.native
  var shortcut: ShortcutEventArgs = js.native
  var visibleIntervalChanged: EventArgs = js.native
}

object BootstrapSchedulerEventMap {
  @scala.inline
  def apply(
    activeViewChanged: EventArgs,
    activeViewChanging: ActiveViewChangingEventArgs,
    appointmentClick: AppointmentClickEventArgs,
    appointmentDeleting: AppointmentDeletingEventArgs,
    appointmentDoubleClick: AppointmentClickEventArgs,
    appointmentDrag: AppointmentDragEventArgs,
    appointmentDrop: AppointmentDropEventArgs,
    appointmentResize: AppointmentResizeEventArgs,
    appointmentResizing: AppointmentResizingEventArgs,
    appointmentToolTipShowing: AppointmentToolTipShowingEventArgs,
    appointmentsSelectionChanged: AppointmentsSelectionEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    cellClick: CellClickEventArgs,
    cellDoubleClick: CellClickEventArgs,
    endCallback: EndCallbackEventArgs,
    init: EventArgs,
    menuItemClicked: MenuItemClickedEventArgs,
    moreButtonClicked: MoreButtonClickedEventArgs,
    selectionChanged: EventArgs,
    selectionChanging: EventArgs,
    shortcut: ShortcutEventArgs,
    visibleIntervalChanged: EventArgs
  ): BootstrapSchedulerEventMap = {
    val __obj = js.Dynamic.literal(activeViewChanged = activeViewChanged.asInstanceOf[js.Any], activeViewChanging = activeViewChanging.asInstanceOf[js.Any], appointmentClick = appointmentClick.asInstanceOf[js.Any], appointmentDeleting = appointmentDeleting.asInstanceOf[js.Any], appointmentDoubleClick = appointmentDoubleClick.asInstanceOf[js.Any], appointmentDrag = appointmentDrag.asInstanceOf[js.Any], appointmentDrop = appointmentDrop.asInstanceOf[js.Any], appointmentResize = appointmentResize.asInstanceOf[js.Any], appointmentResizing = appointmentResizing.asInstanceOf[js.Any], appointmentToolTipShowing = appointmentToolTipShowing.asInstanceOf[js.Any], appointmentsSelectionChanged = appointmentsSelectionChanged.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], cellClick = cellClick.asInstanceOf[js.Any], cellDoubleClick = cellDoubleClick.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], menuItemClicked = menuItemClicked.asInstanceOf[js.Any], moreButtonClicked = moreButtonClicked.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], selectionChanging = selectionChanging.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], visibleIntervalChanged = visibleIntervalChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerEventMap]
  }
  @scala.inline
  implicit class BootstrapSchedulerEventMapOps[Self <: BootstrapSchedulerEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveViewChanged(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeViewChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveViewChanging(value: ActiveViewChangingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeViewChanging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentClick(value: AppointmentClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentDeleting(value: AppointmentDeletingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDeleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentDoubleClick(value: AppointmentClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDoubleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentDrag(value: AppointmentDragEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentDrop(value: AppointmentDropEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentResize(value: AppointmentResizeEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentResizing(value: AppointmentResizingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentToolTipShowing(value: AppointmentToolTipShowingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentToolTipShowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppointmentsSelectionChanged(value: AppointmentsSelectionEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentsSelectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginCallback(value: BeginCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackError(value: CallbackErrorEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellClick(value: CellClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellDoubleClick(value: CellClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDoubleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCallback(value: EndCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemClicked(value: MenuItemClickedEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemClicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoreButtonClicked(value: MoreButtonClickedEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreButtonClicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionChanged(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionChanging(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcut(value: ShortcutEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleIntervalChanged(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIntervalChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

