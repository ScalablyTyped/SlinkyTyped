package typingsSlinky.reduxLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActionToString = js.Function1[/* action */ js.Any, java.lang.String]
  
  type ErrorToString = js.Function2[/* error */ js.Any, /* prevState */ js.Any, java.lang.String]
  
  type LoggerPredicate = js.Function3[
    /* getState */ js.Function0[js.Any], 
    /* action */ js.Any, 
    /* logEntry */ js.UndefOr[typingsSlinky.reduxLogger.mod.LogEntryObject], 
    scala.Boolean
  ]
  
  type StateToString = js.Function1[/* state */ js.Any, java.lang.String]
}
