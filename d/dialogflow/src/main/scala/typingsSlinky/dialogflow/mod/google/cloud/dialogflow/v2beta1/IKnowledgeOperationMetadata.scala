package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeOperationMetadata.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a KnowledgeOperationMetadata. */
@js.native
trait IKnowledgeOperationMetadata extends js.Object {
  /** KnowledgeOperationMetadata state */
  var state: js.UndefOr[State | Null] = js.native
}

object IKnowledgeOperationMetadata {
  @scala.inline
  def apply(): IKnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKnowledgeOperationMetadata]
  }
  @scala.inline
  implicit class IKnowledgeOperationMetadataOps[Self <: IKnowledgeOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(null)
        ret
    }
  }
  
}

