package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVocabularyRequest extends js.Object {
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode = js.native
  /**
    * An array of strings that contains the vocabulary entries. 
    */
  var Phrases: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.Phrases] = js.native
  /**
    * The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in the same region as the API endpoint that you are calling. The general form is    https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   For example:  https://s3.us-east-1.amazonaws.com/examplebucket/vocab.txt  For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide. For more information about custom vocabularies, see Custom Vocabularies.
    */
  var VocabularyFileUri: js.UndefOr[Uri] = js.native
  /**
    * The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
    */
  var VocabularyName: typingsSlinky.awsSdk.transcribeserviceMod.VocabularyName = js.native
}

object CreateVocabularyRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, VocabularyName: VocabularyName): CreateVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVocabularyRequest]
  }
  @scala.inline
  implicit class CreateVocabularyRequestOps[Self <: CreateVocabularyRequest] (val x: Self) extends AnyVal {
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
    def withVocabularyName(value: VocabularyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhrases(value: Phrases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhrases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Phrases")(js.undefined)
        ret
    }
    @scala.inline
    def withVocabularyFileUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyFileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVocabularyFileUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VocabularyFileUri")(js.undefined)
        ret
    }
  }
  
}

