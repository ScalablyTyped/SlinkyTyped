package typingsSlinky.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessConditionsOptions extends TimeoutIntervalOptions {
  
  var accessConditions: js.UndefOr[StorageAccessCondition] = js.native
}
object AccessConditionsOptions {
  
  @scala.inline
  def apply(): AccessConditionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessConditionsOptions]
  }
  
  @scala.inline
  implicit class AccessConditionsOptionsMutableBuilder[Self <: AccessConditionsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessConditions(value: StorageAccessCondition): Self = StObject.set(x, "accessConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessConditionsUndefined: Self = StObject.set(x, "accessConditions", js.undefined)
  }
}
