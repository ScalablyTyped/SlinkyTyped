package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Map
import typingsSlinky.primereact.gmapMod.GMapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GMap {
  
  @JSImport("primereact/gmap", "GMap")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactGmapMod.GMap] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMapClick(value: /* event */ Event => Unit): this.type = set("onMapClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMapDragEnd(value: () => Unit): this.type = set("onMapDragEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMapReady(value: /* map */ js.Any => Unit): this.type = set("onMapReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOverlayClick(value: /* e */ Map => Unit): this.type = set("onOverlayClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOverlayDrag(value: /* event */ Event => Unit): this.type = set("onOverlayDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOverlayDragEnd(value: /* event */ Event => Unit): this.type = set("onOverlayDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOverlayDragStart(value: /* event */ Event => Unit): this.type = set("onOverlayDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onZoomChanged(value: () => Unit): this.type = set("onZoomChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def options(value: js.Object): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlays(value: js.Array[_]): this.type = set("overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlaysVarargs(value: js.Any*): this.type = set("overlays", js.Array(value :_*))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GMap.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GMapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
