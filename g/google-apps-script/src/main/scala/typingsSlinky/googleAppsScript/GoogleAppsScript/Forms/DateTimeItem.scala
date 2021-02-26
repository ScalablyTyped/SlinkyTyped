package typingsSlinky.googleAppsScript.GoogleAppsScript.Forms

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item that allows the respondent to indicate a date and time. Items can be accessed or
  * created from a Form. When used in a quiz, these items are graded.
  *
  *     // Open a form by ID and add a new date-time item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addDateTimeItem();
  *     item.setTitle('When do you want to meet?');
  */
@js.native
trait DateTimeItem extends StObject {
  
  def createResponse(response: Date): ItemResponse = js.native
  
  def duplicate(): DateTimeItem = js.native
  
  def getGeneralFeedback(): QuizFeedback = js.native
  
  def getHelpText(): String = js.native
  
  def getId(): Integer = js.native
  
  def getIndex(): Integer = js.native
  
  def getPoints(): Integer = js.native
  
  def getTitle(): String = js.native
  
  def getType(): ItemType = js.native
  
  def includesYear(): Boolean = js.native
  
  def isRequired(): Boolean = js.native
  
  def setGeneralFeedback(feedback: QuizFeedback): DateTimeItem = js.native
  
  def setHelpText(text: String): DateTimeItem = js.native
  
  def setIncludesYear(enableYear: Boolean): DateTimeItem = js.native
  
  def setPoints(points: Integer): DateTimeItem = js.native
  
  def setRequired(enabled: Boolean): DateTimeItem = js.native
  
  def setTitle(title: String): DateTimeItem = js.native
}
object DateTimeItem {
  
  @scala.inline
  def apply(
    createResponse: Date => ItemResponse,
    duplicate: () => DateTimeItem,
    getGeneralFeedback: () => QuizFeedback,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getPoints: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    includesYear: () => Boolean,
    isRequired: () => Boolean,
    setGeneralFeedback: QuizFeedback => DateTimeItem,
    setHelpText: String => DateTimeItem,
    setIncludesYear: Boolean => DateTimeItem,
    setPoints: Integer => DateTimeItem,
    setRequired: Boolean => DateTimeItem,
    setTitle: String => DateTimeItem
  ): DateTimeItem = {
    val __obj = js.Dynamic.literal(createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getGeneralFeedback = js.Any.fromFunction0(getGeneralFeedback), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getPoints = js.Any.fromFunction0(getPoints), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), includesYear = js.Any.fromFunction0(includesYear), isRequired = js.Any.fromFunction0(isRequired), setGeneralFeedback = js.Any.fromFunction1(setGeneralFeedback), setHelpText = js.Any.fromFunction1(setHelpText), setIncludesYear = js.Any.fromFunction1(setIncludesYear), setPoints = js.Any.fromFunction1(setPoints), setRequired = js.Any.fromFunction1(setRequired), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[DateTimeItem]
  }
  
  @scala.inline
  implicit class DateTimeItemMutableBuilder[Self <: DateTimeItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateResponse(value: Date => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuplicate(value: () => DateTimeItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGeneralFeedback(value: () => QuizFeedback): Self = StObject.set(x, "getGeneralFeedback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPoints(value: () => Integer): Self = StObject.set(x, "getPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncludesYear(value: () => Boolean): Self = StObject.set(x, "includesYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetGeneralFeedback(value: QuizFeedback => DateTimeItem): Self = StObject.set(x, "setGeneralFeedback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => DateTimeItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIncludesYear(value: Boolean => DateTimeItem): Self = StObject.set(x, "setIncludesYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPoints(value: Integer => DateTimeItem): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequired(value: Boolean => DateTimeItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => DateTimeItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
