package typingsSlinky.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProblemResponse extends StObject {
  
  /**
    * Information about the problem. 
    */
  var Problem: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Problem] = js.native
}
object DescribeProblemResponse {
  
  @scala.inline
  def apply(): DescribeProblemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProblemResponse]
  }
  
  @scala.inline
  implicit class DescribeProblemResponseMutableBuilder[Self <: DescribeProblemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProblem(value: Problem): Self = StObject.set(x, "Problem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblemUndefined: Self = StObject.set(x, "Problem", js.undefined)
  }
}
