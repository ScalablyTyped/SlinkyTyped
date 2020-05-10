package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.IAnswer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a KnowledgeAnswers. */
@js.native
trait IKnowledgeAnswers extends js.Object {
  /** KnowledgeAnswers answers */
  var answers: js.UndefOr[js.Array[IAnswer] | Null] = js.native
}

object IKnowledgeAnswers {
  @scala.inline
  def apply(): IKnowledgeAnswers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKnowledgeAnswers]
  }
  @scala.inline
  implicit class IKnowledgeAnswersOps[Self <: IKnowledgeAnswers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswers(value: js.Array[IAnswer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answers")(js.undefined)
        ret
    }
    @scala.inline
    def withAnswersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answers")(null)
        ret
    }
  }
  
}

