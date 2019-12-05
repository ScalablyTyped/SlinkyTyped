package typingsSlinky.nodeDashForge.nodeDashForgeMod.tls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BulkCipherAlgorithm extends js.Object

@JSImport("node-forge", "tls.BulkCipherAlgorithm")
@js.native
object BulkCipherAlgorithm extends js.Object {
  @js.native
  sealed trait aes extends BulkCipherAlgorithm
  
  @js.native
  sealed trait des3 extends BulkCipherAlgorithm
  
  @js.native
  sealed trait rc4 extends BulkCipherAlgorithm
  
  /* 2 */ val aes: typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.BulkCipherAlgorithm.aes with Double = js.native
  /* 1 */ val des3: typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.BulkCipherAlgorithm.des3 with Double = js.native
  /* 0 */ val rc4: typingsSlinky.nodeDashForge.nodeDashForgeMod.tls.BulkCipherAlgorithm.rc4 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BulkCipherAlgorithm with Double] = js.native
}

