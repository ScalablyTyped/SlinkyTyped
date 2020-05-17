package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NOOP
  - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE
  - java.lang.String
*/
trait FilterAction extends js.Object

object FilterAction {
  @scala.inline
  def NOOP: typingsSlinky.awsSdk.awsSdkStrings.NOOP = "NOOP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOOP]
  @scala.inline
  def ARCHIVE: typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE = "ARCHIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE]
  @scala.inline
  implicit def apply(value: java.lang.String): FilterAction = value.asInstanceOf[FilterAction]
}

