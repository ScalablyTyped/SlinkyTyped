package typingsSlinky.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The sentiment analysis request message.
  */
@js.native
trait SchemaAnalyzeSentimentRequest extends js.Object {
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.native
  /**
    * The encoding type used by the API to calculate sentence offsets for the
    * sentence sentiment.
    */
  var encodingType: js.UndefOr[String] = js.native
}

object SchemaAnalyzeSentimentRequest {
  @scala.inline
  def apply(): SchemaAnalyzeSentimentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeSentimentRequest]
  }
  @scala.inline
  implicit class SchemaAnalyzeSentimentRequestOps[Self <: SchemaAnalyzeSentimentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: SchemaDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingType")(js.undefined)
        ret
    }
  }
  
}

