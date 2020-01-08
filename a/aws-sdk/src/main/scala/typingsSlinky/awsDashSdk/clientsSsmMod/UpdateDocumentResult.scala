package typingsSlinky.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentResult extends js.Object {
  /**
    * A description of the document that was updated.
    */
  var DocumentDescription: js.UndefOr[typingsSlinky.awsDashSdk.clientsSsmMod.DocumentDescription] = js.native
}

object UpdateDocumentResult {
  @scala.inline
  def apply(DocumentDescription: DocumentDescription = null): UpdateDocumentResult = {
    val __obj = js.Dynamic.literal()
    if (DocumentDescription != null) __obj.updateDynamic("DocumentDescription")(DocumentDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentResult]
  }
}

