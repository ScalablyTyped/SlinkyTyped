package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useLoadMoreFunctionMod {
  
  type LoadMoreFn[TQuery /* <: typingsSlinky.relayRuntime.relayRuntimeTypesMod.OperationType */] = js.Function2[
    /* count */ scala.Double, 
    /* options */ js.UndefOr[typingsSlinky.reactRelay.anon.OnComplete[TQuery]], 
    typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
}
