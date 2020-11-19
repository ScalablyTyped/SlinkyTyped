package typingsSlinky.nodeForge.mod.tls

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PRFAlgorithm extends js.Object
@JSImport("node-forge", "tls.PRFAlgorithm")
@js.native
object PRFAlgorithm extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PRFAlgorithm with Double] = js.native
  
  @js.native
  sealed trait tls_prf_sha256 extends PRFAlgorithm
  /* 0 */ @js.native
  object tls_prf_sha256 extends TopLevel[tls_prf_sha256 with Double]
}
