package typingsSlinky.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGraphResponse extends StObject {
  
  /**
    * The ARN of the new behavior graph.
    */
  var GraphArn: js.UndefOr[typingsSlinky.awsSdk.detectiveMod.GraphArn] = js.native
}
object CreateGraphResponse {
  
  @scala.inline
  def apply(): CreateGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphResponse]
  }
  
  @scala.inline
  implicit class CreateGraphResponseMutableBuilder[Self <: CreateGraphResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphArnUndefined: Self = StObject.set(x, "GraphArn", js.undefined)
  }
}
