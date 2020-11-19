package typingsSlinky.chaiSpies.ChaiSpies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpyFunc2Proxy[A1, A2, R]
  extends SpyFunc2[A1, A2, R]
     with Resetable {
  
  /* InferMemberOverrides */
  override def apply(T0: A1, T1: A2): R = js.native
}
