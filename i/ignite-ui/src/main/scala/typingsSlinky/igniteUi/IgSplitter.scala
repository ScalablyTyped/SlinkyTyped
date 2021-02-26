package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSplitter
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Fired after collapsing is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    *                 Use ui.index to get an index of collapsed panel.
    */
  var collapsed: js.UndefOr[CollapsedEvent] = js.native
  
  /**
    * Specifies drag delta of the split bar. In order to start dragging "move", the mouse has to be moved specific distance from its original position.
    *
    */
  var dragDelta: js.UndefOr[Double] = js.native
  
  /**
    * Fired after expanding is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    *                 Use ui.index to get an index of expanded panel.
    */
  var expanded: js.UndefOr[ExpandedEvent] = js.native
  
  /**
    * Gets/Sets the height of the container.
    *
    *
    * Valid values:
    * "null" will fit the tree inside its parent container, if no other widths are defined.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Fired after the panels are refreshed because of browser"s resizing.
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var layoutRefreshed: js.UndefOr[LayoutRefreshedEvent] = js.native
  
  /**
    * Fired before the panels are refreshed because of browser"s resizing.
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var layoutRefreshing: js.UndefOr[LayoutRefreshingEvent] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies the orientation of the splitter.
    *
    *
    * Valid values:
    * "vertical"
    * "horizontal"
    */
  var orientation: js.UndefOr[String] = js.native
  
  /**
    * Array of objects options that specify the panels settings. The panels are no more than two. Settings are specified via enumeration.
    *
    */
  var panels: js.UndefOr[js.Array[IgSplitterPanel]] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Fired after split bar move is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var resizeEnded: js.UndefOr[ResizeEndedEvent] = js.native
  
  /**
    * Specifies whether the other splitters on the page will be resized as this splitter resizes.
    *
    */
  var resizeOtherSplitters: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired before split bar move is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var resizeStarted: js.UndefOr[ResizeStartedEvent] = js.native
  
  /**
    * Fired while split bar move is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var resizing: js.UndefOr[ResizingEvent] = js.native
  
  /**
    * Gets/Sets the width of the container.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgSplitter {
  
  @scala.inline
  def apply(): IgSplitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitter]
  }
  
  @scala.inline
  implicit class IgSplitterMutableBuilder[Self <: IgSplitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = StObject.set(x, "collapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setDragDelta(value: Double): Self = StObject.set(x, "dragDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDeltaUndefined: Self = StObject.set(x, "dragDelta", js.undefined)
    
    @scala.inline
    def setExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = StObject.set(x, "expanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLayoutRefreshed(value: (/* event */ Event, /* ui */ LayoutRefreshedEventUIParam) => Unit): Self = StObject.set(x, "layoutRefreshed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLayoutRefreshedUndefined: Self = StObject.set(x, "layoutRefreshed", js.undefined)
    
    @scala.inline
    def setLayoutRefreshing(value: (/* event */ Event, /* ui */ LayoutRefreshingEventUIParam) => Unit): Self = StObject.set(x, "layoutRefreshing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLayoutRefreshingUndefined: Self = StObject.set(x, "layoutRefreshing", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPanels(value: js.Array[IgSplitterPanel]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
    
    @scala.inline
    def setPanelsVarargs(value: IgSplitterPanel*): Self = StObject.set(x, "panels", js.Array(value :_*))
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setResizeEnded(value: (/* event */ Event, /* ui */ ResizeEndedEventUIParam) => Unit): Self = StObject.set(x, "resizeEnded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResizeEndedUndefined: Self = StObject.set(x, "resizeEnded", js.undefined)
    
    @scala.inline
    def setResizeOtherSplitters(value: Boolean): Self = StObject.set(x, "resizeOtherSplitters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeOtherSplittersUndefined: Self = StObject.set(x, "resizeOtherSplitters", js.undefined)
    
    @scala.inline
    def setResizeStarted(value: (/* event */ Event, /* ui */ ResizeStartedEventUIParam) => Unit): Self = StObject.set(x, "resizeStarted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResizeStartedUndefined: Self = StObject.set(x, "resizeStarted", js.undefined)
    
    @scala.inline
    def setResizing(value: (/* event */ Event, /* ui */ ResizingEventUIParam) => Unit): Self = StObject.set(x, "resizing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResizingUndefined: Self = StObject.set(x, "resizing", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
