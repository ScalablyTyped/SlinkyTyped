package typingsSlinky.karma.mod

import typingsSlinky.karma.anon.Pattern
import typingsSlinky.karma.karmaStrings.DEBUG
import typingsSlinky.karma.karmaStrings.ERROR
import typingsSlinky.karma.karmaStrings.INFO
import typingsSlinky.karma.karmaStrings.LOG
import typingsSlinky.karma.karmaStrings.OFF
import typingsSlinky.karma.karmaStrings.WARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constants {
  
  @JSImport("karma", "constants.COLOR_PATTERN")
  @js.native
  val COLOR_PATTERN: String = js.native
  
  object CONSOLE_APPENDER {
    
    @JSImport("karma", "constants.CONSOLE_APPENDER")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("karma", "constants.CONSOLE_APPENDER.layout")
    @js.native
    def layout: Pattern = js.native
    @scala.inline
    def layout_=(x: Pattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layout")(x.asInstanceOf[js.Any])
    
    @JSImport("karma", "constants.CONSOLE_APPENDER.type")
    @js.native
    val `type`: String = js.native
  }
  
  @JSImport("karma", "constants.DEFAULT_HOSTNAME")
  @js.native
  val DEFAULT_HOSTNAME: String = js.native
  
  @JSImport("karma", "constants.DEFAULT_LISTEN_ADDR")
  @js.native
  val DEFAULT_LISTEN_ADDR: String = js.native
  
  @JSImport("karma", "constants.DEFAULT_PORT")
  @js.native
  val DEFAULT_PORT: String | Double = js.native
  
  @JSImport("karma", "constants.EXIT_CODE")
  @js.native
  val EXIT_CODE: String = js.native
  
  @JSImport("karma", "constants.LOG_DEBUG")
  @js.native
  val LOG_DEBUG: DEBUG = js.native
  
  @JSImport("karma", "constants.LOG_DISABLE")
  @js.native
  val LOG_DISABLE: OFF = js.native
  
  @JSImport("karma", "constants.LOG_ERROR")
  @js.native
  val LOG_ERROR: ERROR = js.native
  
  @JSImport("karma", "constants.LOG_INFO")
  @js.native
  val LOG_INFO: INFO = js.native
  
  @JSImport("karma", "constants.LOG_LOG")
  @js.native
  val LOG_LOG: LOG = js.native
  
  @JSImport("karma", "constants.LOG_PRIORITIES")
  @js.native
  val LOG_PRIORITIES: js.Tuple6[OFF, ERROR, WARN, LOG, INFO, DEBUG] = js.native
  
  @JSImport("karma", "constants.LOG_WARN")
  @js.native
  val LOG_WARN: WARN = js.native
  
  @JSImport("karma", "constants.NO_COLOR_PATTERN")
  @js.native
  val NO_COLOR_PATTERN: String = js.native
  
  @JSImport("karma", "constants.VERSION")
  @js.native
  val VERSION: String = js.native
}
