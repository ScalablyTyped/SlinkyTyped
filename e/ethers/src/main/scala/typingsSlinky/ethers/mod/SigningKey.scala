package typingsSlinky.ethers.mod

import typingsSlinky.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "SigningKey")
@js.native
class SigningKey protected ()
  extends typingsSlinky.ethers.ethersMod.SigningKey {
  def this(privateKey: Arrayish) = this()
  def this(privateKey: typingsSlinky.ethers.typesMod.HDNode) = this()
}

