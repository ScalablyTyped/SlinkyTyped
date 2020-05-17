package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CRAWLER
  - typingsSlinky.awsSdk.awsSdkStrings.JOB
  - typingsSlinky.awsSdk.awsSdkStrings.TRIGGER
  - java.lang.String
*/
trait NodeType extends js.Object

object NodeType {
  @scala.inline
  def CRAWLER: typingsSlinky.awsSdk.awsSdkStrings.CRAWLER = "CRAWLER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CRAWLER]
  @scala.inline
  def JOB: typingsSlinky.awsSdk.awsSdkStrings.JOB = "JOB".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.JOB]
  @scala.inline
  def TRIGGER: typingsSlinky.awsSdk.awsSdkStrings.TRIGGER = "TRIGGER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRIGGER]
  @scala.inline
  implicit def apply(value: String): NodeType = value.asInstanceOf[NodeType]
}

