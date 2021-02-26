package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateSpotMarketOptions extends StObject {
  
  /**
    * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.native
  
  /**
    * The behavior when a Spot Instance is interrupted.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances.
    */
  var MaxPrice: js.UndefOr[String] = js.native
  
  /**
    * The Spot Instance request type.
    */
  var SpotInstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.SpotInstanceType] = js.native
  
  /**
    * The end date of the request. For a one-time request, the request remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date and time is reached.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}
object LaunchTemplateSpotMarketOptions {
  
  @scala.inline
  def apply(): LaunchTemplateSpotMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpotMarketOptions]
  }
  
  @scala.inline
  implicit class LaunchTemplateSpotMarketOptionsMutableBuilder[Self <: LaunchTemplateSpotMarketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockDurationMinutes(value: Integer): Self = StObject.set(x, "BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDurationMinutesUndefined: Self = StObject.set(x, "BlockDurationMinutes", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setMaxPrice(value: String): Self = StObject.set(x, "MaxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPriceUndefined: Self = StObject.set(x, "MaxPrice", js.undefined)
    
    @scala.inline
    def setSpotInstanceType(value: SpotInstanceType): Self = StObject.set(x, "SpotInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstanceTypeUndefined: Self = StObject.set(x, "SpotInstanceType", js.undefined)
    
    @scala.inline
    def setValidUntil(value: js.Date): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
