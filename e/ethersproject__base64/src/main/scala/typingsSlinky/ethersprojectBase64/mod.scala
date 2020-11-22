package typingsSlinky.ethersprojectBase64

import typingsSlinky.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/base64", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(textData: String): js.typedarray.Uint8Array = js.native
  
  def encode(data: BytesLike): String = js.native
}
