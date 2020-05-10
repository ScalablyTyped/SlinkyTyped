package typingsSlinky.ethers

import typingsSlinky.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/base64", JSImport.Namespace)
@js.native
object base64Mod extends js.Object {
  def decode(textData: String): js.typedarray.Uint8Array = js.native
  def encode(data: Arrayish): String = js.native
}

