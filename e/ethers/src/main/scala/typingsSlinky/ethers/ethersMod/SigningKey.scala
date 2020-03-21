package typingsSlinky.ethers.ethersMod

import typingsSlinky.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "SigningKey")
@js.native
class SigningKey protected ()
  extends typingsSlinky.ethers.walletMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typingsSlinky.ethers.typesMod.HDNode) = this()
}

