package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DO_NOTHING
  - typingsSlinky.awsSdk.awsSdkStrings.ROLLBACK
  - typingsSlinky.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
trait OnFailure extends js.Object

object OnFailure {
  @scala.inline
  def DO_NOTHING: typingsSlinky.awsSdk.awsSdkStrings.DO_NOTHING = "DO_NOTHING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DO_NOTHING]
  @scala.inline
  def ROLLBACK: typingsSlinky.awsSdk.awsSdkStrings.ROLLBACK = "ROLLBACK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ROLLBACK]
  @scala.inline
  def DELETE: typingsSlinky.awsSdk.awsSdkStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETE]
  @scala.inline
  implicit def apply(value: String): OnFailure = value.asInstanceOf[OnFailure]
}

