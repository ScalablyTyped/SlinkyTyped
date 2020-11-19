package typingsSlinky.ethSigUtil.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eth-sig-util", "personalSign")
@js.native
object personalSign extends js.Object {
  
  def apply(privateKey: Buffer, message: MessageData[_]): String = js.native
}
