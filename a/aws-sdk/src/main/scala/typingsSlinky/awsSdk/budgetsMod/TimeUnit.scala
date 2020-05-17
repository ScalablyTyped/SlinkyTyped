package typingsSlinky.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DAILY
  - typingsSlinky.awsSdk.awsSdkStrings.MONTHLY
  - typingsSlinky.awsSdk.awsSdkStrings.QUARTERLY
  - typingsSlinky.awsSdk.awsSdkStrings.ANNUALLY
  - java.lang.String
*/
trait TimeUnit extends js.Object

object TimeUnit {
  @scala.inline
  def DAILY: typingsSlinky.awsSdk.awsSdkStrings.DAILY = "DAILY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DAILY]
  @scala.inline
  def MONTHLY: typingsSlinky.awsSdk.awsSdkStrings.MONTHLY = "MONTHLY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MONTHLY]
  @scala.inline
  def QUARTERLY: typingsSlinky.awsSdk.awsSdkStrings.QUARTERLY = "QUARTERLY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.QUARTERLY]
  @scala.inline
  def ANNUALLY: typingsSlinky.awsSdk.awsSdkStrings.ANNUALLY = "ANNUALLY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ANNUALLY]
  @scala.inline
  implicit def apply(value: String): TimeUnit = value.asInstanceOf[TimeUnit]
}

