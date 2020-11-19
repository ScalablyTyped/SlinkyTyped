package typingsSlinky.loglevel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LoggingMethod = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type MethodFactory = js.Function3[
    /* methodName */ java.lang.String, 
    /* level */ typingsSlinky.loglevel.mod.LogLevelNumbers, 
    /* loggerName */ java.lang.String, 
    typingsSlinky.loglevel.mod.LoggingMethod
  ]
}
