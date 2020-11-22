package typingsSlinky.playable.chromecastMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.controlsChromecastTypesMod.IChromecastButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromecastButton extends IChromecastButton {
  
  var _bindCallbacks: js.Any = js.native
  
  var _bindEvents: js.Any = js.native
  
  var _bottomBlock: js.Any = js.native
  
  var _callback: js.Any = js.native
  
  var _chromecastManager: js.Any = js.native
  
  var _connectToPanel: js.Any = js.native
  
  var _destroyInterceptor: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _initInterceptor: js.Any = js.native
  
  var _initUI: js.Any = js.native
  
  var _interceptor: js.Any = js.native
  
  var _textMap: js.Any = js.native
  
  var _theme: js.Any = js.native
  
  var _tooltipService: js.Any = js.native
  
  var _triggerCallback: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  var isHidden: Boolean = js.native
  
  var view: typingsSlinky.playable.chromecastViewMod.default = js.native
}
object ChromecastButton {
  
  @scala.inline
  def apply(
    _bindCallbacks: js.Any,
    _bindEvents: js.Any,
    _bottomBlock: js.Any,
    _callback: js.Any,
    _chromecastManager: js.Any,
    _connectToPanel: js.Any,
    _destroyInterceptor: js.Any,
    _eventEmitter: js.Any,
    _initInterceptor: js.Any,
    _initUI: js.Any,
    _interceptor: js.Any,
    _textMap: js.Any,
    _theme: js.Any,
    _tooltipService: js.Any,
    _triggerCallback: js.Any,
    _unbindEvents: js.Any,
    destroy: () => Unit,
    getElement: () => HTMLElement,
    hide: () => Unit,
    isHidden: Boolean,
    setChromecastButtonCallback: js.Function => Unit,
    show: () => Unit,
    view: typingsSlinky.playable.chromecastViewMod.default
  ): ChromecastButton = {
    val __obj = js.Dynamic.literal(_bindCallbacks = _bindCallbacks.asInstanceOf[js.Any], _bindEvents = _bindEvents.asInstanceOf[js.Any], _bottomBlock = _bottomBlock.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _chromecastManager = _chromecastManager.asInstanceOf[js.Any], _connectToPanel = _connectToPanel.asInstanceOf[js.Any], _destroyInterceptor = _destroyInterceptor.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _initInterceptor = _initInterceptor.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _interceptor = _interceptor.asInstanceOf[js.Any], _textMap = _textMap.asInstanceOf[js.Any], _theme = _theme.asInstanceOf[js.Any], _tooltipService = _tooltipService.asInstanceOf[js.Any], _triggerCallback = _triggerCallback.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setChromecastButtonCallback = js.Any.fromFunction1(setChromecastButtonCallback), show = js.Any.fromFunction0(show), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromecastButton]
  }
  
  @scala.inline
  implicit class ChromecastButtonOps[Self <: ChromecastButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_bindCallbacks(value: js.Any): Self = this.set("_bindCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_bindEvents(value: js.Any): Self = this.set("_bindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_bottomBlock(value: js.Any): Self = this.set("_bottomBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_callback(value: js.Any): Self = this.set("_callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_chromecastManager(value: js.Any): Self = this.set("_chromecastManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_connectToPanel(value: js.Any): Self = this.set("_connectToPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_destroyInterceptor(value: js.Any): Self = this.set("_destroyInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initInterceptor(value: js.Any): Self = this.set("_initInterceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_initUI(value: js.Any): Self = this.set("_initUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_interceptor(value: js.Any): Self = this.set("_interceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textMap(value: js.Any): Self = this.set("_textMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_theme(value: js.Any): Self = this.set("_theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_tooltipService(value: js.Any): Self = this.set("_tooltipService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_triggerCallback(value: js.Any): Self = this.set("_triggerCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: typingsSlinky.playable.chromecastViewMod.default): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
