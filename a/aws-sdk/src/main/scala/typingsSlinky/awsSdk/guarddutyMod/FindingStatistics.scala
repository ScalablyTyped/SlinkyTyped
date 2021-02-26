package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingStatistics extends StObject {
  
  /**
    * Represents a map of severity to count statistics for a set of findings.
    */
  var CountBySeverity: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.CountBySeverity] = js.native
}
object FindingStatistics {
  
  @scala.inline
  def apply(): FindingStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingStatistics]
  }
  
  @scala.inline
  implicit class FindingStatisticsMutableBuilder[Self <: FindingStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountBySeverity(value: CountBySeverity): Self = StObject.set(x, "CountBySeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountBySeverityUndefined: Self = StObject.set(x, "CountBySeverity", js.undefined)
  }
}
