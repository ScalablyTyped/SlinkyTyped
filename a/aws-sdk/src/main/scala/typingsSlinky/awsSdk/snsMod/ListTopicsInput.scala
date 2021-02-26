package typingsSlinky.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTopicsInput extends StObject {
  
  /**
    * Token returned by the previous ListTopics request.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
}
object ListTopicsInput {
  
  @scala.inline
  def apply(): ListTopicsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsInput]
  }
  
  @scala.inline
  implicit class ListTopicsInputMutableBuilder[Self <: ListTopicsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
