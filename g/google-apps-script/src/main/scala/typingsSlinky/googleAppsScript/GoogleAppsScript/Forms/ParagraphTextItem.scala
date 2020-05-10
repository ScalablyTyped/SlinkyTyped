package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to enter a block of text. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new paragraph text item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addParagraphTextItem();
  *     item.setTitle('What is your address?');
  */
@js.native
trait ParagraphTextItem extends js.Object {
  def clearValidation(): ParagraphTextItem = js.native
  def createResponse(response: String): ItemResponse = js.native
  def duplicate(): ParagraphTextItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getPoints(): Integer = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def isRequired(): Boolean = js.native
  def setGeneralFeedback(feedback: QuizFeedback): ParagraphTextItem = js.native
  def setHelpText(text: String): ParagraphTextItem = js.native
  def setPoints(points: Integer): ParagraphTextItem = js.native
  def setRequired(enabled: Boolean): ParagraphTextItem = js.native
  def setTitle(title: String): ParagraphTextItem = js.native
  def setValidation(validation: ParagraphTextValidation): ParagraphTextItem = js.native
}

object ParagraphTextItem {
  @scala.inline
  def apply(
    clearValidation: () => ParagraphTextItem,
    createResponse: String => ItemResponse,
    duplicate: () => ParagraphTextItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => ParagraphTextItem,
    setHelpText: String => ParagraphTextItem,
    setPoints: Integer => ParagraphTextItem,
    setRequired: Boolean => ParagraphTextItem,
    setTitle: String => ParagraphTextItem,
    setValidation: ParagraphTextValidation => ParagraphTextItem
  ): ParagraphTextItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[ParagraphTextItem]
  }
  @scala.inline
  implicit class ParagraphTextItemOps[Self <: ParagraphTextItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearValidation(value: () => ParagraphTextItem): Self = {
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
    def withDuplicate(value: () => ParagraphTextItem): Self = {
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
    def withSetGeneralFeedback(value: QuizFeedback => ParagraphTextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGeneralFeedback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => ParagraphTextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPoints(value: Integer => ParagraphTextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRequired(value: Boolean => ParagraphTextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequired")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => ParagraphTextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValidation(value: ParagraphTextValidation => ParagraphTextItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValidation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

