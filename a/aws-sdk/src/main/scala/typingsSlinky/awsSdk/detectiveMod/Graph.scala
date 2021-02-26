package typingsSlinky.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graph extends StObject {
  
  /**
    * The ARN of the behavior graph.
    */
  var Arn: js.UndefOr[GraphArn] = js.native
  
  /**
    * The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
}
object Graph {
  
  @scala.inline
  def apply(): Graph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph]
  }
  
  @scala.inline
  implicit class GraphMutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: GraphArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
  }
}
