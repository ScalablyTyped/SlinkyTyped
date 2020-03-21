package typingsSlinky.mangopay2NodejsSdk.mod.transaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT
*/
trait TransactionNature extends js.Object

object TransactionNature {
  @scala.inline
  def REFUND: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND = this.cast("REFUND")
  @scala.inline
  def REGULAR: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REGULAR = this.cast("REGULAR")
  @scala.inline
  def REPUDIATION: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION = this.cast("REPUDIATION")
  @scala.inline
  def SETTLEMENT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SETTLEMENT = this.cast("SETTLEMENT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

