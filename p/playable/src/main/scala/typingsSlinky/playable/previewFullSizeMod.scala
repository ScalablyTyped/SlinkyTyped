package typingsSlinky.playable

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.PreviewService
import typingsSlinky.playable.previewFullSizeTypesMod.IPreviewFullSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewFullSizeMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", JSImport.Default)
  @js.native
  class default protected () extends PreviewFullsize {
    def this(hasPreviewServiceRootContainer: PreviewService) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", "default.View")
    @js.native
    def View: Instantiable0[typingsSlinky.playable.previewFullSizeViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable0[typingsSlinky.playable.previewFullSizeViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PreviewFullsize extends IPreviewFullSize {
    
    var _currentFrame: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _previewService: js.Any = js.native
    
    var view: typingsSlinky.playable.previewFullSizeViewMod.default = js.native
  }
  object PreviewFullsize {
    
    @scala.inline
    def apply(
      _currentFrame: js.Any,
      _initUI: js.Any,
      _previewService: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      showAt: Double => Unit,
      view: typingsSlinky.playable.previewFullSizeViewMod.default
    ): PreviewFullsize = {
      val __obj = js.Dynamic.literal(_currentFrame = _currentFrame.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _previewService = _previewService.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), showAt = js.Any.fromFunction1(showAt), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewFullsize]
    }
    
    @scala.inline
    implicit class PreviewFullsizeMutableBuilder[Self <: PreviewFullsize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setView(value: typingsSlinky.playable.previewFullSizeViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_currentFrame(value: js.Any): Self = StObject.set(x, "_currentFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_previewService(value: js.Any): Self = StObject.set(x, "_previewService", value.asInstanceOf[js.Any])
    }
  }
}
