package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingConstraints extends StObject {
  
  /**
    * The upper boundary of EC2 instances in an instance group beyond which scaling activities are not allowed to grow. Scale-out activities will not add instances beyond this boundary.
    */
  var MaxCapacity: Integer = js.native
  
  /**
    * The lower boundary of EC2 instances in an instance group below which scaling activities are not allowed to shrink. Scale-in activities will not terminate instances below this boundary.
    */
  var MinCapacity: Integer = js.native
}
object ScalingConstraints {
  
  @scala.inline
  def apply(MaxCapacity: Integer, MinCapacity: Integer): ScalingConstraints = {
    val __obj = js.Dynamic.literal(MaxCapacity = MaxCapacity.asInstanceOf[js.Any], MinCapacity = MinCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingConstraints]
  }
  
  @scala.inline
  implicit class ScalingConstraintsMutableBuilder[Self <: ScalingConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCapacity(value: Integer): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCapacity(value: Integer): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
  }
}
