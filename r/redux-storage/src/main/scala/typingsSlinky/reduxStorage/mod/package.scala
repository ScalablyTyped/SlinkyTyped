package typingsSlinky.reduxStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ActionTypeCheckCallback = js.Function1[/* type */ java.lang.String, scala.Boolean]
  
  /**
    * Loader interface
    */
  type Loader[TState] = js.Function1[
    /* store */ typingsSlinky.redux.mod.Store[TState, typingsSlinky.redux.mod.AnyAction], 
    js.Thenable[js.Any]
  ]
  
  type StateMerger = js.Function2[/* oldState */ js.Any, /* newState */ js.Any, js.Any]
}
