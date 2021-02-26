package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Representation of an integrated device (such as a phone or a wearable) that
  * can hold sensors. Each sensor is exposed as a data source.  The main
  * purpose of the device information contained in this class is to identify
  * the hardware of a particular data source. This can be useful in different
  * ways, including:   - Distinguishing two similar sensors on different
  * devices (the step counter on two nexus 5 phones, for instance) - Display
  * the source of data to the user (by using the device make / model) - Treat
  * data differently depending on sensor type (accelerometers on a watch may
  * give different patterns than those on a phone) - Build different analysis
  * models for each device/version.
  */
@js.native
trait SchemaDevice extends StObject {
  
  /**
    * Manufacturer of the product/hardware.
    */
  var manufacturer: js.UndefOr[String] = js.native
  
  /**
    * End-user visible model name for the device.
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * A constant representing the type of the device.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The serial number or other unique ID for the hardware. This field is
    * obfuscated when read by any REST or Android client that did not create
    * the data source. Only the data source creator will see the uid field in
    * clear and normal form.
    */
  var uid: js.UndefOr[String] = js.native
  
  /**
    * Version string for the device hardware/software.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaDevice {
  
  @scala.inline
  def apply(): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevice]
  }
  
  @scala.inline
  implicit class SchemaDeviceMutableBuilder[Self <: SchemaDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
