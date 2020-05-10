package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to the form as a whole. A FormResponse can be used in three ways: to access
  * the answers submitted by a respondent (see getItemResponses()), to programmatically
  * submit a response to the form (see withItemResponse(response) and submit()), and to generate a URL for the form which pre-fills fields using the provided
  * answers. FormResponses can be created or accessed from a Form.
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
trait FormResponse extends js.Object {
  def getEditResponseUrl(): String = js.native
  def getGradableItemResponses(): js.Array[ItemResponse] = js.native
  def getGradableResponseForItem(item: Item): ItemResponse = js.native
  def getId(): String = js.native
  def getItemResponses(): js.Array[ItemResponse] = js.native
  def getRespondentEmail(): String = js.native
  def getResponseForItem(item: Item): ItemResponse = js.native
  def getTimestamp(): Date = js.native
  def submit(): FormResponse = js.native
  def toPrefilledUrl(): String = js.native
  def withItemGrade(gradedResponse: ItemResponse): FormResponse = js.native
  def withItemResponse(response: ItemResponse): FormResponse = js.native
}

object FormResponse {
  @scala.inline
  def apply(
    getEditResponseUrl: () => String,
    getGradableItemResponses: () => js.Array[ItemResponse],
    getGradableResponseForItem: Item => ItemResponse,
    getId: () => String,
    getItemResponses: () => js.Array[ItemResponse],
    getRespondentEmail: () => String,
    getResponseForItem: Item => ItemResponse,
    getTimestamp: () => Date,
    submit: () => FormResponse,
    toPrefilledUrl: () => String,
    withItemGrade: ItemResponse => FormResponse,
    withItemResponse: ItemResponse => FormResponse
  ): FormResponse = {
    val __obj = js.Dynamic.literal(getEditResponseUrl = js.Any.fromFunction0(getEditResponseUrl), getGradableItemResponses = js.Any.fromFunction0(getGradableItemResponses), getGradableResponseForItem = js.Any.fromFunction1(getGradableResponseForItem), getId = js.Any.fromFunction0(getId), getItemResponses = js.Any.fromFunction0(getItemResponses), getRespondentEmail = js.Any.fromFunction0(getRespondentEmail), getResponseForItem = js.Any.fromFunction1(getResponseForItem), getTimestamp = js.Any.fromFunction0(getTimestamp), submit = js.Any.fromFunction0(submit), toPrefilledUrl = js.Any.fromFunction0(toPrefilledUrl), withItemGrade = js.Any.fromFunction1(withItemGrade), withItemResponse = js.Any.fromFunction1(withItemResponse))
    __obj.asInstanceOf[FormResponse]
  }
  @scala.inline
  implicit class FormResponseOps[Self <: FormResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEditResponseUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditResponseUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGradableItemResponses(value: () => js.Array[ItemResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGradableItemResponses")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGradableResponseForItem(value: Item => ItemResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGradableResponseForItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItemResponses(value: () => js.Array[ItemResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemResponses")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRespondentEmail(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRespondentEmail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResponseForItem(value: Item => ItemResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponseForItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTimestamp(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimestamp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubmit(value: () => FormResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToPrefilledUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPrefilledUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWithItemGrade(value: ItemResponse => FormResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withItemGrade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithItemResponse(value: ItemResponse => FormResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withItemResponse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

