package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListKnowledgeBasesResponse. */
@js.native
trait IListKnowledgeBasesResponse extends js.Object {
  /** ListKnowledgeBasesResponse knowledgeBases */
  var knowledgeBases: js.UndefOr[js.Array[IKnowledgeBase] | Null] = js.native
  /** ListKnowledgeBasesResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
}

object IListKnowledgeBasesResponse {
  @scala.inline
  def apply(): IListKnowledgeBasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListKnowledgeBasesResponse]
  }
  @scala.inline
  implicit class IListKnowledgeBasesResponseOps[Self <: IListKnowledgeBasesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnowledgeBases(value: js.Array[IKnowledgeBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeBases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnowledgeBases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeBases")(js.undefined)
        ret
    }
    @scala.inline
    def withKnowledgeBasesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knowledgeBases")(null)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(null)
        ret
    }
  }
  
}

