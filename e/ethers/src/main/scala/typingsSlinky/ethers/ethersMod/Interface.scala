package typingsSlinky.ethers.ethersMod

import typingsSlinky.ethers.typesMod.ParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "Interface")
@js.native
class Interface protected ()
  extends typingsSlinky.ethers.contractsMod.Interface {
  def this(abi: String) = this()
  def this(abi: js.Array[String | ParamType]) = this()
}

