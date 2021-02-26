package typingsSlinky.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSubscriptionsInput extends StObject {
  
  /**
    * Token returned by the previous ListSubscriptions request.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
}
object ListSubscriptionsInput {
  
  @scala.inline
  def apply(): ListSubscriptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsInput]
  }
  
  @scala.inline
  implicit class ListSubscriptionsInputMutableBuilder[Self <: ListSubscriptionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
