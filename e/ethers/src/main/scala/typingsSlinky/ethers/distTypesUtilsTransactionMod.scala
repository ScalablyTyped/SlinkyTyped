package typingsSlinky.ethers

import typingsSlinky.ethers.distTypesUtilsTypesMod.Arrayish
import typingsSlinky.ethers.distTypesUtilsTypesMod.Signature
import typingsSlinky.ethers.distTypesUtilsTypesMod.Transaction
import typingsSlinky.ethers.distTypesUtilsTypesMod.UnsignedTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/transaction", JSImport.Namespace)
@js.native
object distTypesUtilsTransactionMod extends js.Object {
  def parse(rawTransaction: Arrayish): Transaction = js.native
  def serialize(transaction: UnsignedTransaction): String = js.native
  def serialize(transaction: UnsignedTransaction, signature: Arrayish): String = js.native
  def serialize(transaction: UnsignedTransaction, signature: Signature): String = js.native
}

