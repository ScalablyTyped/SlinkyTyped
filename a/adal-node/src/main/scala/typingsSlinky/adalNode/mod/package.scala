package typingsSlinky.adalNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AcquireTokenCallback = js.Function2[
    /* error */ js.Error, 
    /* response */ typingsSlinky.adalNode.mod.TokenResponse | typingsSlinky.adalNode.mod.ErrorResponse, 
    scala.Unit
  ]
  
  type AcquireUserCodeCallback = js.Function2[
    /* error */ js.Error, 
    /* response */ typingsSlinky.adalNode.mod.UserCodeInfo, 
    scala.Unit
  ]
  
  /**
    * @callback LoggingCallback
    * @memberOf Logging
    * @param {LoggingLevel} level The level of this log entry.
    * @param {string} message The text content of the log entry.
    * @param {Error}  [error] An Error object if this is an {@link Logging.LOGGING_LEVEL.ERROR|ERROR} level log entry.
    */
  type LoggingCallback = js.Function3[
    /* level */ typingsSlinky.adalNode.mod.LoggingLevel, 
    /* message */ java.lang.String, 
    /* error */ js.UndefOr[js.Error], 
    scala.Unit
  ]
}
