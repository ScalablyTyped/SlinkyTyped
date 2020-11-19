package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The bean implementation of a Feedback, which contains properties common to all feedback, such as
  * display text or links.
  *
  * Feedback can be added to gradeable Form items.
  *
  *     // Setting feedback which should be automatically shown when a user responds to a question
  *     // incorrectly.
  *     var textItem = form.addTextItem().setTitle('Re-hydrating dried fruit is an example of what?');
  *     var feedback = FormApp.createFeedback()
  *       .setDisplayText(
  *           “Good answer, but not quite right.  Please review chapter 4 before next time.”)
  *       .addLink("http://wikipedia.com/osmosis");
  *     textItem.setFeedbackForIncorrect(feedback);
  */
@js.native
trait QuizFeedback extends js.Object {
  
  def getLinkUrls(): js.Array[String] = js.native
  
  def getText(): String = js.native
}
object QuizFeedback {
  
  @scala.inline
  def apply(getLinkUrls: () => js.Array[String], getText: () => String): QuizFeedback = {
    val __obj = js.Dynamic.literal(getLinkUrls = js.Any.fromFunction0(getLinkUrls), getText = js.Any.fromFunction0(getText))
    __obj.asInstanceOf[QuizFeedback]
  }
  
  @scala.inline
  implicit class QuizFeedbackOps[Self <: QuizFeedback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetLinkUrls(value: () => js.Array[String]): Self = this.set("getLinkUrls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
  }
}
