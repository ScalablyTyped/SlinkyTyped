package typingsSlinky.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenInfo extends js.Object {
  var firmwareVersion: Version = js.native
  var flags: Double = js.native
  var freePrivateMemory: Double = js.native
  var freePublicMemory: Double = js.native
  var hardwareVersion: Version = js.native
  var label: String = js.native
  var manufacturerID: String = js.native
  var maxPinLen: Double = js.native
  var maxRwSessionCount: Double = js.native
  var maxSessionCount: Double = js.native
  var minPinLen: Double = js.native
  var model: String = js.native
  var rwSessionCount: Double = js.native
  var serialNumber: String = js.native
  var sessionCount: Double = js.native
  var totalPrivateMemory: Double = js.native
  var totalPublicMemory: Double = js.native
  var utcTime: String = js.native
}

object TokenInfo {
  @scala.inline
  def apply(
    firmwareVersion: Version,
    flags: Double,
    freePrivateMemory: Double,
    freePublicMemory: Double,
    hardwareVersion: Version,
    label: String,
    manufacturerID: String,
    maxPinLen: Double,
    maxRwSessionCount: Double,
    maxSessionCount: Double,
    minPinLen: Double,
    model: String,
    rwSessionCount: Double,
    serialNumber: String,
    sessionCount: Double,
    totalPrivateMemory: Double,
    totalPublicMemory: Double,
    utcTime: String
  ): TokenInfo = {
    val __obj = js.Dynamic.literal(firmwareVersion = firmwareVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], freePrivateMemory = freePrivateMemory.asInstanceOf[js.Any], freePublicMemory = freePublicMemory.asInstanceOf[js.Any], hardwareVersion = hardwareVersion.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any], maxPinLen = maxPinLen.asInstanceOf[js.Any], maxRwSessionCount = maxRwSessionCount.asInstanceOf[js.Any], maxSessionCount = maxSessionCount.asInstanceOf[js.Any], minPinLen = minPinLen.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], rwSessionCount = rwSessionCount.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], sessionCount = sessionCount.asInstanceOf[js.Any], totalPrivateMemory = totalPrivateMemory.asInstanceOf[js.Any], totalPublicMemory = totalPublicMemory.asInstanceOf[js.Any], utcTime = utcTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
  @scala.inline
  implicit class TokenInfoOps[Self <: TokenInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirmwareVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreePrivateMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freePrivateMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreePublicMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freePublicMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHardwareVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPinLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPinLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRwSessionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRwSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSessionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPinLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPinLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRwSessionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rwSessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPrivateMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPrivateMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPublicMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPublicMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtcTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

