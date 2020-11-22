package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVocabulariesResponse extends js.Object {
  
  /**
    * The ListVocabularies operation returns a page of vocabularies at a time. The maximum size of the page is set in the MaxResults parameter. If there are more jobs in the list than will fit on the page, Amazon Transcribe returns the NextPage token. To return in the next page of jobs, include the token in the next request to the ListVocabularies operation.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.NextToken] = js.native
  
  /**
    * The requested vocabulary state.
    */
  var Status: js.UndefOr[VocabularyState] = js.native
  
  /**
    * A list of objects that describe the vocabularies that match the search criteria in the request.
    */
  var Vocabularies: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.Vocabularies] = js.native
}
object ListVocabulariesResponse {
  
  @scala.inline
  def apply(): ListVocabulariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabulariesResponse]
  }
  
  @scala.inline
  implicit class ListVocabulariesResponseOps[Self <: ListVocabulariesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: VocabularyState): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setVocabulariesVarargs(value: VocabularyInfo*): Self = this.set("Vocabularies", js.Array(value :_*))
    
    @scala.inline
    def setVocabularies(value: Vocabularies): Self = this.set("Vocabularies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVocabularies: Self = this.set("Vocabularies", js.undefined)
  }
}
