package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.landscape
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.large
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.medium
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.portrait
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.small
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xlarge
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakpointsOwner extends js.Object {
  
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
  implicit class BreakpointsOwnerOps[Self <: BreakpointsOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBreakpoints(value: BreakpointsOwnerBreakpoints): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightBreakpoint(value: xsmall | small | medium | large | xlarge): Self = this.set("heightBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: landscape | portrait): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthBreakpoint(value: xsmall | small | medium | large | xlarge): Self = this.set("widthBreakpoint", value.asInstanceOf[js.Any])
  }
}
