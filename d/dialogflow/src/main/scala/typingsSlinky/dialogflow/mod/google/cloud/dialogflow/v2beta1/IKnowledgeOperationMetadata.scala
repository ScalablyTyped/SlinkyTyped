package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a KnowledgeOperationMetadata. */
trait IKnowledgeOperationMetadata extends js.Object {
  /** KnowledgeOperationMetadata state */
  var state: js.UndefOr[State | Null] = js.undefined
}

object IKnowledgeOperationMetadata {
  @scala.inline
  def apply(state: js.UndefOr[Null | State] = js.undefined): IKnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnowledgeOperationMetadata]
  }
}

