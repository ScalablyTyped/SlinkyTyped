package typingsSlinky.log4javascript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("log4javascript", "LoggingEvent")
@js.native
class LoggingEvent protected () extends js.Object {
  def this(logger: Logger, timeStamp: js.Date, level: Level, messages: js.Array[String]) = this()
  def this(logger: Logger, timeStamp: js.Date, level: Level, messages: js.Array[String], exception: js.Error) = this()
  
  var exception: js.Error = js.native
  
  def getCombinedMessages(): String = js.native
  
  def getThrowableStrRep(): String = js.native
  
  var level: Level = js.native
  
  var logger: Logger = js.native
  
  var messages: js.Array[_] = js.native
  
  var milliseconds: Double = js.native
  
  var timeStamp: js.Date = js.native
  
  var timeStampInMilliseconds: Double = js.native
  
  var timeStampInSeconds: Double = js.native
}
