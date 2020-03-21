package typingsSlinky.mangopay2NodejsSdk.mod.transaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  def PAYIN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYIN = this.cast("PAYIN")
  @scala.inline
  def PAYOUT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT = this.cast("PAYOUT")
  @scala.inline
  def TRANSFER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER = this.cast("TRANSFER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

