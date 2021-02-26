package typingsSlinky.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialPortInfoBase extends StObject {
  
  var locationId: String = js.native
  
  var manufacturer: String = js.native
  
  var product: String = js.native
  
  var productId: String = js.native
  
  var serialNumber: String = js.native
  
  var vendor: String = js.native
  
  var vendorId: String = js.native
}
object SerialPortInfoBase {
  
  @scala.inline
  def apply(
    locationId: String,
    manufacturer: String,
    product: String,
    productId: String,
    serialNumber: String,
    vendor: String,
    vendorId: String
  ): SerialPortInfoBase = {
    val __obj = js.Dynamic.literal(locationId = locationId.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPortInfoBase]
  }
  
  @scala.inline
  implicit class SerialPortInfoBaseMutableBuilder[Self <: SerialPortInfoBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
