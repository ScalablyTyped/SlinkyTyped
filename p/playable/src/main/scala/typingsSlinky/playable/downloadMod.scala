package typingsSlinky.playable

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.TextMap
import typingsSlinky.playable.downloadTypesMod.IDownloadButton
import typingsSlinky.playable.downloadTypesMod.IDownloadViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/download/download", JSImport.Default)
  @js.native
  class default protected () extends DownloadButton {
    def this(hasEventEmitterTextMapTooltipServiceTheme: TextMap) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/download/download", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/controls/download/download", "default.View")
    @js.native
    class View protected ()
      extends typingsSlinky.playable.downloadViewMod.default {
      def this(config: IDownloadViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/controls/download/download", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IDownloadViewConfig, typingsSlinky.playable.downloadViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable1[/* config */ IDownloadViewConfig, typingsSlinky.playable.downloadViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/download/download", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/download/download", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DownloadButton extends IDownloadButton {
    
    var _bindCallbacks: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _destroyInterceptor: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _initInterceptor: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _interceptor: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _theme: js.Any = js.native
    
    var _tooltipService: js.Any = js.native
    
    var _triggerCallback: js.Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typingsSlinky.playable.downloadViewMod.default = js.native
  }
  object DownloadButton {
    
    @scala.inline
    def apply(
      _bindCallbacks: js.Any,
      _callback: js.Any,
      _destroyInterceptor: js.Any,
      _eventEmitter: js.Any,
      _initInterceptor: js.Any,
      _initUI: js.Any,
      _interceptor: js.Any,
      _textMap: js.Any,
      _theme: js.Any,
      _tooltipService: js.Any,
      _triggerCallback: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setDownloadClickCallback: js.Function0[Unit] => Unit,
      show: () => Unit,
      view: typingsSlinky.playable.downloadViewMod.default
    ): DownloadButton = {
      val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _triggerCallback = _triggerCallback.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setDownloadClickCallback = js.Any.fromFunction1(setDownloadClickCallback), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadButton]
    }
    
    @scala.inline
    implicit class DownloadButtonMutableBuilder[Self <: DownloadButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: typingsSlinky.playable.downloadViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindCallbacks(value: js.Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_callback(value: js.Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_destroyInterceptor(value: js.Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initInterceptor(value: js.Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_interceptor(value: js.Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_textMap(value: js.Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_theme(value: js.Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tooltipService(value: js.Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_triggerCallback(value: js.Any): Self = StObject.set(x, "_triggerCallback", value.asInstanceOf[js.Any])
    }
  }
}
