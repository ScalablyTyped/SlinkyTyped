package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single choice associated with a type of Item that supports choices, like CheckboxItem, ListItem, or MultipleChoiceItem.
  *
  *     // Create a new form and add a multiple-choice item.
  *     var form = FormApp.create('Form Name');
  *     var item = form.addMultipleChoiceItem();
  *     item.setTitle('Do you prefer cats or dogs?')
  *         .setChoices([
  *             item.createChoice('Cats', FormApp.PageNavigationType.CONTINUE),
  *             item.createChoice('Dogs', FormApp.PageNavigationType.RESTART)
  *         ]);
  *
  *     // Add another page because navigation has no effect on the last page.
  *     form.addPageBreakItem().setTitle('You chose well!');
  *
  *     // Log the navigation types that each choice results in.
  *     var choices = item.getChoices();
  *     for (var i = 0; i < choices.length; i++) {
  *     Logger.log('If the respondent chooses "%s", the form will %s.',
  *                choices[i].getValue(),
  *                choices[i].getPageNavigationType());
  *     }
  */
@js.native
trait Choice extends js.Object {
  def getGotoPage(): PageBreakItem = js.native
  def getPageNavigationType(): PageNavigationType = js.native
  def getValue(): String = js.native
  def isCorrectAnswer(): Boolean = js.native
}

object Choice {
  @scala.inline
  def apply(
    getGotoPage: () => PageBreakItem,
    getPageNavigationType: () => PageNavigationType,
    getValue: () => String,
    isCorrectAnswer: () => Boolean
  ): Choice = {
    val __obj = js.Dynamic.literal(getGotoPage = js.Any.fromFunction0(getGotoPage), getPageNavigationType = js.Any.fromFunction0(getPageNavigationType), getValue = js.Any.fromFunction0(getValue), isCorrectAnswer = js.Any.fromFunction0(isCorrectAnswer))
    __obj.asInstanceOf[Choice]
  }
  @scala.inline
  implicit class ChoiceOps[Self <: Choice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetGotoPage(value: () => PageBreakItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGotoPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPageNavigationType(value: () => PageNavigationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageNavigationType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCorrectAnswer(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCorrectAnswer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

