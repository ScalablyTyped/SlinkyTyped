package typingsSlinky.ethers

import typingsSlinky.ethers.typesMod.Arrayish
import typingsSlinky.ethers.typesMod.Signature
import typingsSlinky.ethers.typesMod.Transaction
import typingsSlinky.ethers.typesMod.UnsignedTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/transaction", JSImport.Namespace)
@js.native
object transactionMod extends js.Object {
  def parse(rawTransaction: Arrayish): Transaction = js.native
  def serialize(transaction: UnsignedTransaction): String = js.native
  def serialize(transaction: UnsignedTransaction, signature: Arrayish): String = js.native
  def serialize(transaction: UnsignedTransaction, signature: Signature): String = js.native
}

