package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EXACTLY
  - typingsSlinky.awsSdk.awsSdkStrings.STARTS_WITH
  - typingsSlinky.awsSdk.awsSdkStrings.ENDS_WITH
  - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS
  - typingsSlinky.awsSdk.awsSdkStrings.CONTAINS_WORD
  - java.lang.String
*/
trait PositionalConstraint extends js.Object

object PositionalConstraint {
  @scala.inline
  def EXACTLY: typingsSlinky.awsSdk.awsSdkStrings.EXACTLY = "EXACTLY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXACTLY]
  @scala.inline
  def STARTS_WITH: typingsSlinky.awsSdk.awsSdkStrings.STARTS_WITH = "STARTS_WITH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STARTS_WITH]
  @scala.inline
  def ENDS_WITH: typingsSlinky.awsSdk.awsSdkStrings.ENDS_WITH = "ENDS_WITH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENDS_WITH]
  @scala.inline
  def CONTAINS: typingsSlinky.awsSdk.awsSdkStrings.CONTAINS = "CONTAINS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONTAINS]
  @scala.inline
  def CONTAINS_WORD: typingsSlinky.awsSdk.awsSdkStrings.CONTAINS_WORD = "CONTAINS_WORD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONTAINS_WORD]
  @scala.inline
  implicit def apply(value: String): PositionalConstraint = value.asInstanceOf[PositionalConstraint]
}

