package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.POSITIVE
  - typingsSlinky.awsSdk.awsSdkStrings.NEGATIVE
  - typingsSlinky.awsSdk.awsSdkStrings.NEUTRAL
  - typingsSlinky.awsSdk.awsSdkStrings.MIXED
  - java.lang.String
*/
trait SentimentType extends js.Object

object SentimentType {
  @scala.inline
  def POSITIVE: typingsSlinky.awsSdk.awsSdkStrings.POSITIVE = "POSITIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.POSITIVE]
  @scala.inline
  def NEGATIVE: typingsSlinky.awsSdk.awsSdkStrings.NEGATIVE = "NEGATIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NEGATIVE]
  @scala.inline
  def NEUTRAL: typingsSlinky.awsSdk.awsSdkStrings.NEUTRAL = "NEUTRAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NEUTRAL]
  @scala.inline
  def MIXED: typingsSlinky.awsSdk.awsSdkStrings.MIXED = "MIXED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MIXED]
  @scala.inline
  implicit def apply(value: java.lang.String): SentimentType = value.asInstanceOf[SentimentType]
}

