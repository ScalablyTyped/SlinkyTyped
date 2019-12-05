package typingsSlinky.ethers.ethersMod

import typingsSlinky.ethers.distTypesUtilsTypesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "SigningKey")
@js.native
class SigningKey protected ()
  extends typingsSlinky.ethers.distTypesEthersMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typingsSlinky.ethers.distTypesUtilsTypesMod.HDNode) = this()
}

