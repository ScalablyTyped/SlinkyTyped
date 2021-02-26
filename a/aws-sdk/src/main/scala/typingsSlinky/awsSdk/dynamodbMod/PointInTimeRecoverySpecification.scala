package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointInTimeRecoverySpecification extends StObject {
  
  /**
    * Indicates whether point in time recovery is enabled (true) or disabled (false) on the table.
    */
  var PointInTimeRecoveryEnabled: BooleanObject = js.native
}
object PointInTimeRecoverySpecification {
  
  @scala.inline
  def apply(PointInTimeRecoveryEnabled: BooleanObject): PointInTimeRecoverySpecification = {
    val __obj = js.Dynamic.literal(PointInTimeRecoveryEnabled = PointInTimeRecoveryEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoverySpecification]
  }
  
  @scala.inline
  implicit class PointInTimeRecoverySpecificationMutableBuilder[Self <: PointInTimeRecoverySpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointInTimeRecoveryEnabled(value: BooleanObject): Self = StObject.set(x, "PointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
  }
}
