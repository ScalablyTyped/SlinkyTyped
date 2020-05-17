package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED
  - typingsSlinky.awsSdk.awsSdkStrings.READY
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait BuildStatus extends js.Object

object BuildStatus {
  @scala.inline
  def INITIALIZED: typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED = "INITIALIZED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INITIALIZED]
  @scala.inline
  def READY: typingsSlinky.awsSdk.awsSdkStrings.READY = "READY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.READY]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: String): BuildStatus = value.asInstanceOf[BuildStatus]
}

