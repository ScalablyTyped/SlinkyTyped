package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.large
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.medium
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.small
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xlarge
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakpointsOwnerProperties extends js.Object {
  
  /**
    * A convenience property used for defining the breakpoints on the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) and [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view. The sizes specified here determine the values of the [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) and [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint) properties depending on the view's size.  Setting up breakpoints can aid in responsive app design. It does this by watching width and height breakpoints. This is helpful as it removes the need for multiple [`@media` calls](https://developer.mozilla.org/en-US/docs/Web/CSS/Media_Queries). Instead of listening for the view's size and/or resizes property, you can set up a watch handler for either the [widthBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint) or [heightBreakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint) properties of the view.
    * > Please refer to the [styling guide](https://developers.arcgis.com/javascript/latest/guide/styling/index.html#view-size-css-classes) for additional information on working with this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
    */
  var breakpoints: js.UndefOr[BreakpointsOwnerBreakpoints] = js.native
  
  /**
    * A convenience property indicating the general size of the view's height. This value is determined based on where the view's [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) falls in the ranges defined in the [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints) property. See the table below for a list of possible values. Use the [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints) property to override the default thresholds.
    * > Please refer to the [styling guide](https://developers.arcgis.com/javascript/latest/guide/styling/index.html#view-size-css-classes) for additional information on working with this.
    *
    * Possible Value | Description | Default thresholds (pixels)
    * ---------------|-------------|----------------------------
    * xsmall | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is smaller than the value set in the `xsmall` [breakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | < 545
    * small | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is between the values set in the `xsmall` and `small` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 545 - 768
    * medium | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is between the values set in the `small` and `medium` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 769 - 992
    * large | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is between the values set in the `medium` and `large` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 993 - 1200
    * xlarge | The [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) of the view is larger than the value set in the `large` [breakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | > 1200
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint)
    */
  var heightBreakpoint: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
  
  /**
    * A convenience property indicating the general size of the view's width. This value is determined based on where the view's [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) falls in the ranges defined in the [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints) property. See the table below for a list of possible values. Use the [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints) property to override the default thresholds.
    * > Please refer to the [styling guide](https://developers.arcgis.com/javascript/latest/guide/styling/index.html#view-size-css-classes) for additional information on working with this.
    *
    * Possible Value | Description | Default thresholds (pixels)
    * ---------------|-------------|-------------------
    * xsmall | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is smaller than the value set in the `xsmall` [breakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | < 545
    * small | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is between the values set in the `xsmall` and `small` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 545 - 768
    * medium | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is between the values set in the `small` and `medium` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 769 - 992
    * large | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is between the values set in the `medium` and `large` [breakpoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | 993 - 1200
    * xlarge | The [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view is larger than the value set in the `large` [breakpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints). | > 1200
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint)
    */
  var widthBreakpoint: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
}
object BreakpointsOwnerProperties {
  
  @scala.inline
  def apply(): BreakpointsOwnerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakpointsOwnerProperties]
  }
  
  @scala.inline
  implicit class BreakpointsOwnerPropertiesOps[Self <: BreakpointsOwnerProperties] (val x: Self) extends AnyVal {
    
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
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    
    @scala.inline
    def setHeightBreakpoint(value: xsmall | small | medium | large | xlarge): Self = this.set("heightBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightBreakpoint: Self = this.set("heightBreakpoint", js.undefined)
    
    @scala.inline
    def setWidthBreakpoint(value: xsmall | small | medium | large | xlarge): Self = this.set("widthBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthBreakpoint: Self = this.set("widthBreakpoint", js.undefined)
  }
}
