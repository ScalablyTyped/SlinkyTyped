package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.passed_
  - typingsSlinky.awsSdk.awsSdkStrings.failed__
  - typingsSlinky.awsSdk.awsSdkStrings.`insufficient-data`
  - typingsSlinky.awsSdk.awsSdkStrings.initializing__
  - java.lang.String
*/
trait StatusType extends js.Object

object StatusType {
  @scala.inline
  def passed_ : typingsSlinky.awsSdk.awsSdkStrings.passed_ = "passed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.passed_]
  @scala.inline
  def failed__ : typingsSlinky.awsSdk.awsSdkStrings.failed__ = "failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.failed__]
  @scala.inline
  def `insufficient-data`: typingsSlinky.awsSdk.awsSdkStrings.`insufficient-data` = "insufficient-data".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`insufficient-data`]
  @scala.inline
  def initializing__ : typingsSlinky.awsSdk.awsSdkStrings.initializing__ = "initializing".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.initializing__]
  @scala.inline
  implicit def apply(value: java.lang.String): StatusType = value.asInstanceOf[StatusType]
}

