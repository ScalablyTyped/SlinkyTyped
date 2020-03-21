package typingsSlinky.ethers.ethersMod

import typingsSlinky.ethers.typesMod.MinimalProvider
import typingsSlinky.ethers.typesMod.ParamType
import typingsSlinky.ethers.typesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "Contract")
@js.native
class Contract protected ()
  extends typingsSlinky.ethers.contractsMod.Contract {
  def this(addressOrName: String, contractInterface: String, signerOrProvider: MinimalProvider) = this()
  def this(addressOrName: String, contractInterface: String, signerOrProvider: Signer) = this()
  def this(
    addressOrName: String,
    contractInterface: js.Array[String | ParamType],
    signerOrProvider: MinimalProvider
  ) = this()
  def this(addressOrName: String, contractInterface: js.Array[String | ParamType], signerOrProvider: Signer) = this()
  def this(
    addressOrName: String,
    contractInterface: typingsSlinky.ethers.interfaceMod.Interface,
    signerOrProvider: MinimalProvider
  ) = this()
  def this(
    addressOrName: String,
    contractInterface: typingsSlinky.ethers.interfaceMod.Interface,
    signerOrProvider: Signer
  ) = this()
}

