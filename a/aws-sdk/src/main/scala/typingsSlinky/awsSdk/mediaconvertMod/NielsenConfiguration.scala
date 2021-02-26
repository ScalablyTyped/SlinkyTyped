package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NielsenConfiguration extends StObject {
  
  /**
    * Nielsen has discontinued the use of breakout code functionality. If you must include this property, set the value to zero.
    */
  var BreakoutCode: js.UndefOr[integerMin0Max0] = js.native
  
  /**
    * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by Neilsen.
    */
  var DistributorId: js.UndefOr[string] = js.native
}
object NielsenConfiguration {
  
  @scala.inline
  def apply(): NielsenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NielsenConfiguration]
  }
  
  @scala.inline
  implicit class NielsenConfigurationMutableBuilder[Self <: NielsenConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakoutCode(value: integerMin0Max0): Self = StObject.set(x, "BreakoutCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakoutCodeUndefined: Self = StObject.set(x, "BreakoutCode", js.undefined)
    
    @scala.inline
    def setDistributorId(value: string): Self = StObject.set(x, "DistributorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributorIdUndefined: Self = StObject.set(x, "DistributorId", js.undefined)
  }
}
