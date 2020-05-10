package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to enter a single line of text. Items can be accessed
  * or created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new text item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addTextItem();
  *     item.setTitle('What is your name?');
  */
@js.native
trait TextItem extends js.Object {
  def clearValidation(): TextItem = js.native
  def createResponse(response: String): ItemResponse = js.native
  def duplicate(): TextItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): TextItem = js.native
  def setHelpText(text: String): TextItem = js.native
  def setPoints(points: Integer): TextItem = js.native
  def setRequired(enabled: Boolean): TextItem = js.native
  def setTitle(title: String): TextItem = js.native
  def setValidation(validation: TextValidation): TextItem = js.native
}

object TextItem {
  @scala.inline
  def apply(
    clearValidation: () => TextItem,
    createResponse: String => ItemResponse,
    duplicate: () => TextItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => TextItem,
    setHelpText: String => TextItem,
    setPoints: Integer => TextItem,
    setRequired: Boolean => TextItem,
    setTitle: String => TextItem,
    setValidation: TextValidation => TextItem
  ): TextItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[TextItem]
  }
  @scala.inline
  implicit class TextItemOps[Self <: TextItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearValidation(value: () => TextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearValidation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateResponse(value: String => ItemResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDuplicate(value: () => TextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGeneralFeedback(value: () => QuizFeedback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGeneralFeedback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHelpText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHelpText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPoints(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoints")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => ItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRequired(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetGeneralFeedback(value: QuizFeedback => TextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGeneralFeedback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => TextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPoints(value: Integer => TextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRequired(value: Boolean => TextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequired")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => TextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValidation(value: TextValidation => TextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValidation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

