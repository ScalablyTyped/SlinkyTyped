package typingsSlinky.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVocabularyResponse extends js.Object {
  /**
    * If the VocabularyState field is FAILED, this field contains information about why the job failed.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsDashSdk.clientsTranscribeserviceMod.FailureReason] = js.native
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: js.UndefOr[typingsSlinky.awsDashSdk.clientsTranscribeserviceMod.LanguageCode] = js.native
  /**
    * The date and time that the vocabulary was created.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the vocabulary.
    */
  var VocabularyName: js.UndefOr[typingsSlinky.awsDashSdk.clientsTranscribeserviceMod.VocabularyName] = js.native
  /**
    * The processing state of the vocabulary. When the VocabularyState field contains READY the vocabulary is ready to be used in a StartTranscriptionJob request.
    */
  var VocabularyState: js.UndefOr[typingsSlinky.awsDashSdk.clientsTranscribeserviceMod.VocabularyState] = js.native
}

object CreateVocabularyResponse {
  @scala.inline
  def apply(
    FailureReason: FailureReason = null,
    LanguageCode: LanguageCode = null,
    LastModifiedTime: js.Date = null,
    VocabularyName: VocabularyName = null,
    VocabularyState: VocabularyState = null
  ): CreateVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (VocabularyName != null) __obj.updateDynamic("VocabularyName")(VocabularyName.asInstanceOf[js.Any])
    if (VocabularyState != null) __obj.updateDynamic("VocabularyState")(VocabularyState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyResponse]
  }
}

