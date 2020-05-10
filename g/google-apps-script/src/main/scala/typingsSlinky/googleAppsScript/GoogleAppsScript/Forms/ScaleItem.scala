package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question item that allows the respondent to choose one option from a numbered sequence of radio
  * buttons. Items can be accessed or created from a Form. When used in a quiz, these items
  * are graded.
  *
  *     // Open a form by ID and add a new scale item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addScaleItem();
  *     item.setTitle('Pick a number between 1 and 10')
  *         .setBounds(1, 10);
  */
@js.native
trait ScaleItem extends js.Object {
  def createResponse(response: Integer): ItemResponse = js.native
  def duplicate(): ScaleItem = js.native
  def getGeneralFeedback(): QuizFeedback = js.native
  def getHelpText(): String = js.native
  def getId(): Integer = js.native
  def getIndex(): Integer = js.native
  def getLeftLabel(): String = js.native
  def getLowerBound(): Integer = js.native
  def getPoints(): Integer = js.native
  def getRightLabel(): String = js.native
  def getTitle(): String = js.native
  def getType(): ItemType = js.native
  def getUpperBound(): Integer = js.native
  def isRequired(): Boolean = js.native
  def setBounds(lower: Integer, upper: Integer): ScaleItem = js.native
  def setGeneralFeedback(feedback: QuizFeedback): ScaleItem = js.native
  def setHelpText(text: String): ScaleItem = js.native
  def setLabels(lower: String, upper: String): ScaleItem = js.native
  def setPoints(points: Integer): ScaleItem = js.native
  def setRequired(enabled: Boolean): ScaleItem = js.native
  def setTitle(title: String): ScaleItem = js.native
}

object ScaleItem {
  @scala.inline
  def apply(
    createResponse: Integer => ItemResponse,
    duplicate: () => ScaleItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getLeftLabel: () => String,
    getLowerBound: () => Integer,
    getPoints: () => Integer,
    getRightLabel: () => String,
    getTitle: () => String,
    getType: () => ItemType,
    getUpperBound: () => Integer,
    isRequired: () => Boolean,
    setBounds: (Integer, Integer) => ScaleItem,
    setGeneralFeedback: QuizFeedback => ScaleItem,
    setHelpText: String => ScaleItem,
    setLabels: (String, String) => ScaleItem,
    setPoints: Integer => ScaleItem,
    setRequired: Boolean => ScaleItem,
    setTitle: String => ScaleItem
  ): ScaleItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getLeftLabel = js.Any.fromFunction0(getLeftLabel), getLowerBound = js.Any.fromFunction0(getLowerBound), getPoints = js.Any.fromFunction0(getPoints), getRightLabel = js.Any.fromFunction0(getRightLabel), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), getUpperBound = js.Any.fromFunction0(getUpperBound), isRequired = js.Any.fromFunction0(isRequired), setBounds = js.Any.fromFunction2(setBounds), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setLabels = js.Any.fromFunction2(setLabels), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[ScaleItem]
  }
  @scala.inline
  implicit class ScaleItemOps[Self <: ScaleItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateResponse(value: Integer => ItemResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDuplicate(value: () => ScaleItem): Self = {
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
    def withGetLeftLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLeftLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLowerBound(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLowerBound")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPoints(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoints")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRightLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRightLabel")(js.Any.fromFunction0(value))
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
    def withGetUpperBound(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpperBound")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRequired(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBounds(value: (Integer, Integer) => ScaleItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBounds")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetGeneralFeedback(value: QuizFeedback => ScaleItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGeneralFeedback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHelpText(value: String => ScaleItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHelpText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabels(value: (String, String) => ScaleItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabels")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetPoints(value: Integer => ScaleItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRequired(value: Boolean => ScaleItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequired")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => ScaleItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

