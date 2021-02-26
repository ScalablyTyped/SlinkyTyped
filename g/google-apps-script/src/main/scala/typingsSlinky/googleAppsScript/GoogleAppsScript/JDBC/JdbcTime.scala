package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Time. For documentation of this class, see java.sql.Time
  * .
  */
@js.native
trait JdbcTime extends StObject {
  
  def after(when: JdbcTime): Boolean = js.native
  
  def before(when: JdbcTime): Boolean = js.native
  
  def getHours(): Integer = js.native
  
  def getMinutes(): Integer = js.native
  
  def getSeconds(): Integer = js.native
  
  def getTime(): Integer = js.native
  
  def setHours(hours: Integer): Unit = js.native
  
  def setMinutes(minutes: Integer): Unit = js.native
  
  def setSeconds(seconds: Integer): Unit = js.native
  
  def setTime(milliseconds: Integer): Unit = js.native
}
object JdbcTime {
  
  @scala.inline
  def apply(
    after: JdbcTime => Boolean,
    before: JdbcTime => Boolean,
    getHours: () => Integer,
    getMinutes: () => Integer,
    getSeconds: () => Integer,
    getTime: () => Integer,
    setHours: Integer => Unit,
    setMinutes: Integer => Unit,
    setSeconds: Integer => Unit,
    setTime: Integer => Unit
  ): JdbcTime = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getHours = js.Any.fromFunction0(getHours), getMinutes = js.Any.fromFunction0(getMinutes), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), setHours = js.Any.fromFunction1(setHours), setMinutes = js.Any.fromFunction1(setMinutes), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime))
    __obj.asInstanceOf[JdbcTime]
  }
  
  @scala.inline
  implicit class JdbcTimeMutableBuilder[Self <: JdbcTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: JdbcTime => Boolean): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBefore(value: JdbcTime => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHours(value: () => Integer): Self = StObject.set(x, "getHours", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinutes(value: () => Integer): Self = StObject.set(x, "getMinutes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSeconds(value: () => Integer): Self = StObject.set(x, "getSeconds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTime(value: () => Integer): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHours(value: Integer => Unit): Self = StObject.set(x, "setHours", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinutes(value: Integer => Unit): Self = StObject.set(x, "setMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSeconds(value: Integer => Unit): Self = StObject.set(x, "setSeconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTime(value: Integer => Unit): Self = StObject.set(x, "setTime", js.Any.fromFunction1(value))
  }
}
