package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseDataPointsItem extends StObject {
  
  var label: String = js.native
  
  var value: Double = js.native
}
object InsightsServiceAccountResponseDataPointsItem {
  
  @scala.inline
  def apply(label: String, value: Double): InsightsServiceAccountResponseDataPointsItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseDataPointsItem]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseDataPointsItemMutableBuilder[Self <: InsightsServiceAccountResponseDataPointsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
