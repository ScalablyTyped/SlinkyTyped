package typingsSlinky.fancybox

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxFullScreen extends StObject {
  
  def enabled(): Boolean = js.native
  
  def exit(): Unit = js.native
  
  def isFullscreen(): Boolean = js.native
  
  def request(elem: HTMLElement): Unit = js.native
  
  def toggle(elem: HTMLElement): Unit = js.native
}
object FancyBoxFullScreen {
  
  @scala.inline
  def apply(
    enabled: () => Boolean,
    exit: () => Unit,
    isFullscreen: () => Boolean,
    request: HTMLElement => Unit,
    toggle: HTMLElement => Unit
  ): FancyBoxFullScreen = {
    val __obj = js.Dynamic.literal(enabled = js.Any.fromFunction0(enabled), exit = js.Any.fromFunction0(exit), isFullscreen = js.Any.fromFunction0(isFullscreen), request = js.Any.fromFunction1(request), toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[FancyBoxFullScreen]
  }
  
  @scala.inline
  implicit class FancyBoxFullScreenMutableBuilder[Self <: FancyBoxFullScreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: () => Boolean): Self = StObject.set(x, "enabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExit(value: () => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFullscreen(value: () => Boolean): Self = StObject.set(x, "isFullscreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequest(value: HTMLElement => Unit): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: HTMLElement => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
  }
}
