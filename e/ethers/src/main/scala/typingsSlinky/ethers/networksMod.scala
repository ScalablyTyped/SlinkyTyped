package typingsSlinky.ethers

import typingsSlinky.ethers.typesMod.Network
import typingsSlinky.ethers.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/networks", JSImport.Namespace)
@js.native
object networksMod extends js.Object {
  def getNetwork(network: Networkish): Network = js.native
}

