package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListOutgoingTypedLinksResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.native
}
object BatchListOutgoingTypedLinksResponse {
  
  @scala.inline
  def apply(): BatchListOutgoingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListOutgoingTypedLinksResponse]
  }
  
  @scala.inline
  implicit class BatchListOutgoingTypedLinksResponseMutableBuilder[Self <: BatchListOutgoingTypedLinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTypedLinkSpecifiers(value: TypedLinkSpecifierList): Self = StObject.set(x, "TypedLinkSpecifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedLinkSpecifiersUndefined: Self = StObject.set(x, "TypedLinkSpecifiers", js.undefined)
    
    @scala.inline
    def setTypedLinkSpecifiersVarargs(value: TypedLinkSpecifier*): Self = StObject.set(x, "TypedLinkSpecifiers", js.Array(value :_*))
  }
}
