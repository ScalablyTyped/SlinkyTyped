package typingsSlinky.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdeviceAttributes extends StObject {
  
  def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit = js.native
  
  def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit = js.native
  
  def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit = js.native
  
  def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit = js.native
}
object TypeofdeviceAttributes {
  
  @scala.inline
  def apply(
    getDeviceAnnotatedLocation: js.Function1[/* annotatedLocation */ String, Unit] => Unit,
    getDeviceAssetId: js.Function1[/* assetId */ String, Unit] => Unit,
    getDeviceSerialNumber: js.Function1[/* serialNumber */ String, Unit] => Unit,
    getDirectoryDeviceId: js.Function1[/* deviceId */ String, Unit] => Unit
  ): TypeofdeviceAttributes = {
    val __obj = js.Dynamic.literal(getDeviceAnnotatedLocation = js.Any.fromFunction1(getDeviceAnnotatedLocation), getDeviceAssetId = js.Any.fromFunction1(getDeviceAssetId), getDeviceSerialNumber = js.Any.fromFunction1(getDeviceSerialNumber), getDirectoryDeviceId = js.Any.fromFunction1(getDirectoryDeviceId))
    __obj.asInstanceOf[TypeofdeviceAttributes]
  }
  
  @scala.inline
  implicit class TypeofdeviceAttributesMutableBuilder[Self <: TypeofdeviceAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeviceAnnotatedLocation(value: js.Function1[/* annotatedLocation */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceAnnotatedLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeviceAssetId(value: js.Function1[/* assetId */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceAssetId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeviceSerialNumber(value: js.Function1[/* serialNumber */ String, Unit] => Unit): Self = StObject.set(x, "getDeviceSerialNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDirectoryDeviceId(value: js.Function1[/* deviceId */ String, Unit] => Unit): Self = StObject.set(x, "getDirectoryDeviceId", js.Any.fromFunction1(value))
  }
}
