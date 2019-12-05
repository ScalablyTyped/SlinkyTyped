package typingsSlinky.ethers.distTypesEthersMod

import typingsSlinky.ethers.distTypesUtilsTypesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "SigningKey")
@js.native
class SigningKey protected ()
  extends typingsSlinky.ethers.distTypesWalletMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typingsSlinky.ethers.distTypesUtilsTypesMod.HDNode) = this()
}

