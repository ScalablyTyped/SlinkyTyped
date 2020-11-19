package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectSyntaxRequest extends js.Object {
  
  /**
    * The language of the input documents. You can specify any of the following languages supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or Portuguese ("pt"). All documents must be in the same language.
    */
  var LanguageCode: SyntaxLanguageCode = js.native
  
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: CustomerInputStringList = js.native
}
object BatchDetectSyntaxRequest {
  
  @scala.inline
  def apply(LanguageCode: SyntaxLanguageCode, TextList: CustomerInputStringList): BatchDetectSyntaxRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TextList = TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectSyntaxRequest]
  }
  
  @scala.inline
  implicit class BatchDetectSyntaxRequestOps[Self <: BatchDetectSyntaxRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLanguageCode(value: SyntaxLanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextListVarargs(value: CustomerInputString*): Self = this.set("TextList", js.Array(value :_*))
    
    @scala.inline
    def setTextList(value: CustomerInputStringList): Self = this.set("TextList", value.asInstanceOf[js.Any])
  }
}
