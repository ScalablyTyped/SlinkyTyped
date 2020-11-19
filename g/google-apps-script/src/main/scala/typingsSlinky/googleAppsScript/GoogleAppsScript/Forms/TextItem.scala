package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearValidation(value: () => TextItem): Self = this.set("clearValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateResponse(value: String => ItemResponse): Self = this.set("createResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuplicate(value: () => TextItem): Self = this.set("duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGeneralFeedback(value: () => QuizFeedback): Self = this.set("getGeneralFeedback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = this.set("getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPoints(value: () => Integer): Self = this.set("getPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = this.set("isRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetGeneralFeedback(value: QuizFeedback => TextItem): Self = this.set("setGeneralFeedback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => TextItem): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPoints(value: Integer => TextItem): Self = this.set("setPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequired(value: Boolean => TextItem): Self = this.set("setRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => TextItem): Self = this.set("setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValidation(value: TextValidation => TextItem): Self = this.set("setValidation", js.Any.fromFunction1(value))
  }
}
