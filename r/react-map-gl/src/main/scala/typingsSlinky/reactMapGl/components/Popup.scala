package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.mapboxGl.mod.Anchor
import typingsSlinky.reactMapGl.mod.PopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popup {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): Builder = {
    val __props = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopupProps]))
  }
  
  @JSImport("react-map-gl", "Popup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.Popup] {
    
    @scala.inline
    def altitude(value: Double): this.type = set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def anchor(value: Anchor): this.type = set("anchor", value.asInstanceOf[js.Any])
    
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
    def closeButton(value: Boolean): this.type = set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnClick(value: Boolean): this.type = set("closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dynamicPosition(value: Boolean): this.type = set("dynamicPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetLeft(value: Double): this.type = set("offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def sortByDepth(value: Boolean): this.type = set("sortByDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tipSize(value: Double): this.type = set("tipSize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
