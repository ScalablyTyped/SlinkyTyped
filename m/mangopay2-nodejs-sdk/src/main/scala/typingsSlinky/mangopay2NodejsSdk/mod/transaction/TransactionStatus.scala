package typingsSlinky.mangopay2NodejsSdk.mod.transaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED
*/
trait TransactionStatus extends js.Object

object TransactionStatus {
  @scala.inline
  def CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = this.cast("CREATED")
  @scala.inline
  def FAILED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def SUCCEEDED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SUCCEEDED = this.cast("SUCCEEDED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

