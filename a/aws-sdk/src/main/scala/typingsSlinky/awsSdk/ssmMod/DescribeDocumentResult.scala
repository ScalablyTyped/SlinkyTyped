package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentResult extends js.Object {
  /**
    * Information about the Systems Manager document.
    */
  var Document: js.UndefOr[DocumentDescription] = js.native
}

object DescribeDocumentResult {
  @scala.inline
  def apply(): DescribeDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentResult]
  }
  @scala.inline
  implicit class DescribeDocumentResultOps[Self <: DescribeDocumentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: DocumentDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(js.undefined)
        ret
    }
  }
  
}

