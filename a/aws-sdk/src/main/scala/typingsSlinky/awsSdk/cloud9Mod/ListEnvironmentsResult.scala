package typingsSlinky.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEnvironmentsResult extends StObject {
  
  /**
    * The list of environment identifiers.
    */
  var environmentIds: js.UndefOr[EnvironmentIdList] = js.native
  
  /**
    * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListEnvironmentsResult {
  
  @scala.inline
  def apply(): ListEnvironmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResult]
  }
  
  @scala.inline
  implicit class ListEnvironmentsResultMutableBuilder[Self <: ListEnvironmentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentIds(value: EnvironmentIdList): Self = StObject.set(x, "environmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdsUndefined: Self = StObject.set(x, "environmentIds", js.undefined)
    
    @scala.inline
    def setEnvironmentIdsVarargs(value: EnvironmentId*): Self = StObject.set(x, "environmentIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
