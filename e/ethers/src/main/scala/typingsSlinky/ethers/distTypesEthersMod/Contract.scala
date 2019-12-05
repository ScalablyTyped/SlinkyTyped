package typingsSlinky.ethers.distTypesEthersMod

import typingsSlinky.ethers.distTypesUtilsTypesMod.MinimalProvider
import typingsSlinky.ethers.distTypesUtilsTypesMod.ParamType
import typingsSlinky.ethers.distTypesUtilsTypesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "Contract")
@js.native
class Contract protected ()
  extends typingsSlinky.ethers.distTypesContractsMod.Contract {
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
    contractInterface: typingsSlinky.ethers.distTypesContractsInterfaceMod.Interface,
    signerOrProvider: MinimalProvider
  ) = this()
  def this(
    addressOrName: String,
    contractInterface: typingsSlinky.ethers.distTypesContractsInterfaceMod.Interface,
    signerOrProvider: Signer
  ) = this()
}

