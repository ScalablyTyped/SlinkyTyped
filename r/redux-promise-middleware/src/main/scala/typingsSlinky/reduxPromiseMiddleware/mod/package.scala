package typingsSlinky.reduxPromiseMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Action payload types
  type AsyncFunction = js.Function0[js.Promise[js.Any]]
  
  type AsyncPayload = js.Promise[js.Any] | typingsSlinky.reduxPromiseMiddleware.mod.AsyncFunction | typingsSlinky.reduxPromiseMiddleware.anon.Data
  
  type FulfilledActionType = typingsSlinky.reduxPromiseMiddleware.mod.ActionType.Fulfilled | java.lang.String
  
  // Action type types
  type PendingActionType = typingsSlinky.reduxPromiseMiddleware.mod.ActionType.Pending | java.lang.String
  
  type RejectedActionType = typingsSlinky.reduxPromiseMiddleware.mod.ActionType.Rejected | java.lang.String
}
