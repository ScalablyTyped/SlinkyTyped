package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofdeviceAttributes extends js.Object {
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
  implicit class TypeofdeviceAttributesOps[Self <: TypeofdeviceAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDeviceAnnotatedLocation(value: js.Function1[/* annotatedLocation */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceAnnotatedLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDeviceAssetId(value: js.Function1[/* assetId */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceAssetId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDeviceSerialNumber(value: js.Function1[/* serialNumber */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceSerialNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDirectoryDeviceId(value: js.Function1[/* deviceId */ String, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectoryDeviceId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

