package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Date. For documentation of this class, see java.sql.Date
  * .
  */
@js.native
trait JdbcDate extends StObject {
  
  def after(when: JdbcDate): Boolean = js.native
  
  def before(when: JdbcDate): Boolean = js.native
  
  def getDate(): Integer = js.native
  
  def getMonth(): Integer = js.native
  
  def getTime(): Integer = js.native
  
  def getYear(): Integer = js.native
  
  def setDate(date: Integer): Unit = js.native
  
  def setMonth(month: Integer): Unit = js.native
  
  def setTime(milliseconds: Integer): Unit = js.native
  
  def setYear(year: Integer): Unit = js.native
}
object JdbcDate {
  
  @scala.inline
  def apply(
    after: JdbcDate => Boolean,
    before: JdbcDate => Boolean,
    getDate: () => Integer,
    getMonth: () => Integer,
    getTime: () => Integer,
    getYear: () => Integer,
    setDate: Integer => Unit,
    setMonth: Integer => Unit,
    setTime: Integer => Unit,
    setYear: Integer => Unit
  ): JdbcDate = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = js.Any.fromFunction0(getDate), getMonth = js.Any.fromFunction0(getMonth), getTime = js.Any.fromFunction0(getTime), getYear = js.Any.fromFunction0(getYear), setDate = js.Any.fromFunction1(setDate), setMonth = js.Any.fromFunction1(setMonth), setTime = js.Any.fromFunction1(setTime), setYear = js.Any.fromFunction1(setYear))
    __obj.asInstanceOf[JdbcDate]
  }
  
  @scala.inline
  implicit class JdbcDateMutableBuilder[Self <: JdbcDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: JdbcDate => Boolean): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBefore(value: JdbcDate => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDate(value: () => Integer): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMonth(value: () => Integer): Self = StObject.set(x, "getMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTime(value: () => Integer): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetYear(value: () => Integer): Self = StObject.set(x, "getYear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDate(value: Integer => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonth(value: Integer => Unit): Self = StObject.set(x, "setMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTime(value: Integer => Unit): Self = StObject.set(x, "setTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYear(value: Integer => Unit): Self = StObject.set(x, "setYear", js.Any.fromFunction1(value))
  }
}
