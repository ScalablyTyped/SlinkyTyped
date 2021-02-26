package typingsSlinky.ngCordova.ngCordova

import typingsSlinky.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceMotionWatchPromise extends IPromise[IDeviceMotionAcceleration] {
  
  def cancel(): Unit = js.native
  
  def clearWatch(): Unit = js.native
  def clearWatch(watchId: Double): Unit = js.native
  
  var watchID: Double = js.native
}
