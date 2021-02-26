package typingsSlinky.builderUtil

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.debug.mod.Debugger
import typingsSlinky.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  @JSImport("builder-util/out/log", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(stream: WritableStream) = this()
    
    var _doLog: js.Any = js.native
    
    def debug(fields: Null, message: String): Unit = js.native
    def debug(fields: Fields, message: String): Unit = js.native
    
    var doLog: js.Any = js.native
    
    def error(): Unit = js.native
    def error(messageOrFields: String): Unit = js.native
    def error(messageOrFields: String, message: String): Unit = js.native
    def error(messageOrFields: Null, message: String): Unit = js.native
    def error(messageOrFields: Fields): Unit = js.native
    def error(messageOrFields: Fields, message: String): Unit = js.native
    
    def filePath(file: String): String = js.native
    
    def info(): Unit = js.native
    def info(messageOrFields: String): Unit = js.native
    def info(messageOrFields: String, message: String): Unit = js.native
    def info(messageOrFields: Null, message: String): Unit = js.native
    def info(messageOrFields: Fields): Unit = js.native
    def info(messageOrFields: Fields, message: String): Unit = js.native
    
    def isDebugEnabled: Boolean = js.native
    
    def log(message: String): Unit = js.native
    
    def messageTransformer(message: String, level: LogLevel): String = js.native
    
    val stream: WritableStream = js.native
    
    def warn(): Unit = js.native
    def warn(messageOrFields: String): Unit = js.native
    def warn(messageOrFields: String, message: String): Unit = js.native
    def warn(messageOrFields: Null, message: String): Unit = js.native
    def warn(messageOrFields: Fields): Unit = js.native
    def warn(messageOrFields: Fields, message: String): Unit = js.native
  }
  /* static members */
  object Logger {
    
    @JSImport("builder-util/out/log", "Logger.createMessage")
    @js.native
    def createMessage(message: String, fields: Null, level: LogLevel, color: js.Function1[/* it */ String, String]): String = js.native
    @JSImport("builder-util/out/log", "Logger.createMessage")
    @js.native
    def createMessage(
      message: String,
      fields: Null,
      level: LogLevel,
      color: js.Function1[/* it */ String, String],
      messagePadding: Double
    ): String = js.native
    @JSImport("builder-util/out/log", "Logger.createMessage")
    @js.native
    def createMessage(message: String, fields: Fields, level: LogLevel, color: js.Function1[/* it */ String, String]): String = js.native
    @JSImport("builder-util/out/log", "Logger.createMessage")
    @js.native
    def createMessage(
      message: String,
      fields: Fields,
      level: LogLevel,
      color: js.Function1[/* it */ String, String],
      messagePadding: Double
    ): String = js.native
  }
  
  @JSImport("builder-util/out/log", "PADDING")
  @js.native
  val PADDING: /* 2 */ Double = js.native
  
  @JSImport("builder-util/out/log", "debug")
  @js.native
  val debug: Debugger = js.native
  
  @JSImport("builder-util/out/log", "log")
  @js.native
  val log: Logger = js.native
  
  @JSImport("builder-util/out/log", "setPrinter")
  @js.native
  def setPrinter(): Unit = js.native
  @JSImport("builder-util/out/log", "setPrinter")
  @js.native
  def setPrinter(value: js.Function1[/* message */ String, Unit]): Unit = js.native
  
  type Fields = StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.builderUtil.builderUtilStrings.info
    - typingsSlinky.builderUtil.builderUtilStrings.warn
    - typingsSlinky.builderUtil.builderUtilStrings.debug
    - typingsSlinky.builderUtil.builderUtilStrings.notice
    - typingsSlinky.builderUtil.builderUtilStrings.error
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def debug: typingsSlinky.builderUtil.builderUtilStrings.debug = "debug".asInstanceOf[typingsSlinky.builderUtil.builderUtilStrings.debug]
    
    @scala.inline
    def error: typingsSlinky.builderUtil.builderUtilStrings.error = "error".asInstanceOf[typingsSlinky.builderUtil.builderUtilStrings.error]
    
    @scala.inline
    def info: typingsSlinky.builderUtil.builderUtilStrings.info = "info".asInstanceOf[typingsSlinky.builderUtil.builderUtilStrings.info]
    
    @scala.inline
    def notice: typingsSlinky.builderUtil.builderUtilStrings.notice = "notice".asInstanceOf[typingsSlinky.builderUtil.builderUtilStrings.notice]
    
    @scala.inline
    def warn: typingsSlinky.builderUtil.builderUtilStrings.warn = "warn".asInstanceOf[typingsSlinky.builderUtil.builderUtilStrings.warn]
  }
}
