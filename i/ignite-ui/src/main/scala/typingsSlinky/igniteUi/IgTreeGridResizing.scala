package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridResizing
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Resize the column to the size of the longest currently visible cell value.
  	 *
  	 */
  var allowDoubleClickToResize: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after the resizing has been executed and results are rendered
  	 */
  var columnResized: js.UndefOr[ColumnResizedEvent] = js.native
  /**
  	 * Event fired before a resizing operation is executed.
  	 */
  var columnResizing: js.UndefOr[ColumnResizingEvent] = js.native
  /**
  	 * Event fired(only when columnFixing is enabled) when trying to resize column in fixed area so total width of unfixed area to be less than minimalVisibleAreaWidth(option defined in columnFixing)
  	 */
  var columnResizingRefused: js.UndefOr[ColumnResizingRefusedEvent] = js.native
  /**
  	 * A list of column settings that specifies resizing options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridResizingColumnSetting]] = js.native
  /**
  	 * Specifies whether the resizing should be deferred until the user finishes resizing or applied immediately.
  	 *
  	 */
  var deferredResizing: js.UndefOr[Boolean] = js.native
  /**
  	 * The width in pixels of the resizing handle which is position at the right side of each resizeable column header.
  	 *
  	 */
  var handleThreshold: js.UndefOr[Double] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
}

object IgTreeGridResizing {
  @scala.inline
  def apply(): IgTreeGridResizing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridResizing]
  }
  @scala.inline
  implicit class IgTreeGridResizingOps[Self <: IgTreeGridResizing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDoubleClickToResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDoubleClickToResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDoubleClickToResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDoubleClickToResize")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResized(value: (/* event */ Event_, /* ui */ ColumnResizedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResized")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResizing(value: (/* event */ Event_, /* ui */ ColumnResizingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResizingRefused(value: (/* event */ Event_, /* ui */ ColumnResizingRefusedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizingRefused")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutColumnResizingRefused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizingRefused")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSettings(value: js.Array[IgGridResizingColumnSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferredResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferredResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
  }
  
}

