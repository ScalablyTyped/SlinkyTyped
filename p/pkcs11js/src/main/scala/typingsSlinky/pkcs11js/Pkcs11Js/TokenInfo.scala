package typingsSlinky.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenInfo extends StObject {
  
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
  implicit class TokenInfoMutableBuilder[Self <: TokenInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirmwareVersion(value: Version): Self = StObject.set(x, "firmwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreePrivateMemory(value: Double): Self = StObject.set(x, "freePrivateMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreePublicMemory(value: Double): Self = StObject.set(x, "freePublicMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareVersion(value: Version): Self = StObject.set(x, "hardwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerID(value: String): Self = StObject.set(x, "manufacturerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPinLen(value: Double): Self = StObject.set(x, "maxPinLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRwSessionCount(value: Double): Self = StObject.set(x, "maxRwSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSessionCount(value: Double): Self = StObject.set(x, "maxSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPinLen(value: Double): Self = StObject.set(x, "minPinLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRwSessionCount(value: Double): Self = StObject.set(x, "rwSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionCount(value: Double): Self = StObject.set(x, "sessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPrivateMemory(value: Double): Self = StObject.set(x, "totalPrivateMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPublicMemory(value: Double): Self = StObject.set(x, "totalPublicMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcTime(value: String): Self = StObject.set(x, "utcTime", value.asInstanceOf[js.Any])
  }
}
