package typingsSlinky.amapJsSdk.AMap

import typingsSlinky.amapJsSdk.anon.Lat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBar
  extends EventBindable
     with MapControl {
  
  def doLocation(): Unit = js.native
  
  def getLocation(): Lat = js.native
  
  def getOffset(): Pixel = js.native
  
  def hideDirection(): Unit = js.native
  
  def hideLocation(): Unit = js.native
  
  def hideRuler(): Unit = js.native
  
  def setOffset(offset: Pixel): Unit = js.native
  
  def showDirection(): Unit = js.native
  
  def showLocation(): Unit = js.native
  
  def showRuler(): Unit = js.native
}
object ToolBar {
  
  @scala.inline
  def apply(
    doLocation: () => Unit,
    getLocation: () => Lat,
    getOffset: () => Pixel,
    hide: () => Unit,
    hideDirection: () => Unit,
    hideLocation: () => Unit,
    hideRuler: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    setOffset: Pixel => Unit,
    show: () => Unit,
    showDirection: () => Unit,
    showLocation: () => Unit,
    showRuler: () => Unit
  ): ToolBar = {
    val __obj = js.Dynamic.literal(doLocation = js.Any.fromFunction0(doLocation), getLocation = js.Any.fromFunction0(getLocation), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), hideDirection = js.Any.fromFunction0(hideDirection), hideLocation = js.Any.fromFunction0(hideLocation), hideRuler = js.Any.fromFunction0(hideRuler), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show), showDirection = js.Any.fromFunction0(showDirection), showLocation = js.Any.fromFunction0(showLocation), showRuler = js.Any.fromFunction0(showRuler))
    __obj.asInstanceOf[ToolBar]
  }
  
  @scala.inline
  implicit class ToolBarMutableBuilder[Self <: ToolBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoLocation(value: () => Unit): Self = StObject.set(x, "doLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocation(value: () => Lat): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOffset(value: () => Pixel): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideDirection(value: () => Unit): Self = StObject.set(x, "hideDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideLocation(value: () => Unit): Self = StObject.set(x, "hideLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideRuler(value: () => Unit): Self = StObject.set(x, "hideRuler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOffset(value: Pixel => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowDirection(value: () => Unit): Self = StObject.set(x, "showDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowLocation(value: () => Unit): Self = StObject.set(x, "showLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowRuler(value: () => Unit): Self = StObject.set(x, "showRuler", js.Any.fromFunction0(value))
  }
}
