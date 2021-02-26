package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IspPlacement extends StObject {
  
  /**
    * The name of the email provider that the inbox placement data applies to.
    */
  var IspName: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.IspName] = js.native
  
  /**
    * An object that contains inbox placement metrics for a specific email provider.
    */
  var PlacementStatistics: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.PlacementStatistics] = js.native
}
object IspPlacement {
  
  @scala.inline
  def apply(): IspPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IspPlacement]
  }
  
  @scala.inline
  implicit class IspPlacementMutableBuilder[Self <: IspPlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIspName(value: IspName): Self = StObject.set(x, "IspName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIspNameUndefined: Self = StObject.set(x, "IspName", js.undefined)
    
    @scala.inline
    def setPlacementStatistics(value: PlacementStatistics): Self = StObject.set(x, "PlacementStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementStatisticsUndefined: Self = StObject.set(x, "PlacementStatistics", js.undefined)
  }
}
