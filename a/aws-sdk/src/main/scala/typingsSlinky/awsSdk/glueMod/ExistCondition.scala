package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MUST_EXIST
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_EXIST
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
trait ExistCondition extends js.Object

object ExistCondition {
  @scala.inline
  def MUST_EXIST: typingsSlinky.awsSdk.awsSdkStrings.MUST_EXIST = "MUST_EXIST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MUST_EXIST]
  @scala.inline
  def NOT_EXIST: typingsSlinky.awsSdk.awsSdkStrings.NOT_EXIST = "NOT_EXIST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_EXIST]
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  implicit def apply(value: String): ExistCondition = value.asInstanceOf[ExistCondition]
}

