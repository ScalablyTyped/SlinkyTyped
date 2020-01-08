package typingsSlinky.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDocumentResult extends js.Object {
  /**
    * Information about the Systems Manager document.
    */
  var DocumentDescription: js.UndefOr[typingsSlinky.awsDashSdk.clientsSsmMod.DocumentDescription] = js.native
}

object CreateDocumentResult {
  @scala.inline
  def apply(DocumentDescription: DocumentDescription = null): CreateDocumentResult = {
    val __obj = js.Dynamic.literal()
    if (DocumentDescription != null) __obj.updateDynamic("DocumentDescription")(DocumentDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentResult]
  }
}

