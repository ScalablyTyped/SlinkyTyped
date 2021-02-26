package typingsSlinky.baidumapWebSdk.BMap

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control extends StObject {
  
  var defaultAnchor: ControlAnchor = js.native
  
  var defaultOffset: Size = js.native
  
  def getAnchor(): ControlAnchor = js.native
  
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  def getContainer(): js.UndefOr[HTMLElement] = js.native
  
  def getOffset(): Size = js.native
  
  def hide(): Unit = js.native
  
  def initialize(map: Map): HTMLElement = js.native
  
  def isVisible(): Boolean = js.native
  
  def setAnchor(anchor: ControlAnchor): Unit = js.native
  
  def setOffset(offset: Size): Unit = js.native
  
  def show(): Unit = js.native
}
object Control {
  
  @scala.inline
  def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getOffset: () => Size,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    show: () => Unit
  ): Control = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit class ControlMutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultAnchor(value: ControlAnchor): Self = StObject.set(x, "defaultAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOffset(value: Size): Self = StObject.set(x, "defaultOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAnchor(value: () => ControlAnchor): Self = StObject.set(x, "getAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainer(value: () => js.UndefOr[HTMLElement]): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffset(value: () => Size): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitialize(value: Map => HTMLElement): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAnchor(value: ControlAnchor => Unit): Self = StObject.set(x, "setAnchor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOffset(value: Size => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
