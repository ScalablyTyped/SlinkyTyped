package typingsSlinky.ngCordova.ngCordova

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.cordovaPluginCamera.CameraOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICameraService extends StObject {
  
  def cleanup(): IPromise[Unit] = js.native
  
  def getPicture(): IPromise[String] = js.native
  def getPicture(options: CameraOptions): IPromise[String] = js.native
}
