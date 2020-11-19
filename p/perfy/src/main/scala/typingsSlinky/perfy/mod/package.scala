package typingsSlinky.perfy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncOperationFn = js.Function1[/* done */ js.Function0[typingsSlinky.perfy.mod.PerfyResult], scala.Unit]
  
  type SyncOperationFn = js.Function0[typingsSlinky.perfy.mod.PerfyResult]
}
