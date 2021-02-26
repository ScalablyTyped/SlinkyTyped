package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EbsConfiguration extends StObject {
  
  /**
    * An array of Amazon EBS volume specifications attached to a cluster instance.
    */
  var EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.native
  
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
}
object EbsConfiguration {
  
  @scala.inline
  def apply(): EbsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsConfiguration]
  }
  
  @scala.inline
  implicit class EbsConfigurationMutableBuilder[Self <: EbsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEbsBlockDeviceConfigs(value: EbsBlockDeviceConfigList): Self = StObject.set(x, "EbsBlockDeviceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsBlockDeviceConfigsUndefined: Self = StObject.set(x, "EbsBlockDeviceConfigs", js.undefined)
    
    @scala.inline
    def setEbsBlockDeviceConfigsVarargs(value: EbsBlockDeviceConfig*): Self = StObject.set(x, "EbsBlockDeviceConfigs", js.Array(value :_*))
    
    @scala.inline
    def setEbsOptimized(value: BooleanObject): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
  }
}
