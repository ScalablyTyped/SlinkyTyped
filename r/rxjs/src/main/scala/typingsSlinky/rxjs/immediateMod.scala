package typingsSlinky.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/util/Immediate", JSImport.Namespace)
@js.native
object immediateMod extends js.Object {
  
  @js.native
  object Immediate extends js.Object {
    
    def clearImmediate(handle: Double): Unit = js.native
    
    def setImmediate(cb: js.Function0[Unit]): Double = js.native
  }
  
  @js.native
  object TestTools extends js.Object {
    
    def pending(): Double = js.native
  }
}
