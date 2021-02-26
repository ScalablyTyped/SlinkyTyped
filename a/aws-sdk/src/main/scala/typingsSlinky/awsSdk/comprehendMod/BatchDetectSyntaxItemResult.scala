package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectSyntaxItemResult extends StObject {
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  
  /**
    * The syntax tokens for the words in the document, one token for each word.
    */
  var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.native
}
object BatchDetectSyntaxItemResult {
  
  @scala.inline
  def apply(): BatchDetectSyntaxItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectSyntaxItemResult]
  }
  
  @scala.inline
  implicit class BatchDetectSyntaxItemResultMutableBuilder[Self <: BatchDetectSyntaxItemResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
    
    @scala.inline
    def setSyntaxTokens(value: ListOfSyntaxTokens): Self = StObject.set(x, "SyntaxTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxTokensUndefined: Self = StObject.set(x, "SyntaxTokens", js.undefined)
    
    @scala.inline
    def setSyntaxTokensVarargs(value: SyntaxToken*): Self = StObject.set(x, "SyntaxTokens", js.Array(value :_*))
  }
}
