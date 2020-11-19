package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMapGl.mod.DragEvent
import typingsSlinky.reactMapGl.mod.MarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Marker {
  
  @JSImport("react-map-gl", "Marker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.Marker] {
    
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
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetLeft(value: Double): this.type = set("offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(value: /* event */ DragEvent => Unit): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnd(value: /* event */ DragEvent => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: /* event */ DragEvent => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): Builder = {
    val __props = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MarkerProps]))
  }
}
