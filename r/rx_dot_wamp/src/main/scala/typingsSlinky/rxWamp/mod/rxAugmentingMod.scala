package typingsSlinky.rxWamp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("rx", JSImport.Namespace)
@js.native
object rxAugmentingMod extends js.Object {
  
  // Patch ObservableStatic to contain observableWamp methods.
  type ObservableStatic = IObservableWampStatic
}
