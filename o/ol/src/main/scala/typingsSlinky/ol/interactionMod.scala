package typingsSlinky.ol

import typingsSlinky.ol.doubleClickZoomMod.Options
import typingsSlinky.ol.doubleClickZoomMod.default
import typingsSlinky.ol.interactionInteractionMod.InteractionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMod {
  
  @JSImport("ol/interaction", "DoubleClickZoom")
  @js.native
  class DoubleClickZoom () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/interaction", "DragAndDrop")
  @js.native
  class DragAndDrop ()
    extends typingsSlinky.ol.dragAndDropMod.default {
    def this(opt_options: typingsSlinky.ol.dragAndDropMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragBox")
  @js.native
  class DragBox ()
    extends typingsSlinky.ol.dragBoxMod.default {
    def this(opt_options: typingsSlinky.ol.dragBoxMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragPan")
  @js.native
  class DragPan ()
    extends typingsSlinky.ol.dragPanMod.default {
    def this(opt_options: typingsSlinky.ol.dragPanMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragRotate")
  @js.native
  class DragRotate ()
    extends typingsSlinky.ol.dragRotateMod.default {
    def this(opt_options: typingsSlinky.ol.dragRotateMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragRotateAndZoom")
  @js.native
  class DragRotateAndZoom ()
    extends typingsSlinky.ol.dragRotateAndZoomMod.default {
    def this(opt_options: typingsSlinky.ol.dragRotateAndZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "DragZoom")
  @js.native
  class DragZoom ()
    extends typingsSlinky.ol.dragZoomMod.default {
    def this(opt_options: typingsSlinky.ol.dragZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Draw")
  @js.native
  class Draw protected ()
    extends typingsSlinky.ol.drawMod.default {
    def this(options: typingsSlinky.ol.drawMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Extent")
  @js.native
  class Extent ()
    extends typingsSlinky.ol.interactionExtentMod.default {
    def this(opt_options: typingsSlinky.ol.interactionExtentMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Interaction")
  @js.native
  class Interaction ()
    extends typingsSlinky.ol.interactionInteractionMod.default {
    def this(opt_options: InteractionOptions) = this()
  }
  
  @JSImport("ol/interaction", "KeyboardPan")
  @js.native
  class KeyboardPan ()
    extends typingsSlinky.ol.keyboardPanMod.default {
    def this(opt_options: typingsSlinky.ol.keyboardPanMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "KeyboardZoom")
  @js.native
  class KeyboardZoom ()
    extends typingsSlinky.ol.keyboardZoomMod.default {
    def this(opt_options: typingsSlinky.ol.keyboardZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Modify")
  @js.native
  class Modify protected ()
    extends typingsSlinky.ol.modifyMod.default {
    def this(options: typingsSlinky.ol.modifyMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "MouseWheelZoom")
  @js.native
  class MouseWheelZoom ()
    extends typingsSlinky.ol.mouseWheelZoomMod.default {
    def this(opt_options: typingsSlinky.ol.mouseWheelZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "PinchRotate")
  @js.native
  class PinchRotate ()
    extends typingsSlinky.ol.pinchRotateMod.default {
    def this(opt_options: typingsSlinky.ol.pinchRotateMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "PinchZoom")
  @js.native
  class PinchZoom ()
    extends typingsSlinky.ol.pinchZoomMod.default {
    def this(opt_options: typingsSlinky.ol.pinchZoomMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Pointer")
  @js.native
  class Pointer ()
    extends typingsSlinky.ol.pointerMod.default {
    def this(opt_options: typingsSlinky.ol.pointerMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Select")
  @js.native
  class Select ()
    extends typingsSlinky.ol.selectMod.default {
    def this(opt_options: typingsSlinky.ol.selectMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Snap")
  @js.native
  class Snap ()
    extends typingsSlinky.ol.snapMod.default {
    def this(opt_options: typingsSlinky.ol.snapMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "Translate")
  @js.native
  class Translate ()
    extends typingsSlinky.ol.translateMod.default {
    def this(opt_options: typingsSlinky.ol.translateMod.Options) = this()
  }
  
  @JSImport("ol/interaction", "defaults")
  @js.native
  def defaults(): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default] = js.native
  @JSImport("ol/interaction", "defaults")
  @js.native
  def defaults(opt_options: DefaultsOptions): typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.interactionInteractionMod.default] = js.native
  
  @js.native
  trait DefaultsOptions extends StObject {
    
    var altShiftDragRotate: js.UndefOr[Boolean] = js.native
    
    var doubleClickZoom: js.UndefOr[Boolean] = js.native
    
    var dragPan: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mouseWheelZoom: js.UndefOr[Boolean] = js.native
    
    var onFocusOnly: js.UndefOr[Boolean] = js.native
    
    var pinchRotate: js.UndefOr[Boolean] = js.native
    
    var pinchZoom: js.UndefOr[Boolean] = js.native
    
    var shiftDragZoom: js.UndefOr[Boolean] = js.native
    
    var zoomDelta: js.UndefOr[Double] = js.native
    
    var zoomDuration: js.UndefOr[Double] = js.native
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
      def setAltShiftDragRotate(value: Boolean): Self = StObject.set(x, "altShiftDragRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltShiftDragRotateUndefined: Self = StObject.set(x, "altShiftDragRotate", js.undefined)
      
      @scala.inline
      def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
      
      @scala.inline
      def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMouseWheelZoom(value: Boolean): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
      
      @scala.inline
      def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
      
      @scala.inline
      def setPinchRotate(value: Boolean): Self = StObject.set(x, "pinchRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinchRotateUndefined: Self = StObject.set(x, "pinchRotate", js.undefined)
      
      @scala.inline
      def setPinchZoom(value: Boolean): Self = StObject.set(x, "pinchZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinchZoomUndefined: Self = StObject.set(x, "pinchZoom", js.undefined)
      
      @scala.inline
      def setShiftDragZoom(value: Boolean): Self = StObject.set(x, "shiftDragZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftDragZoomUndefined: Self = StObject.set(x, "shiftDragZoom", js.undefined)
      
      @scala.inline
      def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
      
      @scala.inline
      def setZoomDuration(value: Double): Self = StObject.set(x, "zoomDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomDurationUndefined: Self = StObject.set(x, "zoomDuration", js.undefined)
    }
  }
}
