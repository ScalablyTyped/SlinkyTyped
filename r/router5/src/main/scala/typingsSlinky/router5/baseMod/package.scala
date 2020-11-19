package typingsSlinky.router5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object baseMod {
  
  type CancelFn = js.Function0[scala.Unit]
  
  type DoneFn = js.Function2[
    /* err */ js.UndefOr[js.Any], 
    /* state */ js.UndefOr[typingsSlinky.router5.baseMod.State], 
    scala.Unit
  ]
  
  type Params = typingsSlinky.std.Record[java.lang.String, js.Any]
  
  type Unsubscribe = js.Function0[scala.Unit]
}
