package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
  - typingsSlinky.awsSdk.awsSdkStrings.AGENT
  - java.lang.String
*/
trait QueueType extends js.Object

object QueueType {
  @scala.inline
  def STANDARD: typingsSlinky.awsSdk.awsSdkStrings.STANDARD = "STANDARD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STANDARD]
  @scala.inline
  def AGENT: typingsSlinky.awsSdk.awsSdkStrings.AGENT = "AGENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AGENT]
  @scala.inline
  implicit def apply(value: String): QueueType = value.asInstanceOf[QueueType]
}

