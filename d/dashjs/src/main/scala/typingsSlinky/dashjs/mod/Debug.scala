package typingsSlinky.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debug extends StObject {
  
  def getLogLevel(): LogLevel = js.native
  
  def getLogToBrowserConsole(): Boolean = js.native
  
  def getLogger(): Logger = js.native
  
  def setCalleeNameVisible(flag: Boolean): Unit = js.native
  
  def setLogLevel(level: LogLevel): Unit = js.native
  
  def setLogTimestampVisible(flag: Boolean): Unit = js.native
  
  def setLogToBrowserConsole(flag: Boolean): Unit = js.native
}
object Debug {
  
  @scala.inline
  def apply(
    getLogLevel: () => LogLevel,
    getLogToBrowserConsole: () => Boolean,
    getLogger: () => Logger,
    setCalleeNameVisible: Boolean => Unit,
    setLogLevel: LogLevel => Unit,
    setLogTimestampVisible: Boolean => Unit,
    setLogToBrowserConsole: Boolean => Unit
  ): Debug = {
    val __obj = js.Dynamic.literal(getLogLevel = js.Any.fromFunction0(getLogLevel), getLogToBrowserConsole = js.Any.fromFunction0(getLogToBrowserConsole), getLogger = js.Any.fromFunction0(getLogger), setCalleeNameVisible = js.Any.fromFunction1(setCalleeNameVisible), setLogLevel = js.Any.fromFunction1(setLogLevel), setLogTimestampVisible = js.Any.fromFunction1(setLogTimestampVisible), setLogToBrowserConsole = js.Any.fromFunction1(setLogToBrowserConsole))
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLogLevel(value: () => LogLevel): Self = StObject.set(x, "getLogLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLogToBrowserConsole(value: () => Boolean): Self = StObject.set(x, "getLogToBrowserConsole", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLogger(value: () => Logger): Self = StObject.set(x, "getLogger", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCalleeNameVisible(value: Boolean => Unit): Self = StObject.set(x, "setCalleeNameVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLogLevel(value: LogLevel => Unit): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLogTimestampVisible(value: Boolean => Unit): Self = StObject.set(x, "setLogTimestampVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLogToBrowserConsole(value: Boolean => Unit): Self = StObject.set(x, "setLogToBrowserConsole", js.Any.fromFunction1(value))
  }
}
