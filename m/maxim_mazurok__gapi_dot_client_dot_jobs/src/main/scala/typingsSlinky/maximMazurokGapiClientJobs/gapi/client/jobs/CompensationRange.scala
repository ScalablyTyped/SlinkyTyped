package typingsSlinky.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompensationRange extends StObject {
  
  /**
    * Optional. The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of
    * min_compensation.
    */
  var maxCompensation: js.UndefOr[Money] = js.native
  
  /** Optional. The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation. */
  var minCompensation: js.UndefOr[Money] = js.native
}
object CompensationRange {
  
  @scala.inline
  def apply(): CompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationRange]
  }
  
  @scala.inline
  implicit class CompensationRangeMutableBuilder[Self <: CompensationRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCompensation(value: Money): Self = StObject.set(x, "maxCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCompensationUndefined: Self = StObject.set(x, "maxCompensation", js.undefined)
    
    @scala.inline
    def setMinCompensation(value: Money): Self = StObject.set(x, "minCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCompensationUndefined: Self = StObject.set(x, "minCompensation", js.undefined)
  }
}
