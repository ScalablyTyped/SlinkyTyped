package typingsSlinky.reactLeaflet.mod

import slinky.core.facade.ReactElement
import typingsSlinky.leaflet.mod.Control_.Layers
import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.react.mod.Component
import typingsSlinky.reactLeaflet.anon.AddBaseLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "LayersControl")
@js.native
class LayersControl[P /* <: LayersControlProps */, E /* <: Layers */] protected () extends MapControl[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
  
  def addBaseLayer(layer: Layer, name: String, checked: Boolean): Unit = js.native
  
  def addOverlay(layer: Layer, name: String, checked: Boolean): Unit = js.native
  
  var controlProps: AddBaseLayer = js.native
  
  def removeLayer(layer: Layer): Unit = js.native
  
  def removeLayerControl(layer: Layer): Unit = js.native
}
object LayersControl {
  
  @JSImport("react-leaflet", "LayersControl.BaseLayer")
  @js.native
  class BaseLayer[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
    def this(props: ControlledLayerProps) = this()
    
    def addLayer(layer: Layer): Unit = js.native
  }
  
  @JSImport("react-leaflet", "LayersControl.ControlledLayer")
  @js.native
  class ControlledLayer[P /* <: ControlledLayerProps */] protected ()
    extends Component[P, js.Object, js.Any] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
    
    var contextValue: LeafletContext = js.native
    
    var layer: js.UndefOr[Layer | Null] = js.native
    
    def removeLayer(layer: Layer): Unit = js.native
  }
  
  @JSImport("react-leaflet", "LayersControl.Overlay")
  @js.native
  class Overlay[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
    def this(props: ControlledLayerProps) = this()
    
    def addLayer(layer: Layer): Unit = js.native
  }
  
  @js.native
  trait ControlledLayerProps extends StObject {
    
    var addBaseLayer: js.UndefOr[AddLayerHandler] = js.native
    
    var addOverlay: js.UndefOr[AddLayerHandler] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: Children = js.native
    
    var leaflet: js.UndefOr[LeafletContext] = js.native
    
    var name: String = js.native
    
    var removeLayer: js.UndefOr[RemoveLayerHandler] = js.native
    
    var removeLayerControl: js.UndefOr[RemoveLayerHandler] = js.native
  }
  object ControlledLayerProps {
    
    @scala.inline
    def apply(name: String): ControlledLayerProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlledLayerProps]
    }
    
    @scala.inline
    implicit class ControlledLayerPropsMutableBuilder[Self <: ControlledLayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddBaseLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "addBaseLayer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddBaseLayerUndefined: Self = StObject.set(x, "addBaseLayer", js.undefined)
      
      @scala.inline
      def setAddOverlay(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "addOverlay", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddOverlayUndefined: Self = StObject.set(x, "addOverlay", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveLayer(value: /* layer */ Layer => Unit): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveLayerControl(value: /* layer */ Layer => Unit): Self = StObject.set(x, "removeLayerControl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveLayerControlUndefined: Self = StObject.set(x, "removeLayerControl", js.undefined)
      
      @scala.inline
      def setRemoveLayerUndefined: Self = StObject.set(x, "removeLayer", js.undefined)
    }
  }
}
