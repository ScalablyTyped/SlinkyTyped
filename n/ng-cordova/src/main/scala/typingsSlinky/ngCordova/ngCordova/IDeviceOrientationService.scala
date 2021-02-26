package typingsSlinky.ngCordova.ngCordova

import typingsSlinky.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceOrientationService extends StObject {
  
  def clearWatch(watchID: Double): Unit = js.native
  
  def getCurrentHeading(): IPromise[IDeviceOrientationHeading] = js.native
  
  def watchHeading(options: IDeviceOrientationWatchOptions): IDeviceOrientationWatchPromise = js.native
}
object IDeviceOrientationService {
  
  @scala.inline
  def apply(
    clearWatch: Double => Unit,
    getCurrentHeading: () => IPromise[IDeviceOrientationHeading],
    watchHeading: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise
  ): IDeviceOrientationService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentHeading = js.Any.fromFunction0(getCurrentHeading), watchHeading = js.Any.fromFunction1(watchHeading))
    __obj.asInstanceOf[IDeviceOrientationService]
  }
  
  @scala.inline
  implicit class IDeviceOrientationServiceMutableBuilder[Self <: IDeviceOrientationService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearWatch(value: Double => Unit): Self = StObject.set(x, "clearWatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentHeading(value: () => IPromise[IDeviceOrientationHeading]): Self = StObject.set(x, "getCurrentHeading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWatchHeading(value: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise): Self = StObject.set(x, "watchHeading", js.Any.fromFunction1(value))
  }
}
