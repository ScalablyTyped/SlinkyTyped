package typingsSlinky.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVocabularyFilterResponse extends js.Object {
  /**
    * The language code of the words in the vocabulary filter.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsDashSdk.clientsTranscribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the vocabulary filter was updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the updated vocabulary filter.
    */
  var VocabularyFilterName: js.UndefOr[typingsSlinky.awsDashSdk.clientsTranscribeserviceMod.VocabularyFilterName] = js.native
}

object UpdateVocabularyFilterResponse {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode = null,
    LastModifiedTime: js.Date = null,
    VocabularyFilterName: VocabularyFilterName = null
  ): UpdateVocabularyFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (VocabularyFilterName != null) __obj.updateDynamic("VocabularyFilterName")(VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVocabularyFilterResponse]
  }
}

