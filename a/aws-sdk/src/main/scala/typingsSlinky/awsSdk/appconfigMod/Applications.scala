package typingsSlinky.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Applications extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[ApplicationList] = js.native
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.appconfigMod.NextToken] = js.native
}
object Applications {
  
  @scala.inline
  def apply(): Applications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Applications]
  }
  
  @scala.inline
  implicit class ApplicationsMutableBuilder[Self <: Applications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ApplicationList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Application*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
