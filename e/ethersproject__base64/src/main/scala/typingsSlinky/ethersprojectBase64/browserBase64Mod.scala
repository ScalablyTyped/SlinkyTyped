package typingsSlinky.ethersprojectBase64

import typingsSlinky.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserBase64Mod {
  
  @JSImport("@ethersproject/base64/lib/browser-base64", "decode")
  @js.native
  def decode(textData: String): js.typedarray.Uint8Array = js.native
  
  @JSImport("@ethersproject/base64/lib/browser-base64", "encode")
  @js.native
  def encode(data: BytesLike): String = js.native
}
