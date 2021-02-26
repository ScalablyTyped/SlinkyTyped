package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridTooltips
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A list of custom column settings that specify custom tooltip settings for a specific column (whether tooltips are enabled / disabled)
    *
    */
  var columnSettings: js.UndefOr[IgGridTooltipsColumnSettings] = js.native
  
  /**
    * Sets the left position of the tooltip relative to the mouse cursor
    *
    */
  var cursorLeftOffset: js.UndefOr[Double] = js.native
  
  /**
    * Sets the top position of the tooltip relative to the mouse cursor
    *
    */
  var cursorTopOffset: js.UndefOr[Double] = js.native
  
  /**
    * Sets the time tooltip fades in and out when showing/hiding
    *
    */
  var fadeTimespan: js.UndefOr[Double] = js.native
  
  /**
    * Type="integer" The time in milliseconds after which tooltip hides when mouse
    * cursor gets outside of the cell.
    *
    */
  var hideDelay: js.UndefOr[Double] = js.native
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
  /**
    * The time in milliseconds after which tooltip will show when
    * mouse cursor is hovered over a cell.
    *
    */
  var showDelay: js.UndefOr[Double] = js.native
  
  /**
    * Controls the tooltip's style
    *
    *
    * Valid values:
    * "tooltip" The tooltip will be positioned according to the mouse cursor. Will render the tooltip content as plain text.
    * "popover" The tooltip will be positioned according to the target element with an arrow pointing the element. This style is more suitable for touch-supported environments. Will render the tooltip content as HTML.
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    * Event fired after a tooltip is hidden
    */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.native
  
  /**
    * Event fired when the mouse has left an element and the tooltip is about to hide
    */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.native
  
  /**
    * Event fired when the mouse has hovered on an element long enough to display a tooltip
    */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.native
  
  /**
    * Event fired after a tooltip is shown
    */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  
  /**
    * Determines the tooltip visibility option
    *
    *
    * Valid values:
    * "always" tooltips always show for hovered elements
    * "never" tooltips do not show automatically
    * "overflow" tooltips show only when the underlying data overflows its container
    */
  var visibility: js.UndefOr[String] = js.native
}
object IgGridTooltips {
  
  @scala.inline
  def apply(): IgGridTooltips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridTooltips]
  }
  
  @scala.inline
  implicit class IgGridTooltipsMutableBuilder[Self <: IgGridTooltips] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnSettings(value: IgGridTooltipsColumnSettings): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    @scala.inline
    def setCursorLeftOffset(value: Double): Self = StObject.set(x, "cursorLeftOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorLeftOffsetUndefined: Self = StObject.set(x, "cursorLeftOffset", js.undefined)
    
    @scala.inline
    def setCursorTopOffset(value: Double): Self = StObject.set(x, "cursorTopOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorTopOffsetUndefined: Self = StObject.set(x, "cursorTopOffset", js.undefined)
    
    @scala.inline
    def setFadeTimespan(value: Double): Self = StObject.set(x, "fadeTimespan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeTimespanUndefined: Self = StObject.set(x, "fadeTimespan", js.undefined)
    
    @scala.inline
    def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = StObject.set(x, "tooltipHidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipHiddenUndefined: Self = StObject.set(x, "tooltipHidden", js.undefined)
    
    @scala.inline
    def setTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = StObject.set(x, "tooltipHiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipHidingUndefined: Self = StObject.set(x, "tooltipHiding", js.undefined)
    
    @scala.inline
    def setTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = StObject.set(x, "tooltipShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipShowingUndefined: Self = StObject.set(x, "tooltipShowing", js.undefined)
    
    @scala.inline
    def setTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = StObject.set(x, "tooltipShown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipShownUndefined: Self = StObject.set(x, "tooltipShown", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
