package typingsSlinky.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProtectionsResponse extends StObject {
  
  /**
    * If you specify a value for MaxResults and you have more Protections than the value of MaxResults, AWS Shield Advanced returns a NextToken value in the response that allows you to list another group of Protections. For the second and subsequent ListProtections requests, specify the value of NextToken from the previous response to get information about another batch of Protections. Shield Advanced might return the list of Protection objects in batches smaller than the number specified by MaxResults. If there are more Protection objects to return, Shield Advanced will always also return a NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The array of enabled Protection objects.
    */
  var Protections: js.UndefOr[typingsSlinky.awsSdk.shieldMod.Protections] = js.native
}
object ListProtectionsResponse {
  
  @scala.inline
  def apply(): ListProtectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectionsResponse]
  }
  
  @scala.inline
  implicit class ListProtectionsResponseMutableBuilder[Self <: ListProtectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProtections(value: Protections): Self = StObject.set(x, "Protections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionsUndefined: Self = StObject.set(x, "Protections", js.undefined)
    
    @scala.inline
    def setProtectionsVarargs(value: Protection*): Self = StObject.set(x, "Protections", js.Array(value :_*))
  }
}
