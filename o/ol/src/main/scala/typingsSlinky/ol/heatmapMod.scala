package typingsSlinky.ol

import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColonblur
import typingsSlinky.ol.olStrings.changeColongradient
import typingsSlinky.ol.olStrings.changeColonradius
import typingsSlinky.ol.olStrings.postcompose
import typingsSlinky.ol.olStrings.precompose
import typingsSlinky.ol.olStrings.rendercomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapMod {
  
  @JSImport("ol/layer/Heatmap", JSImport.Default)
  @js.native
  class default () extends Heatmap {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Heatmap
    extends typingsSlinky.ol.vectorMod.default {
    
    /**
      * Return the blur size in pixels.
      */
    def getBlur(): Double = js.native
    
    /**
      * Return the gradient colors as array of strings.
      */
    def getGradient(): js.Array[String] = js.native
    
    /**
      * Return the size of the radius in pixels.
      */
    def getRadius(): Double = js.native
    
    @JSName("on")
    def on_changeblur(`type`: changeColonblur, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changegradient(`type`: changeColongradient, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeradius(`type`: changeColonradius, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_postcompose(
      `type`: postcompose,
      listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_precompose(
      `type`: precompose,
      listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("on")
    def on_rendercomplete(
      `type`: rendercomplete,
      listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    
    @JSName("once")
    def once_changeblur(`type`: changeColonblur, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changegradient(`type`: changeColongradient, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeradius(`type`: changeColonradius, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_postcompose(
      `type`: postcompose,
      listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_precompose(
      `type`: precompose,
      listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    @JSName("once")
    def once_rendercomplete(
      `type`: rendercomplete,
      listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
    ): EventsKey = js.native
    
    /**
      * Set the blur size in pixels.
      */
    def setBlur(blur: Double): Unit = js.native
    
    /**
      * Set the gradient colors as array of strings.
      */
    def setGradient(colors: js.Array[String]): Unit = js.native
    
    /**
      * Set the size of the radius in pixels.
      */
    def setRadius(radius: Double): Unit = js.native
    
    @JSName("un")
    def un_changeblur(`type`: changeColonblur, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changegradient(`type`: changeColongradient, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeradius(`type`: changeColonradius, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_postcompose(
      `type`: postcompose,
      listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
    ): Unit = js.native
    @JSName("un")
    def un_precompose(
      `type`: precompose,
      listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
    ): Unit = js.native
    @JSName("un")
    def un_rendercomplete(
      `type`: rendercomplete,
      listener: js.Function1[/* evt */ typingsSlinky.ol.renderEventMod.default, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var blur: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var extent: js.UndefOr[Extent] = js.native
    
    var gradient: js.UndefOr[js.Array[String]] = js.native
    
    var maxResolution: js.UndefOr[Double] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minResolution: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var source: js.UndefOr[typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var weight: js.UndefOr[
        String | (js.Function1[
          /* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], 
          Double
        ])
      ] = js.native
    
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
      def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setGradient(value: js.Array[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      @scala.inline
      def setGradientVarargs(value: String*): Self = StObject.set(x, "gradient", js.Array(value :_*))
      
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
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setSource(value: typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWeight(
        value: String | (js.Function1[
              /* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default], 
              Double
            ])
      ): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightFunction1(
        value: /* p0 */ typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] => Double
      ): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
