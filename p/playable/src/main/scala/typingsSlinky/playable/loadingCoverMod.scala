package typingsSlinky.playable

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.BottomBlockEngine
import typingsSlinky.playable.loadingCoverTypesMod.ILoadingCover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingCoverMod {
  
  @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", JSImport.Default)
  @js.native
  class default protected () extends LoadingCover {
    def this(hasEventEmitterEngineBottomBlockRootContainer: BottomBlockEngine) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", "default.View")
    @js.native
    def View: Instantiable0[typingsSlinky.playable.loadingCoverViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable0[typingsSlinky.playable.loadingCoverViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LoadingCover extends ILoadingCover {
    
    var _bindEvents: js.Any = js.native
    
    var _bottomBlock: js.Any = js.native
    
    var _checkForWaitingState: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typingsSlinky.playable.loadingCoverViewMod.default = js.native
  }
  object LoadingCover {
    
    @scala.inline
    def apply(
      _bindEvents: js.Any,
      _bottomBlock: js.Any,
      _checkForWaitingState: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _initUI: js.Any,
      _unbindEvents: js.Any,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setLoadingCover: String => Unit,
      show: () => Unit,
      view: typingsSlinky.playable.loadingCoverViewMod.default
    ): LoadingCover = {
      val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _bottomBlock = _bottomBlock.asInstanceOf[js.Any], _checkForWaitingState = _checkForWaitingState.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setLoadingCover = js.Any.fromFunction1(setLoadingCover), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingCover]
    }
    
    @scala.inline
    implicit class LoadingCoverMutableBuilder[Self <: LoadingCover] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: typingsSlinky.playable.loadingCoverViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bottomBlock(value: js.Any): Self = StObject.set(x, "_bottomBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_checkForWaitingState(value: js.Any): Self = StObject.set(x, "_checkForWaitingState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
