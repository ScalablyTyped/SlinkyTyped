package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_READY
  - typingsSlinky.awsSdk.awsSdkStrings.READY
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
trait TransformStatusType extends js.Object

object TransformStatusType {
  @scala.inline
  def NOT_READY: typingsSlinky.awsSdk.awsSdkStrings.NOT_READY = "NOT_READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_READY]
  @scala.inline
  def READY: typingsSlinky.awsSdk.awsSdkStrings.READY = "READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  implicit def apply(value: String): TransformStatusType = value.asInstanceOf[TransformStatusType]
}

