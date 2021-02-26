package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDocumentsResult extends StObject {
  
  /**
    * The names of the Systems Manager documents.
    */
  var DocumentIdentifiers: js.UndefOr[DocumentIdentifierList] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}
object ListDocumentsResult {
  
  @scala.inline
  def apply(): ListDocumentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentsResult]
  }
  
  @scala.inline
  implicit class ListDocumentsResultMutableBuilder[Self <: ListDocumentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentIdentifiers(value: DocumentIdentifierList): Self = StObject.set(x, "DocumentIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdentifiersUndefined: Self = StObject.set(x, "DocumentIdentifiers", js.undefined)
    
    @scala.inline
    def setDocumentIdentifiersVarargs(value: DocumentIdentifier*): Self = StObject.set(x, "DocumentIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
