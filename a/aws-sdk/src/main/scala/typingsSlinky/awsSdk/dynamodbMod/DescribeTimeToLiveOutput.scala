package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTimeToLiveOutput extends StObject {
  
  /**
    * 
    */
  var TimeToLiveDescription: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TimeToLiveDescription] = js.native
}
object DescribeTimeToLiveOutput {
  
  @scala.inline
  def apply(): DescribeTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTimeToLiveOutput]
  }
  
  @scala.inline
  implicit class DescribeTimeToLiveOutputMutableBuilder[Self <: DescribeTimeToLiveOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeToLiveDescription(value: TimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
  }
}
