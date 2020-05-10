package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridResizing
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
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
}

object IgGridResizing {
  @scala.inline
  def apply(): IgGridResizing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResizing]
  }
  @scala.inline
  implicit class IgGridResizingOps[Self <: IgGridResizing] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
  }
  
}

