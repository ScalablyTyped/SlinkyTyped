package typingsSlinky.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopHumanLoopRequest extends StObject {
  
  /**
    * The name of the human loop that you want to stop.
    */
  var HumanLoopName: typingsSlinky.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}
object StopHumanLoopRequest {
  
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): StopHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopHumanLoopRequest]
  }
  
  @scala.inline
  implicit class StopHumanLoopRequestMutableBuilder[Self <: StopHumanLoopRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
  }
}
