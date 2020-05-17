package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IGNORE
  - typingsSlinky.awsSdk.awsSdkStrings.RESOLVED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def IGNORE: typingsSlinky.awsSdk.awsSdkStrings.IGNORE = "IGNORE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IGNORE]
  @scala.inline
  def RESOLVED: typingsSlinky.awsSdk.awsSdkStrings.RESOLVED = "RESOLVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESOLVED]
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  implicit def apply(value: String): Status = value.asInstanceOf[Status]
}

