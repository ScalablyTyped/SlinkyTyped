package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzeDocumentResponse extends js.Object {
  /**
    * The version of the model used to analyze the document.
    */
  var AnalyzeDocumentModelVersion: js.UndefOr[String] = js.native
  /**
    * The items that are detected and analyzed by AnalyzeDocument.
    */
  var Blocks: js.UndefOr[BlockList] = js.native
  /**
    * Metadata about the analyzed document. An example is the number of pages.
    */
  var DocumentMetadata: js.UndefOr[typingsSlinky.awsSdk.textractMod.DocumentMetadata] = js.native
  /**
    * Shows the results of the human in the loop evaluation.
    */
  var HumanLoopActivationOutput: js.UndefOr[typingsSlinky.awsSdk.textractMod.HumanLoopActivationOutput] = js.native
}

object AnalyzeDocumentResponse {
  @scala.inline
  def apply(): AnalyzeDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeDocumentResponse]
  }
  @scala.inline
  implicit class AnalyzeDocumentResponseOps[Self <: AnalyzeDocumentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzeDocumentModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyzeDocumentModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzeDocumentModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyzeDocumentModelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBlocks(value: BlockList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocks")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentMetadata(value: DocumentMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanLoopActivationOutput(value: HumanLoopActivationOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopActivationOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationOutput")(js.undefined)
        ret
    }
  }
  
}

