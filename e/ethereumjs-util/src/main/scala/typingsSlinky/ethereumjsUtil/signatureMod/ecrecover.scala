package typingsSlinky.ethereumjsUtil.signatureMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-util/dist/signature", "ecrecover")
@js.native
object ecrecover extends js.Object {
  
  def apply(msgHash: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  def apply(msgHash: Buffer, v: Double, r: Buffer, s: Buffer, chainId: Double): Buffer = js.native
}
