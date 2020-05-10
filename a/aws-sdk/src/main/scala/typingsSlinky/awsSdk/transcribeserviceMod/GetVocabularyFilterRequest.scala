package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVocabularyFilterRequest extends js.Object {
  /**
    * The name of the vocabulary filter for which to return information.
    */
  var VocabularyFilterName: typingsSlinky.awsSdk.transcribeserviceMod.VocabularyFilterName = js.native
}

object GetVocabularyFilterRequest {
  @scala.inline
  def apply(VocabularyFilterName: VocabularyFilterName): GetVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVocabularyFilterRequest]
  }
  @scala.inline
  implicit class GetVocabularyFilterRequestOps[Self <: GetVocabularyFilterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVocabularyFilterName(value: VocabularyFilterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyFilterName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

