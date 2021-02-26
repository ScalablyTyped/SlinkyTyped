package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.idle.IdleState
import typingsSlinky.chrome.chrome.idle.IdleStateChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofidle extends StObject {
  
  def getAutoLockDelay(callback: js.Function1[/* delay */ Double, Unit]): Unit = js.native
  
  var onStateChanged: IdleStateChangedEvent = js.native
  
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ IdleState, Unit]): Unit = js.native
  
  def setDetectionInterval(intervalInSeconds: Double): Unit = js.native
}
object Typeofidle {
  
  @scala.inline
  def apply(
    getAutoLockDelay: js.Function1[/* delay */ Double, Unit] => Unit,
    onStateChanged: IdleStateChangedEvent,
    queryState: (Double, js.Function1[/* newState */ IdleState, Unit]) => Unit,
    setDetectionInterval: Double => Unit
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(getAutoLockDelay = js.Any.fromFunction1(getAutoLockDelay), onStateChanged = onStateChanged.asInstanceOf[js.Any], queryState = js.Any.fromFunction2(queryState), setDetectionInterval = js.Any.fromFunction1(setDetectionInterval))
    __obj.asInstanceOf[Typeofidle]
  }
  
  @scala.inline
  implicit class TypeofidleMutableBuilder[Self <: Typeofidle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAutoLockDelay(value: js.Function1[/* delay */ Double, Unit] => Unit): Self = StObject.set(x, "getAutoLockDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStateChanged(value: IdleStateChangedEvent): Self = StObject.set(x, "onStateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryState(value: (Double, js.Function1[/* newState */ IdleState, Unit]) => Unit): Self = StObject.set(x, "queryState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDetectionInterval(value: Double => Unit): Self = StObject.set(x, "setDetectionInterval", js.Any.fromFunction1(value))
  }
}
