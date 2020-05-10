package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to one question item within a form. Item responses can be accessed from FormResponse and created from any Item that asks the respondent to answer a question.
  *
  *     // Open a form by ID and log the responses to each question.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var formResponses = form.getResponses();
  *     for (var i = 0; i < formResponses.length; i++) {
  *       var formResponse = formResponses[i];
  *       var itemResponses = formResponse.getItemResponses();
  *       for (var j = 0; j < itemResponses.length; j++) {
  *         var itemResponse = itemResponses[j];
  *         Logger.log('Response #%s to the question "%s" was "%s"',
  *             (i + 1).toString(),
  *             itemResponse.getItem().getTitle(),
  *             itemResponse.getResponse());
  *       }
  *     }
  */
@js.native
trait ItemResponse extends js.Object {
  def getFeedback(): QuizFeedback = js.native
  def getItem(): Item = js.native
  def getResponse(): (js.Array[js.Array[String] | String]) | String = js.native
  def getScore(): Double = js.native
  def setFeedback(feedback: js.Any): ItemResponse = js.native
  def setScore(score: js.Any): ItemResponse = js.native
}

object ItemResponse {
  @scala.inline
  def apply(
    getFeedback: () => QuizFeedback,
    getItem: () => Item,
    getResponse: () => (js.Array[js.Array[String] | String]) | String,
    getScore: () => Double,
    setFeedback: js.Any => ItemResponse,
    setScore: js.Any => ItemResponse
  ): ItemResponse = {
    val __obj = js.Dynamic.literal(getFeedback = js.Any.fromFunction0(getFeedback), getItem = js.Any.fromFunction0(getItem), getResponse = js.Any.fromFunction0(getResponse), getScore = js.Any.fromFunction0(getScore), setFeedback = js.Any.fromFunction1(setFeedback), setScore = js.Any.fromFunction1(setScore))
    __obj.asInstanceOf[ItemResponse]
  }
  @scala.inline
  implicit class ItemResponseOps[Self <: ItemResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFeedback(value: () => QuizFeedback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeedback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: () => Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResponse(value: () => (js.Array[js.Array[String] | String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScore(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFeedback(value: js.Any => ItemResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFeedback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetScore(value: js.Any => ItemResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScore")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

