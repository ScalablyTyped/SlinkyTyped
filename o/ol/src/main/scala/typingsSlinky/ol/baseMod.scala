package typingsSlinky.ol

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.layerLayerMod.State
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonextent
import typingsSlinky.ol.olStrings.changeColonmaxResolution
import typingsSlinky.ol.olStrings.changeColonmaxZoom
import typingsSlinky.ol.olStrings.changeColonminResolution
import typingsSlinky.ol.olStrings.changeColonminZoom
import typingsSlinky.ol.olStrings.changeColonopacity
import typingsSlinky.ol.olStrings.changeColonvisible
import typingsSlinky.ol.olStrings.changeColonzIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("ol/layer/Base", JSImport.Default)
  @js.native
  class default protected () extends BaseLayer {
    def this(options: Options) = this()
  }
  
  @js.native
  trait BaseLayer
    extends typingsSlinky.ol.objectMod.default {
    
    def getClassName(): String = js.native
    
    /**
      * Return the {@link module:ol/extent~Extent extent} of the layer or undefined if it
      * will be visible regardless of extent.
      */
    def getExtent(): js.UndefOr[Extent] = js.native
    
    /**
      * This method is not meant to be called by layers or layer renderers because the state
      * is incorrect if the layer is included in a layer group.
      */
    def getLayerState(): State = js.native
    def getLayerState(opt_managed: Boolean): State = js.native
    
    def getLayerStatesArray(): js.Array[State] = js.native
    def getLayerStatesArray(opt_states: js.Array[State]): js.Array[State] = js.native
    
    def getLayersArray(): js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] = js.native
    def getLayersArray(
      opt_array: js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]]
    ): js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] = js.native
    
    /**
      * Return the maximum resolution of the layer.
      */
    def getMaxResolution(): Double = js.native
    
    /**
      * Return the maximum zoom level of the layer.
      */
    def getMaxZoom(): Double = js.native
    
    /**
      * Return the minimum resolution of the layer.
      */
    def getMinResolution(): Double = js.native
    
    /**
      * Return the minimum zoom level of the layer.
      */
    def getMinZoom(): Double = js.native
    
    /**
      * Return the opacity of the layer (between 0 and 1).
      */
    def getOpacity(): Double = js.native
    
    def getSourceState(): typingsSlinky.ol.stateMod.State = js.native
    
    /**
      * Return the visibility of the layer (true or false).
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Return the Z-index of the layer, which is used to order layers before
      * rendering. The default Z-index is 0.
      */
    def getZIndex(): Double = js.native
    
    @JSName("on")
    def on_changeextent(`type`: changeColonextent, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changemaxResolution(`type`: changeColonmaxResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changemaxZoom(`type`: changeColonmaxZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeminResolution(`type`: changeColonminResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeminZoom(`type`: changeColonminZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeopacity(`type`: changeColonopacity, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changevisible(`type`: changeColonvisible, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changezIndex(`type`: changeColonzIndex, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changeextent(`type`: changeColonextent, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changemaxResolution(`type`: changeColonmaxResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changemaxZoom(`type`: changeColonmaxZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeminResolution(`type`: changeColonminResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeminZoom(`type`: changeColonminZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeopacity(`type`: changeColonopacity, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changevisible(`type`: changeColonvisible, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changezIndex(`type`: changeColonzIndex, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the extent at which the layer is visible.  If undefined, the layer
      * will be visible at all extents.
      */
    def setExtent(): Unit = js.native
    def setExtent(extent: Extent): Unit = js.native
    
    /**
      * Set the maximum resolution at which the layer is visible.
      */
    def setMaxResolution(maxResolution: Double): Unit = js.native
    
    /**
      * Set the maximum zoom (exclusive) at which the layer is visible.
      * Note that the zoom levels for layer visibility are based on the
      * view zoom level, which may be different from a tile source zoom level.
      */
    def setMaxZoom(maxZoom: Double): Unit = js.native
    
    /**
      * Set the minimum resolution at which the layer is visible.
      */
    def setMinResolution(minResolution: Double): Unit = js.native
    
    /**
      * Set the minimum zoom (inclusive) at which the layer is visible.
      * Note that the zoom levels for layer visibility are based on the
      * view zoom level, which may be different from a tile source zoom level.
      */
    def setMinZoom(minZoom: Double): Unit = js.native
    
    /**
      * Set the opacity of the layer, allowed values range from 0 to 1.
      */
    def setOpacity(opacity: Double): Unit = js.native
    
    /**
      * Set the visibility of the layer (true or false).
      */
    def setVisible(visible: Boolean): Unit = js.native
    
    /**
      * Set Z-index of the layer, which is used to order layers before rendering.
      * The default Z-index is 0.
      */
    def setZIndex(zindex: Double): Unit = js.native
    
    @JSName("un")
    def un_changeextent(`type`: changeColonextent, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changemaxResolution(`type`: changeColonmaxResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changemaxZoom(`type`: changeColonmaxZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeminResolution(`type`: changeColonminResolution, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeminZoom(`type`: changeColonminZoom, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeopacity(`type`: changeColonopacity, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changevisible(`type`: changeColonvisible, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changezIndex(`type`: changeColonzIndex, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var extent: js.UndefOr[Extent] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
