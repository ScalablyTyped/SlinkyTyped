package typingsSlinky.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableConfig extends StObject {
  
  def onSwipeDown(current: Double, initial: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def onSwipeLeft(current: Double, initial: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def onSwipeRight(current: Double, initial: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def onSwipeUp(current: Double, initial: Double, callback: js.Function0[Unit]): Unit = js.native
}
object SwipeableConfig {
  
  @scala.inline
  def apply(
    onSwipeDown: (Double, Double, js.Function0[Unit]) => Unit,
    onSwipeLeft: (Double, Double, js.Function0[Unit]) => Unit,
    onSwipeRight: (Double, Double, js.Function0[Unit]) => Unit,
    onSwipeUp: (Double, Double, js.Function0[Unit]) => Unit
  ): SwipeableConfig = {
    val __obj = js.Dynamic.literal(onSwipeDown = js.Any.fromFunction3(onSwipeDown), onSwipeLeft = js.Any.fromFunction3(onSwipeLeft), onSwipeRight = js.Any.fromFunction3(onSwipeRight), onSwipeUp = js.Any.fromFunction3(onSwipeUp))
    __obj.asInstanceOf[SwipeableConfig]
  }
  
  @scala.inline
  implicit class SwipeableConfigMutableBuilder[Self <: SwipeableConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSwipeDown(value: (Double, Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "onSwipeDown", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSwipeLeft(value: (Double, Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "onSwipeLeft", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSwipeRight(value: (Double, Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "onSwipeRight", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSwipeUp(value: (Double, Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "onSwipeUp", js.Any.fromFunction3(value))
  }
}
