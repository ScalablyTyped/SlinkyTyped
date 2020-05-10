package typingsSlinky.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceService extends js.Object {
  /**
  		* Returns the Cordova version.
  		* @see https://github.com/apache/cordova-plugin-device#devicecordova
  		* @returns {String} The Cordova version.
  		*/
  def getCordova(): String = js.native
  /**
  		* Returns the whole device object.
  		* @see https://github.com/apache/cordova-plugin-device
  		* @returns {Object} The device object.
  		*/
  def getDevice(): IDeviceInfo = js.native
  /**
  		* Returns the device manufacturer.
  		* @returns {String}
  		*/
  def getManufacturer(): String = js.native
  /**
  		* Returns the name of the device's model or product.
  		* @see https://github.com/apache/cordova-plugin-device#devicemodel
  		* @returns {String} The name of the device's model or product.
  		*/
  def getModel(): String = js.native
  /**
  		* @deprecated device.name is deprecated as of version 2.3.0. Use device.model instead.
  		* @returns {String}
  		*/
  def getName(): String = js.native
  /**
  		* Returns the device's operating system name.
  		* @see https://github.com/apache/cordova-plugin-device#deviceplatform
  		* @returns {String} The device's operating system name.
  		*/
  def getPlatform(): String = js.native
  /**
  		* Returns the device's Universally Unique Identifier.
  		* @see https://github.com/apache/cordova-plugin-device#deviceuuid
  		* @returns {String} The device's Universally Unique Identifier
  		*/
  def getUUID(): String = js.native
  /**
  		* Returns the operating system version.
  		* @see https://github.com/apache/cordova-plugin-device#deviceversion
  		* @returns {String}
  		*/
  def getVersion(): String = js.native
}

object IDeviceService {
  @scala.inline
  def apply(
    getCordova: () => String,
    getDevice: () => IDeviceInfo,
    getManufacturer: () => String,
    getModel: () => String,
    getName: () => String,
    getPlatform: () => String,
    getUUID: () => String,
    getVersion: () => String
  ): IDeviceService = {
    val __obj = js.Dynamic.literal(getCordova = js.Any.fromFunction0(getCordova), getDevice = js.Any.fromFunction0(getDevice), getManufacturer = js.Any.fromFunction0(getManufacturer), getModel = js.Any.fromFunction0(getModel), getName = js.Any.fromFunction0(getName), getPlatform = js.Any.fromFunction0(getPlatform), getUUID = js.Any.fromFunction0(getUUID), getVersion = js.Any.fromFunction0(getVersion))
    __obj.asInstanceOf[IDeviceService]
  }
  @scala.inline
  implicit class IDeviceServiceOps[Self <: IDeviceService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCordova(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCordova")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDevice(value: () => IDeviceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDevice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetManufacturer(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getManufacturer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPlatform(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlatform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUUID(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUUID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

