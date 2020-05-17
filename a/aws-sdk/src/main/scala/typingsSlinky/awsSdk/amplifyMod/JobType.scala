package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.RELEASE
  - typingsSlinky.awsSdk.awsSdkStrings.RETRY
  - typingsSlinky.awsSdk.awsSdkStrings.MANUAL
  - typingsSlinky.awsSdk.awsSdkStrings.WEB_HOOK
  - java.lang.String
*/
trait JobType extends js.Object

object JobType {
  @scala.inline
  def RELEASE: typingsSlinky.awsSdk.awsSdkStrings.RELEASE = "RELEASE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RELEASE]
  @scala.inline
  def RETRY: typingsSlinky.awsSdk.awsSdkStrings.RETRY = "RETRY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RETRY]
  @scala.inline
  def MANUAL: typingsSlinky.awsSdk.awsSdkStrings.MANUAL = "MANUAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MANUAL]
  @scala.inline
  def WEB_HOOK: typingsSlinky.awsSdk.awsSdkStrings.WEB_HOOK = "WEB_HOOK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WEB_HOOK]
  @scala.inline
  implicit def apply(value: String): JobType = value.asInstanceOf[JobType]
}

