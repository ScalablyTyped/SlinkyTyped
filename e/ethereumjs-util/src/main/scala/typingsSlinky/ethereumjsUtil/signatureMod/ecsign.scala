package typingsSlinky.ethereumjsUtil.signatureMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-util/dist/signature", "ecsign")
@js.native
object ecsign extends js.Object {
  
  def apply(msgHash: Buffer, privateKey: Buffer): ECDSASignature = js.native
  def apply(msgHash: Buffer, privateKey: Buffer, chainId: Double): ECDSASignature = js.native
}
