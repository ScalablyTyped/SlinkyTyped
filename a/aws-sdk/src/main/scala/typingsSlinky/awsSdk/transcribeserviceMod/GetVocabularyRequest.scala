package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVocabularyRequest extends js.Object {
  /**
    * The name of the vocabulary to return information about. The name is case-sensitive.
    */
  var VocabularyName: typingsSlinky.awsSdk.transcribeserviceMod.VocabularyName = js.native
}

object GetVocabularyRequest {
  @scala.inline
  def apply(VocabularyName: VocabularyName): GetVocabularyRequest = {
    val __obj = js.Dynamic.literal(VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVocabularyRequest]
  }
  @scala.inline
  implicit class GetVocabularyRequestOps[Self <: GetVocabularyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVocabularyName(value: VocabularyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

