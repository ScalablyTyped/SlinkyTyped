package typingsSlinky.mangopay2NodejsSdk.mod.bankAccount

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
*/
trait BankAccountType extends js.Object

object BankAccountType {
  @scala.inline
  def CA: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = this.cast("CA")
  @scala.inline
  def GB: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = this.cast("GB")
  @scala.inline
  def IBAN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN = this.cast("IBAN")
  @scala.inline
  def OTHER: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = this.cast("OTHER")
  @scala.inline
  def US: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

