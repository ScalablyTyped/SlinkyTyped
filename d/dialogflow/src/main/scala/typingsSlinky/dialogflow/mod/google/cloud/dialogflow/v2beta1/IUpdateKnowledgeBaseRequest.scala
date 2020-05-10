package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateKnowledgeBaseRequest. */
@js.native
trait IUpdateKnowledgeBaseRequest extends js.Object {
  /** UpdateKnowledgeBaseRequest knowledgeBase */
  var knowledgeBase: js.UndefOr[IKnowledgeBase | Null] = js.native
  /** UpdateKnowledgeBaseRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}

object IUpdateKnowledgeBaseRequest {
  @scala.inline
  def apply(): IUpdateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateKnowledgeBaseRequest]
  }
  @scala.inline
  implicit class IUpdateKnowledgeBaseRequestOps[Self <: IUpdateKnowledgeBaseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnowledgeBase(value: IKnowledgeBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnowledgeBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeBase")(js.undefined)
        ret
    }
    @scala.inline
    def withKnowledgeBaseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeBase")(null)
        ret
    }
    @scala.inline
    def withUpdateMask(value: IFieldMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMaskNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(null)
        ret
    }
  }
  
}

