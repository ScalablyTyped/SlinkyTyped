package typingsSlinky.jestConsole

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ConsoleBuffer = js.Array[LogEntry]
  
  type LogCounters = StringDictionary[Double]
  
  @js.native
  trait LogEntry extends StObject {
    
    var message: LogMessage = js.native
    
    var origin: String = js.native
    
    var `type`: LogType = js.native
  }
  object LogEntry {
    
    @scala.inline
    def apply(message: LogMessage, origin: String, `type`: LogType): LogEntry = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEntry]
    }
    
    @scala.inline
    implicit class LogEntryMutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: LogMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: LogType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type LogMessage = String
  
  type LogTimers = StringDictionary[js.Date]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jestConsole.jestConsoleStrings.assert
    - typingsSlinky.jestConsole.jestConsoleStrings.count
    - typingsSlinky.jestConsole.jestConsoleStrings.debug
    - typingsSlinky.jestConsole.jestConsoleStrings.dir
    - typingsSlinky.jestConsole.jestConsoleStrings.dirxml
    - typingsSlinky.jestConsole.jestConsoleStrings.error
    - typingsSlinky.jestConsole.jestConsoleStrings.group
    - typingsSlinky.jestConsole.jestConsoleStrings.groupCollapsed
    - typingsSlinky.jestConsole.jestConsoleStrings.info
    - typingsSlinky.jestConsole.jestConsoleStrings.log
    - typingsSlinky.jestConsole.jestConsoleStrings.time
    - typingsSlinky.jestConsole.jestConsoleStrings.warn
  */
  trait LogType extends StObject
  object LogType {
    
    @scala.inline
    def assert: typingsSlinky.jestConsole.jestConsoleStrings.assert = "assert".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.assert]
    
    @scala.inline
    def count: typingsSlinky.jestConsole.jestConsoleStrings.count = "count".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.count]
    
    @scala.inline
    def debug: typingsSlinky.jestConsole.jestConsoleStrings.debug = "debug".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.debug]
    
    @scala.inline
    def dir: typingsSlinky.jestConsole.jestConsoleStrings.dir = "dir".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.dir]
    
    @scala.inline
    def dirxml: typingsSlinky.jestConsole.jestConsoleStrings.dirxml = "dirxml".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.dirxml]
    
    @scala.inline
    def error: typingsSlinky.jestConsole.jestConsoleStrings.error = "error".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.error]
    
    @scala.inline
    def group: typingsSlinky.jestConsole.jestConsoleStrings.group = "group".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.group]
    
    @scala.inline
    def groupCollapsed: typingsSlinky.jestConsole.jestConsoleStrings.groupCollapsed = "groupCollapsed".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.groupCollapsed]
    
    @scala.inline
    def info: typingsSlinky.jestConsole.jestConsoleStrings.info = "info".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.info]
    
    @scala.inline
    def log: typingsSlinky.jestConsole.jestConsoleStrings.log = "log".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.log]
    
    @scala.inline
    def time: typingsSlinky.jestConsole.jestConsoleStrings.time = "time".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.time]
    
    @scala.inline
    def warn: typingsSlinky.jestConsole.jestConsoleStrings.warn = "warn".asInstanceOf[typingsSlinky.jestConsole.jestConsoleStrings.warn]
  }
}
