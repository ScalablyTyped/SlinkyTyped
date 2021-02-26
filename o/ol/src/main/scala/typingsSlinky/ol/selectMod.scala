package typingsSlinky.ol

import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ol.conditionMod.Condition
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.olStrings.select
import typingsSlinky.ol.styleStyleMod.Style
import typingsSlinky.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("ol/interaction/Select", JSImport.Default)
  @js.native
  class default () extends Select {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  sealed trait SelectEventType extends StObject
  @JSImport("ol/interaction/Select", "SelectEventType")
  @js.native
  object SelectEventType extends StObject {
    
    @js.native
    sealed trait SELECT extends SelectEventType
  }
  
  type FilterFunction = js.Function2[
    /* p0 */ FeatureLike, 
    /* p1 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default], 
    Boolean
  ]
  
  @js.native
  trait Options extends StObject {
    
    var addCondition: js.UndefOr[Condition] = js.native
    
    var condition: js.UndefOr[Condition] = js.native
    
    var features: js.UndefOr[
        typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
      ] = js.native
    
    var filter: js.UndefOr[FilterFunction] = js.native
    
    var hitTolerance: js.UndefOr[Double] = js.native
    
    var layers: js.UndefOr[
        js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] | (js.Function1[
          /* p0 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default], 
          Boolean
        ])
      ] = js.native
    
    var multi: js.UndefOr[Boolean] = js.native
    
    var removeCondition: js.UndefOr[Condition] = js.native
    
    var style: js.UndefOr[StyleLike] = js.native
    
    var toggleCondition: js.UndefOr[Condition] = js.native
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
      def setAddCondition(value: Condition): Self = StObject.set(x, "addCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddConditionUndefined: Self = StObject.set(x, "addCondition", js.undefined)
      
      @scala.inline
      def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setFeatures(
        value: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setFilter(
        value: (/* p0 */ FeatureLike, /* p1 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setHitTolerance(value: Double): Self = StObject.set(x, "hitTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitToleranceUndefined: Self = StObject.set(x, "hitTolerance", js.undefined)
      
      @scala.inline
      def setLayers(
        value: js.Array[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] | (js.Function1[
              /* p0 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default], 
              Boolean
            ])
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersFunction1(
        value: /* p0 */ typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] => Boolean
      ): Self = StObject.set(x, "layers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      @scala.inline
      def setRemoveCondition(value: Condition): Self = StObject.set(x, "removeCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveConditionUndefined: Self = StObject.set(x, "removeCondition", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setToggleCondition(value: Condition): Self = StObject.set(x, "toggleCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleConditionUndefined: Self = StObject.set(x, "toggleCondition", js.undefined)
    }
  }
  
  @js.native
  trait Select
    extends typingsSlinky.ol.interactionInteractionMod.default {
    
    /**
      * Get the selected features.
      */
    def getFeatures(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    
    /**
      * Returns the Hit-detection tolerance.
      */
    def getHitTolerance(): Double = js.native
    
    /**
      * Returns the associated {@link module:ol/layer/Vector~Vector vectorlayer} of
      * the (last) selected feature. Note that this will not work with any
      * programmatic method like pushing features to
      * {@link module:ol/interaction/Select~Select#getFeatures collection}.
      */
    def getLayer(feature: FeatureLike): typingsSlinky.ol.vectorMod.default = js.native
    
    def getStyle(): StyleLike | Null = js.native
    
    @JSName("on")
    def on_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
    
    /**
      * Hit-detection tolerance. Pixels inside the radius around the given position
      * will be checked for features.
      */
    def setHitTolerance(hitTolerance: Double): Unit = js.native
    
    @JSName("un")
    def un_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait SelectEvent
    extends typingsSlinky.ol.eventMod.default {
    
    /**
      * Deselected features array.
      */
    var deselected: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    
    /**
      * Associated {@link module:ol/MapBrowserEvent}.
      */
    var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] = js.native
    
    /**
      * Selected features array.
      */
    var selected: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  }
}
