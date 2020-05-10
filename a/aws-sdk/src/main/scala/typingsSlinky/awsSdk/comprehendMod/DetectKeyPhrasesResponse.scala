package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectKeyPhrasesResponse extends js.Object {
  /**
    * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence that Amazon Comprehend has in the accuracy of the detection. 
    */
  var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.native
}

object DetectKeyPhrasesResponse {
  @scala.inline
  def apply(): DetectKeyPhrasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectKeyPhrasesResponse]
  }
  @scala.inline
  implicit class DetectKeyPhrasesResponseOps[Self <: DetectKeyPhrasesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyPhrases(value: ListOfKeyPhrases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPhrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPhrases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPhrases")(js.undefined)
        ret
    }
  }
  
}

