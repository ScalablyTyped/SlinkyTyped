package typingsSlinky.mangopay2NodejsSdk.mod.card

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID
  - typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID
*/
trait CardValidity extends js.Object

object CardValidity {
  @scala.inline
  def INVALID: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID = this.cast("INVALID")
  @scala.inline
  def UNKNOWN: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def VALID: typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID = this.cast("VALID")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

