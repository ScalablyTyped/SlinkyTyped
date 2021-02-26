package typingsSlinky.playable

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.anon.LiveStateEngine
import typingsSlinky.playable.progressTypesMod.IProgressControl
import typingsSlinky.playable.progressTypesMod.IProgressViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/progress/progress", JSImport.Default)
  @js.native
  class default protected () extends ProgressControl {
    def this(hasEngineLiveStateEngineEventEmitterTextMapTooltipServiceThemePreviewThumbnailPreviewFullSize: LiveStateEngine) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "default.View")
    @js.native
    class View protected ()
      extends typingsSlinky.playable.progressViewMod.default {
      def this(config: IProgressViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "default.View")
    @js.native
    def View: Instantiable1[/* config */ IProgressViewConfig, typingsSlinky.playable.progressViewMod.default] = js.native
    @scala.inline
    def View_=(x: Instantiable1[/* config */ IProgressViewConfig, typingsSlinky.playable.progressViewMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/ui/controls/progress/progress", "UPDATE_PROGRESS_INTERVAL_DELAY")
  @js.native
  val UPDATE_PROGRESS_INTERVAL_DELAY: Double = js.native
  
  @js.native
  trait ProgressControl extends IProgressControl {
    
    var _addTimeIndicator: js.Any = js.native
    
    var _bindCallbacks: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _changeCurrentTimeOfVideo: js.Any = js.native
    
    var _convertPlayedPercentToTime: js.Any = js.native
    
    var _desiredSeekPosition: js.Any = js.native
    
    var _destroyInterceptor: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _eventEmitter: js.Any = js.native
    
    var _hidePreview: js.Any = js.native
    
    var _hideTooltip: js.Any = js.native
    
    var _initInterceptor: js.Any = js.native
    
    var _initTimeIndicators: js.Any = js.native
    
    var _initUI: js.Any = js.native
    
    var _interceptor: js.Any = js.native
    
    var _isUserDragging: js.Any = js.native
    
    var _liveStateEngine: js.Any = js.native
    
    var _onChangePlayedPercent: js.Any = js.native
    
    var _onSyncWithLiveMouseEnter: js.Any = js.native
    
    var _onSyncWithLiveMouseLeave: js.Any = js.native
    
    var _pauseVideoOnDragStart: js.Any = js.native
    
    var _playVideoOnDragEnd: js.Any = js.native
    
    var _previewFullSize: js.Any = js.native
    
    var _previewThumbnail: js.Any = js.native
    
    var _processLiveStateChange: js.Any = js.native
    
    var _processStateChange: js.Any = js.native
    
    var _reset: js.Any = js.native
    
    var _setBuffered: js.Any = js.native
    
    var _setPlayed: js.Any = js.native
    
    var _shouldHidePreviewOnUpdate: js.Any = js.native
    
    var _shouldPlayAfterDragEnd: js.Any = js.native
    
    var _showFullScreenPreview: js.Any = js.native
    
    var _showTooltipAndPreview: js.Any = js.native
    
    var _startIntervalUpdates: js.Any = js.native
    
    var _startProcessingUserDrag: js.Any = js.native
    
    var _stopIntervalUpdates: js.Any = js.native
    
    var _stopProcessingUserDrag: js.Any = js.native
    
    var _syncWithLive: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _theme: js.Any = js.native
    
    var _timeIndicatorsToAdd: js.Any = js.native
    
    var _tooltipService: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var _updateAllIndicators: js.Any = js.native
    
    var _updateBufferIndicator: js.Any = js.native
    
    var _updateControlInterval: js.Any = js.native
    
    var _updatePlayedIndicator: js.Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typingsSlinky.playable.progressViewMod.default = js.native
  }
  object ProgressControl {
    
    @scala.inline
    def apply(
      _addTimeIndicator: js.Any,
      _bindCallbacks: js.Any,
      _bindEvents: js.Any,
      _changeCurrentTimeOfVideo: js.Any,
      _convertPlayedPercentToTime: js.Any,
      _desiredSeekPosition: js.Any,
      _destroyInterceptor: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _hidePreview: js.Any,
      _hideTooltip: js.Any,
      _initInterceptor: js.Any,
      _initTimeIndicators: js.Any,
      _initUI: js.Any,
      _interceptor: js.Any,
      _isUserDragging: js.Any,
      _liveStateEngine: js.Any,
      _onChangePlayedPercent: js.Any,
      _onSyncWithLiveMouseEnter: js.Any,
      _onSyncWithLiveMouseLeave: js.Any,
      _pauseVideoOnDragStart: js.Any,
      _playVideoOnDragEnd: js.Any,
      _previewFullSize: js.Any,
      _previewThumbnail: js.Any,
      _processLiveStateChange: js.Any,
      _processStateChange: js.Any,
      _reset: js.Any,
      _setBuffered: js.Any,
      _setPlayed: js.Any,
      _shouldHidePreviewOnUpdate: js.Any,
      _shouldPlayAfterDragEnd: js.Any,
      _showFullScreenPreview: js.Any,
      _showTooltipAndPreview: js.Any,
      _startIntervalUpdates: js.Any,
      _startProcessingUserDrag: js.Any,
      _stopIntervalUpdates: js.Any,
      _stopProcessingUserDrag: js.Any,
      _syncWithLive: js.Any,
      _textMap: js.Any,
      _theme: js.Any,
      _timeIndicatorsToAdd: js.Any,
      _tooltipService: js.Any,
      _unbindEvents: js.Any,
      _updateAllIndicators: js.Any,
      _updateBufferIndicator: js.Any,
      _updateControlInterval: js.Any,
      _updatePlayedIndicator: js.Any,
      addTimeIndicator: Double => Unit,
      addTimeIndicators: js.Array[Double] => Unit,
      clearTimeIndicators: () => Unit,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      seekOnProgressDrag: () => Unit,
      show: () => Unit,
      showPreviewOnProgressDrag: () => Unit,
      view: typingsSlinky.playable.progressViewMod.default
    ): ProgressControl = {
      val __obj = js.Dynamic.literal(_addTimeIndicator = _addTimeIndicator.asInstanceOf[js.Any], _bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _changeCurrentTimeOfVideo = _changeCurrentTimeOfVideo.asInstanceOf[js.Any], _convertPlayedPercentToTime = _convertPlayedPercentToTime.asInstanceOf[js.Any], _desiredSeekPosition = _desiredSeekPosition.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _hidePreview = _hidePreview.asInstanceOf[js.Any], _hideTooltip = _hideTooltip.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initTimeIndicators = _initTimeIndicators.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _isUserDragging = _isUserDragging.asInstanceOf[js.Any], _liveStateEngine = _liveStateEngine.asInstanceOf[js.Any], _onChangePlayedPercent = _onChangePlayedPercent.asInstanceOf[js.Any], _onSyncWithLiveMouseEnter = _onSyncWithLiveMouseEnter.asInstanceOf[js.Any], _onSyncWithLiveMouseLeave = _onSyncWithLiveMouseLeave.asInstanceOf[js.Any], _pauseVideoOnDragStart = _pauseVideoOnDragStart.asInstanceOf[js.Any], _playVideoOnDragEnd = _playVideoOnDragEnd.asInstanceOf[js.Any], _previewFullSize = _previewFullSize.asInstanceOf[js.Any], _previewThumbnail = _previewThumbnail.asInstanceOf[js.Any], _processLiveStateChange = _processLiveStateChange.asInstanceOf[js.Any], _processStateChange = _processStateChange.asInstanceOf[js.Any], _reset = _reset.asInstanceOf[js.Any], _setBuffered = _setBuffered.asInstanceOf[js.Any], _setPlayed = _setPlayed.asInstanceOf[js.Any], _shouldHidePreviewOnUpdate = _shouldHidePreviewOnUpdate.asInstanceOf[js.Any], _shouldPlayAfterDragEnd = _shouldPlayAfterDragEnd.asInstanceOf[js.Any], _showFullScreenPreview = _showFullScreenPreview.asInstanceOf[js.Any], _showTooltipAndPreview = _showTooltipAndPreview.asInstanceOf[js.Any], _startIntervalUpdates = _startIntervalUpdates.asInstanceOf[js.Any], _startProcessingUserDrag = _startProcessingUserDrag.asInstanceOf[js.Any], _stopIntervalUpdates = _stopIntervalUpdates.asInstanceOf[js.Any], _stopProcessingUserDrag = _stopProcessingUserDrag.asInstanceOf[js.Any], _syncWithLive = _syncWithLive.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _timeIndicatorsToAdd = _timeIndicatorsToAdd.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], _updateAllIndicators = _updateAllIndicators.asInstanceOf[js.Any], _updateBufferIndicator = _updateBufferIndicator.asInstanceOf[js.Any], _updateControlInterval = _updateControlInterval.asInstanceOf[js.Any], _updatePlayedIndicator = _updatePlayedIndicator.asInstanceOf[js.Any], addTimeIndicator = js.Any.fromFunction1(addTimeIndicator), addTimeIndicators = js.Any.fromFunction1(addTimeIndicators), clearTimeIndicators = js.Any.fromFunction0(clearTimeIndicators), destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], seekOnProgressDrag = js.Any.fromFunction0(seekOnProgressDrag), show = js.Any.fromFunction0(show), showPreviewOnProgressDrag = js.Any.fromFunction0(showPreviewOnProgressDrag), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressControl]
    }
    
    @scala.inline
    implicit class ProgressControlMutableBuilder[Self <: ProgressControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: typingsSlinky.playable.progressViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_addTimeIndicator(value: js.Any): Self = StObject.set(x, "_addTimeIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindCallbacks(value: js.Any): Self = StObject.set(x, "_bindCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_changeCurrentTimeOfVideo(value: js.Any): Self = StObject.set(x, "_changeCurrentTimeOfVideo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_convertPlayedPercentToTime(value: js.Any): Self = StObject.set(x, "_convertPlayedPercentToTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_desiredSeekPosition(value: js.Any): Self = StObject.set(x, "_desiredSeekPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_destroyInterceptor(value: js.Any): Self = StObject.set(x, "_destroyInterceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_hidePreview(value: js.Any): Self = StObject.set(x, "_hidePreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_hideTooltip(value: js.Any): Self = StObject.set(x, "_hideTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initInterceptor(value: js.Any): Self = StObject.set(x, "_initInterceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initTimeIndicators(value: js.Any): Self = StObject.set(x, "_initTimeIndicators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_initUI(value: js.Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_interceptor(value: js.Any): Self = StObject.set(x, "_interceptor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isUserDragging(value: js.Any): Self = StObject.set(x, "_isUserDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_liveStateEngine(value: js.Any): Self = StObject.set(x, "_liveStateEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onChangePlayedPercent(value: js.Any): Self = StObject.set(x, "_onChangePlayedPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onSyncWithLiveMouseEnter(value: js.Any): Self = StObject.set(x, "_onSyncWithLiveMouseEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onSyncWithLiveMouseLeave(value: js.Any): Self = StObject.set(x, "_onSyncWithLiveMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_pauseVideoOnDragStart(value: js.Any): Self = StObject.set(x, "_pauseVideoOnDragStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_playVideoOnDragEnd(value: js.Any): Self = StObject.set(x, "_playVideoOnDragEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_previewFullSize(value: js.Any): Self = StObject.set(x, "_previewFullSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_previewThumbnail(value: js.Any): Self = StObject.set(x, "_previewThumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_processLiveStateChange(value: js.Any): Self = StObject.set(x, "_processLiveStateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_processStateChange(value: js.Any): Self = StObject.set(x, "_processStateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_reset(value: js.Any): Self = StObject.set(x, "_reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_setBuffered(value: js.Any): Self = StObject.set(x, "_setBuffered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_setPlayed(value: js.Any): Self = StObject.set(x, "_setPlayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_shouldHidePreviewOnUpdate(value: js.Any): Self = StObject.set(x, "_shouldHidePreviewOnUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_shouldPlayAfterDragEnd(value: js.Any): Self = StObject.set(x, "_shouldPlayAfterDragEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_showFullScreenPreview(value: js.Any): Self = StObject.set(x, "_showFullScreenPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_showTooltipAndPreview(value: js.Any): Self = StObject.set(x, "_showTooltipAndPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_startIntervalUpdates(value: js.Any): Self = StObject.set(x, "_startIntervalUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_startProcessingUserDrag(value: js.Any): Self = StObject.set(x, "_startProcessingUserDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stopIntervalUpdates(value: js.Any): Self = StObject.set(x, "_stopIntervalUpdates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stopProcessingUserDrag(value: js.Any): Self = StObject.set(x, "_stopProcessingUserDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_syncWithLive(value: js.Any): Self = StObject.set(x, "_syncWithLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_textMap(value: js.Any): Self = StObject.set(x, "_textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_theme(value: js.Any): Self = StObject.set(x, "_theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_timeIndicatorsToAdd(value: js.Any): Self = StObject.set(x, "_timeIndicatorsToAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tooltipService(value: js.Any): Self = StObject.set(x, "_tooltipService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_updateAllIndicators(value: js.Any): Self = StObject.set(x, "_updateAllIndicators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_updateBufferIndicator(value: js.Any): Self = StObject.set(x, "_updateBufferIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_updateControlInterval(value: js.Any): Self = StObject.set(x, "_updateControlInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_updatePlayedIndicator(value: js.Any): Self = StObject.set(x, "_updatePlayedIndicator", value.asInstanceOf[js.Any])
    }
  }
}
