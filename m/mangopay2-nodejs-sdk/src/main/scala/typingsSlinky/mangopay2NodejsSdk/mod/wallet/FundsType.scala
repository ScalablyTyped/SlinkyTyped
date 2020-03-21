package typingsSlinky.mangopay2NodejsSdk.mod.wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT
*/
trait FundsType extends js.Object

object FundsType {
  @scala.inline
  def CREDIT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREDIT = this.cast("CREDIT")
  @scala.inline
  def DEFAULT: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DEFAULT = this.cast("DEFAULT")
  @scala.inline
  def FEES: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FEES = this.cast("FEES")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

