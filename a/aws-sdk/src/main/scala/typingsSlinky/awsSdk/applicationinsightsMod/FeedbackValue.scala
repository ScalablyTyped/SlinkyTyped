package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_SPECIFIED
  - typingsSlinky.awsSdk.awsSdkStrings.USEFUL
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_USEFUL
  - java.lang.String
*/
trait FeedbackValue extends js.Object

object FeedbackValue {
  @scala.inline
  def NOT_SPECIFIED: typingsSlinky.awsSdk.awsSdkStrings.NOT_SPECIFIED = "NOT_SPECIFIED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_SPECIFIED]
  @scala.inline
  def USEFUL: typingsSlinky.awsSdk.awsSdkStrings.USEFUL = "USEFUL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.USEFUL]
  @scala.inline
  def NOT_USEFUL: typingsSlinky.awsSdk.awsSdkStrings.NOT_USEFUL = "NOT_USEFUL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_USEFUL]
  @scala.inline
  implicit def apply(value: String): FeedbackValue = value.asInstanceOf[FeedbackValue]
}

