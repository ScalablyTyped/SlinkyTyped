package typingsSlinky.bugsnag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ErrorHandler = js.Function4[
    /* err */ js.Error | js.Any, 
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ typingsSlinky.bugsnag.mod.NextFunction, 
    scala.Unit
  ]
  
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  
  type RequestHandler = js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ typingsSlinky.bugsnag.mod.NextFunction, 
    js.Any
  ]
}
