package typingsSlinky.mangopay2NodejsSdk.mod.kycDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
*/
trait DocumentStatus extends js.Object

object DocumentStatus {
  @scala.inline
  def CREATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED = this.cast("CREATED")
  @scala.inline
  def REFUSED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED = this.cast("REFUSED")
  @scala.inline
  def VALIDATED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED = this.cast("VALIDATED")
  @scala.inline
  def VALIDATION_ASKED: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED = this.cast("VALIDATION_ASKED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

