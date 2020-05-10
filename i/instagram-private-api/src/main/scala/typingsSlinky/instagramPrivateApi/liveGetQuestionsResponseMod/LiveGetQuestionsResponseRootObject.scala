package typingsSlinky.instagramPrivateApi.liveGetQuestionsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveGetQuestionsResponseRootObject extends js.Object {
  var questions: js.Array[LiveGetQuestionsResponseQuestionsItem] = js.native
  var status: String = js.native
}

object LiveGetQuestionsResponseRootObject {
  @scala.inline
  def apply(questions: js.Array[LiveGetQuestionsResponseQuestionsItem], status: String): LiveGetQuestionsResponseRootObject = {
    val __obj = js.Dynamic.literal(questions = questions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveGetQuestionsResponseRootObject]
  }
  @scala.inline
  implicit class LiveGetQuestionsResponseRootObjectOps[Self <: LiveGetQuestionsResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuestions(value: js.Array[LiveGetQuestionsResponseQuestionsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

