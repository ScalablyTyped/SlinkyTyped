package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectSentimentRequest extends js.Object {
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. All documents must be in the same language.
    */
  var LanguageCode: typingsSlinky.awsSdk.comprehendMod.LanguageCode = js.native
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: StringList = js.native
}

object BatchDetectSentimentRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, TextList: StringList): BatchDetectSentimentRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TextList = TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectSentimentRequest]
  }
  @scala.inline
  implicit class BatchDetectSentimentRequestOps[Self <: BatchDetectSentimentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageCode(value: LanguageCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextList(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

