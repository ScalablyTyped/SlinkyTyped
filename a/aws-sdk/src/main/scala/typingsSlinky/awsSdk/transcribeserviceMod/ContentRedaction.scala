package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentRedaction extends js.Object {
  /**
    * Request parameter where you choose whether to output only the redacted transcript or generate an additional unredacted transcript. When you choose redacted Amazon Transcribe outputs a JSON file with only the redacted transcript and related information. When you choose redacted_and_unredacted Amazon Transcribe outputs a JSON file with the unredacted transcript and related information in addition to the JSON file with the redacted transcript.
    */
  var RedactionOutput: typingsSlinky.awsSdk.transcribeserviceMod.RedactionOutput = js.native
  /**
    * Request parameter that defines the entities to be redacted. The only accepted value is PII.
    */
  var RedactionType: typingsSlinky.awsSdk.transcribeserviceMod.RedactionType = js.native
}

object ContentRedaction {
  @scala.inline
  def apply(RedactionOutput: RedactionOutput, RedactionType: RedactionType): ContentRedaction = {
    val __obj = js.Dynamic.literal(RedactionOutput = RedactionOutput.asInstanceOf[js.Any], RedactionType = RedactionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRedaction]
  }
  @scala.inline
  implicit class ContentRedactionOps[Self <: ContentRedaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedactionOutput(value: RedactionOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedactionOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedactionType(value: RedactionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedactionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

