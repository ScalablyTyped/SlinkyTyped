package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.landscape
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.large
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.medium
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.portrait
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.small
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xlarge
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakpointsOwner extends StObject {
  
  /**
    * A convenience property used for defining the breakpoints on the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) and [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
    */
  var breakpoints: BreakpointsOwnerBreakpoints = js.native
  
  /**
    * A convenience property indicating the general size of the view's height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint)
    */
  var heightBreakpoint: xsmall | small | medium | large | xlarge = js.native
  
  /**
    * A convenience property indicating the view's orientation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#orientation)
    */
  val orientation: landscape | portrait = js.native
  
  /**
    * A convenience property indicating the general size of the view's width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint)
    */
  var widthBreakpoint: xsmall | small | medium | large | xlarge = js.native
}
object BreakpointsOwner {
  
  @scala.inline
  def apply(
    breakpoints: BreakpointsOwnerBreakpoints,
    heightBreakpoint: xsmall | small | medium | large | xlarge,
    orientation: landscape | portrait,
    widthBreakpoint: xsmall | small | medium | large | xlarge
  ): BreakpointsOwner = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], heightBreakpoint = heightBreakpoint.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], widthBreakpoint = widthBreakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointsOwner]
  }
  
  @scala.inline
  implicit class BreakpointsOwnerMutableBuilder[Self <: BreakpointsOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoints(value: BreakpointsOwnerBreakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightBreakpoint(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "heightBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: landscape | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthBreakpoint(value: xsmall | small | medium | large | xlarge): Self = StObject.set(x, "widthBreakpoint", value.asInstanceOf[js.Any])
  }
}
