package typingsSlinky.expressRequestsLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type StatusCodeMap = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.trace | typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.debug | typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.info | typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.warn | typingsSlinky.expressRequestsLogger.expressRequestsLoggerStrings.error
  ]
}
