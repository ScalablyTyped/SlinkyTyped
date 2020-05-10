package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectDominantLanguageResponse extends js.Object {
  /**
    * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.native
}

object DetectDominantLanguageResponse {
  @scala.inline
  def apply(): DetectDominantLanguageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectDominantLanguageResponse]
  }
  @scala.inline
  implicit class DetectDominantLanguageResponseOps[Self <: DetectDominantLanguageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguages(value: ListOfDominantLanguages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Languages")(js.undefined)
        ret
    }
  }
  
}

