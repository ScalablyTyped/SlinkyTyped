package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.mapboxGl.mod.FitBoundsOptions
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMapGl.mod.GeolocateControlProps
import typingsSlinky.reactMapGl.mod.PositionOptions
import typingsSlinky.reactMapGl.mod.ViewStateChangeInfo
import typingsSlinky.reactMapGl.mod.ViewportProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeolocateControl {
  
  @JSImport("react-map-gl", "GeolocateControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.GeolocateControl] {
    
    @scala.inline
    def auto(value: Boolean): this.type = set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureClick(value: Boolean): this.type = set("captureClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureDoubleClick(value: Boolean): this.type = set("captureDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureDrag(value: Boolean): this.type = set("captureDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureScroll(value: Boolean): this.type = set("captureScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fitBoundsOptions(value: FitBoundsOptions): this.type = set("fitBoundsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onGeolocate(value: /* options */ PositionOptions => Unit): this.type = set("onGeolocate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onViewStateChange(value: /* info */ ViewStateChangeInfo => Unit): this.type = set("onViewStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onViewportChange(value: /* viewState */ ViewportProps => Unit): this.type = set("onViewportChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def positionOptions(value: typingsSlinky.mapboxGl.mod.PositionOptions): this.type = set("positionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showUserLocation(value: Boolean): this.type = set("showUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def trackUserLocation(value: Boolean): this.type = set("trackUserLocation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: GeolocateControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GeolocateControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
