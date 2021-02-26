package typingsSlinky.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geolocation extends EventBindable {
  
  def clearWatch(watchId: Double): Double = js.native
  
  def getCurrentPosition(): Unit = js.native
  
  def isSupported(): Boolean = js.native
  
  def watchPosition(): Double = js.native
}
object Geolocation {
  
  @scala.inline
  def apply(
    clearWatch: Double => Double,
    getCurrentPosition: () => Unit,
    isSupported: () => Boolean,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    watchPosition: () => Double
  ): Geolocation = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentPosition = js.Any.fromFunction0(getCurrentPosition), isSupported = js.Any.fromFunction0(isSupported), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), watchPosition = js.Any.fromFunction0(watchPosition))
    __obj.asInstanceOf[Geolocation]
  }
  
  @scala.inline
  implicit class GeolocationMutableBuilder[Self <: Geolocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearWatch(value: Double => Double): Self = StObject.set(x, "clearWatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentPosition(value: () => Unit): Self = StObject.set(x, "getCurrentPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWatchPosition(value: () => Double): Self = StObject.set(x, "watchPosition", js.Any.fromFunction0(value))
  }
}
