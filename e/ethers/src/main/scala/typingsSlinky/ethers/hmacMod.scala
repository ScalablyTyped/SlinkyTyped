package typingsSlinky.ethers

import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.SupportedAlgorithms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/hmac", JSImport.Namespace)
@js.native
object hmacMod extends js.Object {
  def computeHmac(algorithm: SupportedAlgorithms, key: Arrayish, data: Arrayish): js.typedarray.Uint8Array = js.native
}

