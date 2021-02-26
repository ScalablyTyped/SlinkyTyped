package typingsSlinky.ol

import typingsSlinky.ol.attributionMod.Options
import typingsSlinky.ol.attributionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod {
  
  @JSImport("ol/control", "Attribution")
  @js.native
  class Attribution () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/control", "Control")
  @js.native
  class Control protected ()
    extends typingsSlinky.ol.controlControlMod.default {
    def this(options: typingsSlinky.ol.controlControlMod.Options) = this()
  }
  
  @JSImport("ol/control", "FullScreen")
  @js.native
  class FullScreen ()
    extends typingsSlinky.ol.fullScreenMod.default {
    def this(opt_options: typingsSlinky.ol.fullScreenMod.Options) = this()
  }
  
  @JSImport("ol/control", "MousePosition")
  @js.native
  class MousePosition ()
    extends typingsSlinky.ol.mousePositionMod.default {
    def this(opt_options: typingsSlinky.ol.mousePositionMod.Options) = this()
  }
  
  @JSImport("ol/control", "OverviewMap")
  @js.native
  class OverviewMap ()
    extends typingsSlinky.ol.overviewMapMod.default {
    def this(opt_options: typingsSlinky.ol.overviewMapMod.Options) = this()
  }
  
  @JSImport("ol/control", "Rotate")
  @js.native
  class Rotate ()
    extends typingsSlinky.ol.rotateMod.default {
    def this(opt_options: typingsSlinky.ol.rotateMod.Options) = this()
  }
  
  @JSImport("ol/control", "ScaleLine")
  @js.native
  class ScaleLine ()
    extends typingsSlinky.ol.scaleLineMod.default {
    def this(opt_options: typingsSlinky.ol.scaleLineMod.Options) = this()
  }
  
  @JSImport("ol/control", "Zoom")
  @js.native
  class Zoom ()
    extends typingsSlinky.ol.zoomMod.default {
    def this(opt_options: typingsSlinky.ol.zoomMod.Options) = this()
  }
  
  @JSImport("ol/control", "ZoomSlider")
  @js.native
  class ZoomSlider ()
    extends typingsSlinky.ol.zoomSliderMod.default {
    def this(opt_options: typingsSlinky.ol.zoomSliderMod.Options) = this()
  }
  
  @JSImport("ol/control", "ZoomToExtent")
  @js.native
  class ZoomToExtent ()
    extends typingsSlinky.ol.zoomToExtentMod.default {
    def this(opt_options: typingsSlinky.ol.zoomToExtentMod.Options) = this()
  }
  
  @JSImport("ol/control", "defaults")
  @js.native
  def defaults(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] = js.native
  @JSImport("ol/control", "defaults")
  @js.native
  def defaults(opt_options: DefaultsOptions): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.controlControlMod.default] = js.native
  
  @js.native
  trait DefaultsOptions extends StObject {
    
    var attribution: js.UndefOr[Boolean] = js.native
    
    var attributionOptions: js.UndefOr[Options] = js.native
    
    var rotate: js.UndefOr[Boolean] = js.native
    
    var rotateOptions: js.UndefOr[typingsSlinky.ol.rotateMod.Options] = js.native
    
    var zoom: js.UndefOr[Boolean] = js.native
    
    var zoomOptions: js.UndefOr[typingsSlinky.ol.zoomMod.Options] = js.native
  }
  object DefaultsOptions {
    
    @scala.inline
    def apply(): DefaultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsOptions]
    }
    
    @scala.inline
    implicit class DefaultsOptionsMutableBuilder[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribution(value: Boolean): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionOptions(value: Options): Self = StObject.set(x, "attributionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionOptionsUndefined: Self = StObject.set(x, "attributionOptions", js.undefined)
      
      @scala.inline
      def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      @scala.inline
      def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateOptions(value: typingsSlinky.ol.rotateMod.Options): Self = StObject.set(x, "rotateOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateOptionsUndefined: Self = StObject.set(x, "rotateOptions", js.undefined)
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOptions(value: typingsSlinky.ol.zoomMod.Options): Self = StObject.set(x, "zoomOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOptionsUndefined: Self = StObject.set(x, "zoomOptions", js.undefined)
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
