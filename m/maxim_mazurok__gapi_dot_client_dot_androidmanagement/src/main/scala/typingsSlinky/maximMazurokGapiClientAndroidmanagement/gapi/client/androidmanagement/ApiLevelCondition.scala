package typingsSlinky.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiLevelCondition extends StObject {
  
  /** The minimum desired Android Framework API level. If the device doesn't meet the minimum requirement, this condition is satisfied. Must be greater than zero. */
  var minApiLevel: js.UndefOr[Double] = js.native
}
object ApiLevelCondition {
  
  @scala.inline
  def apply(): ApiLevelCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiLevelCondition]
  }
  
  @scala.inline
  implicit class ApiLevelConditionMutableBuilder[Self <: ApiLevelCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinApiLevel(value: Double): Self = StObject.set(x, "minApiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinApiLevelUndefined: Self = StObject.set(x, "minApiLevel", js.undefined)
  }
}
