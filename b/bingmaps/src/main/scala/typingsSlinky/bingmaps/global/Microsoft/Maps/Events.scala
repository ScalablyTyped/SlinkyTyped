package typingsSlinky.bingmaps.global.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.Directions.DirectionsManager
import typingsSlinky.bingmaps.Microsoft.Maps.Directions.IDirectionsErrorEventArgs
import typingsSlinky.bingmaps.Microsoft.Maps.Directions.IDirectionsEventArgs
import typingsSlinky.bingmaps.Microsoft.Maps.DrawingManager
import typingsSlinky.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode
import typingsSlinky.bingmaps.Microsoft.Maps.IDrawingModeChangedData
import typingsSlinky.bingmaps.Microsoft.Maps.IEntityCollectionChangedEventArgs
import typingsSlinky.bingmaps.Microsoft.Maps.IHandlerId
import typingsSlinky.bingmaps.Microsoft.Maps.IInfoboxEventArgs
import typingsSlinky.bingmaps.Microsoft.Maps.IMapTypeChangeEventArgs
import typingsSlinky.bingmaps.Microsoft.Maps.IMouseEventArgs
import typingsSlinky.bingmaps.Microsoft.Maps.IPrimitive
import typingsSlinky.bingmaps.Microsoft.Maps.IPrimitiveChangedEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A static class that manages events within the map SDK. */
object Events {
  
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(target: js.Any, eventName: String, handler: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: DirectionsManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IDirectionsEventArgs | IDirectionsErrorEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: DrawingManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | DrawingMode], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addHandler")
  @js.native
  def addHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = js.native
  
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(target: js.Any, eventName: String, handler: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: DirectionsManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IDirectionsEventArgs | IDirectionsErrorEventArgs], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: DrawingManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | DrawingMode], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: typingsSlinky.bingmaps.Microsoft.Maps.DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: typingsSlinky.bingmaps.Microsoft.Maps.EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = js.native
  @JSGlobal("Microsoft.Maps.Events.addOne")
  @js.native
  def addOne(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = js.native
  
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: js.Any,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: DirectionsManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IDirectionsEventArgs | IDirectionsErrorEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: DrawingManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | DrawingMode], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  @JSGlobal("Microsoft.Maps.Events.addThrottledHandler")
  @js.native
  def addThrottledHandler(
    target: typingsSlinky.bingmaps.Microsoft.Maps.Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  
  @JSGlobal("Microsoft.Maps.Events.hasHandler")
  @js.native
  def hasHandler(target: js.Any, eventName: String): Boolean = js.native
  
  @JSGlobal("Microsoft.Maps.Events.invoke")
  @js.native
  def invoke(target: js.Any, evenName: String, args: js.Any): Unit = js.native
  
  @JSGlobal("Microsoft.Maps.Events.removeHandler")
  @js.native
  def removeHandler(handlerId: IHandlerId): Unit = js.native
}
