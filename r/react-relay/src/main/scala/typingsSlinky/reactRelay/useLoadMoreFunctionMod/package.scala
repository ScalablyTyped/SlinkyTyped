package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useLoadMoreFunctionMod {
  
  type LoadMoreFn = js.Function2[
    /* count */ scala.Double, 
    /* options */ js.UndefOr[typingsSlinky.reactRelay.anon.OnComplete], 
    typingsSlinky.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
}
