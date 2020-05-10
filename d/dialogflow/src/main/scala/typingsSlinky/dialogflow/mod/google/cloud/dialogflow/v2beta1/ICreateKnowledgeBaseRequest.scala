package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateKnowledgeBaseRequest. */
@js.native
trait ICreateKnowledgeBaseRequest extends js.Object {
  /** CreateKnowledgeBaseRequest knowledgeBase */
  var knowledgeBase: js.UndefOr[IKnowledgeBase | Null] = js.native
  /** CreateKnowledgeBaseRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}

object ICreateKnowledgeBaseRequest {
  @scala.inline
  def apply(): ICreateKnowledgeBaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateKnowledgeBaseRequest]
  }
  @scala.inline
  implicit class ICreateKnowledgeBaseRequestOps[Self <: ICreateKnowledgeBaseRequest] (val x: Self) extends AnyVal {
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
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
  }
  
}

