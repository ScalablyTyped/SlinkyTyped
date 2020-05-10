package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectDocumentTextResponse extends js.Object {
  /**
    * An array of Block objects that contain the text that's detected in the document.
    */
  var Blocks: js.UndefOr[BlockList] = js.native
  /**
    * 
    */
  var DetectDocumentTextModelVersion: js.UndefOr[String] = js.native
  /**
    * Metadata about the document. It contains the number of pages that are detected in the document.
    */
  var DocumentMetadata: js.UndefOr[typingsSlinky.awsSdk.textractMod.DocumentMetadata] = js.native
}

object DetectDocumentTextResponse {
  @scala.inline
  def apply(): DetectDocumentTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectDocumentTextResponse]
  }
  @scala.inline
  implicit class DetectDocumentTextResponseOps[Self <: DetectDocumentTextResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDetectDocumentTextModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectDocumentTextModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectDocumentTextModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectDocumentTextModelVersion")(js.undefined)
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
  }
  
}

