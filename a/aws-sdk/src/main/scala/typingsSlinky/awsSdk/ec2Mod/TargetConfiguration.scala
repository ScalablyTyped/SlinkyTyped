package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetConfiguration extends StObject {
  
  /**
    * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the Convertible Reserved Instance offering.
    */
  var OfferingId: js.UndefOr[String] = js.native
}
object TargetConfiguration {
  
  @scala.inline
  def apply(): TargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetConfiguration]
  }
  
  @scala.inline
  implicit class TargetConfigurationMutableBuilder[Self <: TargetConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    @scala.inline
    def setOfferingId(value: String): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
  }
}
