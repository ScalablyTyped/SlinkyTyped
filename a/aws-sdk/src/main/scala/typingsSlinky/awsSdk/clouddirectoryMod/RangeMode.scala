package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FIRST
  - typingsSlinky.awsSdk.awsSdkStrings.LAST
  - typingsSlinky.awsSdk.awsSdkStrings.LAST_BEFORE_MISSING_VALUES
  - typingsSlinky.awsSdk.awsSdkStrings.INCLUSIVE
  - typingsSlinky.awsSdk.awsSdkStrings.EXCLUSIVE
  - java.lang.String
*/
trait RangeMode extends js.Object

object RangeMode {
  @scala.inline
  def FIRST: typingsSlinky.awsSdk.awsSdkStrings.FIRST = "FIRST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FIRST]
  @scala.inline
  def LAST: typingsSlinky.awsSdk.awsSdkStrings.LAST = "LAST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LAST]
  @scala.inline
  def LAST_BEFORE_MISSING_VALUES: typingsSlinky.awsSdk.awsSdkStrings.LAST_BEFORE_MISSING_VALUES = "LAST_BEFORE_MISSING_VALUES".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LAST_BEFORE_MISSING_VALUES]
  @scala.inline
  def INCLUSIVE: typingsSlinky.awsSdk.awsSdkStrings.INCLUSIVE = "INCLUSIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INCLUSIVE]
  @scala.inline
  def EXCLUSIVE: typingsSlinky.awsSdk.awsSdkStrings.EXCLUSIVE = "EXCLUSIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXCLUSIVE]
  @scala.inline
  implicit def apply(value: String): RangeMode = value.asInstanceOf[RangeMode]
}

