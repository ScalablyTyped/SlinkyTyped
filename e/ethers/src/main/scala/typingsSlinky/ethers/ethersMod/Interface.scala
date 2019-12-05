package typingsSlinky.ethers.ethersMod

import typingsSlinky.ethers.distTypesUtilsTypesMod.ParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "Interface")
@js.native
class Interface protected ()
  extends typingsSlinky.ethers.distTypesEthersMod.Interface {
  def this(abi: String) = this()
  def this(abi: js.Array[String | ParamType]) = this()
}

