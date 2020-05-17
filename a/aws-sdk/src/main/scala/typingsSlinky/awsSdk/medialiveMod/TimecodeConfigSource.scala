package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EMBEDDED
  - typingsSlinky.awsSdk.awsSdkStrings.SYSTEMCLOCK
  - typingsSlinky.awsSdk.awsSdkStrings.ZEROBASED
  - java.lang.String
*/
trait TimecodeConfigSource extends js.Object

object TimecodeConfigSource {
  @scala.inline
  def EMBEDDED: typingsSlinky.awsSdk.awsSdkStrings.EMBEDDED = "EMBEDDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EMBEDDED]
  @scala.inline
  def SYSTEMCLOCK: typingsSlinky.awsSdk.awsSdkStrings.SYSTEMCLOCK = "SYSTEMCLOCK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SYSTEMCLOCK]
  @scala.inline
  def ZEROBASED: typingsSlinky.awsSdk.awsSdkStrings.ZEROBASED = "ZEROBASED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ZEROBASED]
  @scala.inline
  implicit def apply(value: String): TimecodeConfigSource = value.asInstanceOf[TimecodeConfigSource]
}

