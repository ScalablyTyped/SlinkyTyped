package typingsSlinky.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewOptions extends StObject {
  
  /** The bounding rectangle of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var bounds: js.UndefOr[LocationRect] = js.native
  
  /** The location of the center of the map view. If both bounds and center are specified, bounds takes precedence over center. */
  var center: js.UndefOr[Location] = js.native
  
  /**	The amount the center is shifted in pixels.This property is ignored if center is not specified. */
  var centerOffset: js.UndefOr[Point] = js.native
  
  /**
    * The directional heading of the map. The heading is represented in geometric degrees with 0 or 360 = North, 90 = East,
    * 180 = South, and 270 = West.
    */
  var heading: js.UndefOr[Double] = js.native
  
  /** Indicates how the map labels are displayed. */
  var labelOverlay: js.UndefOr[LabelOverlay] = js.native
  
  /** The map type of the view. */
  var mapTypeId: js.UndefOr[MapTypeId] = js.native
  
  /** The amount of padding in pixels to be added to each side of the bounds of the map view. */
  var padding: js.UndefOr[Double] = js.native
  
  /** The angle relative to the horizon to tilt a streetside panorama image. */
  var pitch: js.UndefOr[Double] = js.native
  
  /** The zoom level of the map view. */
  var zoom: js.UndefOr[Double] = js.native
}
object IViewOptions {
  
  @scala.inline
  def apply(): IViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewOptions]
  }
  
  @scala.inline
  implicit class IViewOptionsMutableBuilder[Self <: IViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LocationRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setCenter(value: Location): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterOffset(value: Point): Self = StObject.set(x, "centerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterOffsetUndefined: Self = StObject.set(x, "centerOffset", js.undefined)
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setLabelOverlay(value: LabelOverlay): Self = StObject.set(x, "labelOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOverlayUndefined: Self = StObject.set(x, "labelOverlay", js.undefined)
    
    @scala.inline
    def setMapTypeId(value: MapTypeId): Self = StObject.set(x, "mapTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypeIdUndefined: Self = StObject.set(x, "mapTypeId", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
