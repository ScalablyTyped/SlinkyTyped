package typingsSlinky.firebaseLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object loggerMod {
  
  type LogCallback = js.Function1[
    /* callbackParams */ typingsSlinky.firebaseLogger.loggerMod.LogCallbackParams, 
    scala.Unit
  ]
  
  type LogHandler = js.Function3[
    /* loggerInstance */ typingsSlinky.firebaseLogger.loggerMod.Logger, 
    /* logType */ typingsSlinky.firebaseLogger.loggerMod.LogLevel, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
}
