package typingsSlinky.algoliaLoggerCommon

import typingsSlinky.algoliaLoggerCommon.anon.ReadonlyPromisevoid
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/logger-common", "LogLevelEnum")
  @js.native
  val LogLevelEnum: Record[String, LogLevelType] = js.native
  
  @JSImport("@algolia/logger-common", "createNullLogger")
  @js.native
  def createNullLogger(): Logger = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`1`
    - typingsSlinky.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`2`
    - typingsSlinky.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`3`
  */
  trait LogLevelType extends StObject
  object LogLevelType {
    
    @scala.inline
    def `1`: typingsSlinky.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`1` = 1.asInstanceOf[typingsSlinky.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`2` = 2.asInstanceOf[typingsSlinky.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`3` = 3.asInstanceOf[typingsSlinky.algoliaLoggerCommon.algoliaLoggerCommonNumbers.`3`]
  }
  
  @js.native
  trait Logger extends StObject {
    
    /**
      * Logs debug messages.
      */
    def debug(message: String): ReadonlyPromisevoid = js.native
    def debug(message: String, args: js.Any): ReadonlyPromisevoid = js.native
    
    /**
      * Logs error messages.
      */
    def error(message: String): ReadonlyPromisevoid = js.native
    def error(message: String, args: js.Any): ReadonlyPromisevoid = js.native
    
    /**
      * Logs info messages.
      */
    def info(message: String): ReadonlyPromisevoid = js.native
    def info(message: String, args: js.Any): ReadonlyPromisevoid = js.native
  }
}
