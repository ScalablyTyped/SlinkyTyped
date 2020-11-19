package typingsSlinky.ethSigUtil.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eth-sig-util", "signTypedData")
@js.native
object signTypedData extends js.Object {
  
  def apply(privateKey: Buffer, msgParams: MessageData[EIP712TypedData]): String = js.native
}
