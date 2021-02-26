package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionOriginGroupFailoverCriteria extends StObject {
  
  /**
    * A list of HTTP status codes for the origin group
    */
  var statusCodes: Input[js.Array[Input[Double]]] = js.native
}
object DistributionOriginGroupFailoverCriteria {
  
  @scala.inline
  def apply(statusCodes: Input[js.Array[Input[Double]]]): DistributionOriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(statusCodes = statusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginGroupFailoverCriteria]
  }
  
  @scala.inline
  implicit class DistributionOriginGroupFailoverCriteriaMutableBuilder[Self <: DistributionOriginGroupFailoverCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCodes(value: Input[js.Array[Input[Double]]]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodesVarargs(value: Input[Double]*): Self = StObject.set(x, "statusCodes", js.Array(value :_*))
  }
}
