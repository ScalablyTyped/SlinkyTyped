package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AllUpfront
  - typingsSlinky.awsSdk.awsSdkStrings.PartialUpfront
  - typingsSlinky.awsSdk.awsSdkStrings.NoUpfront
  - java.lang.String
*/
trait PaymentOption extends js.Object

object PaymentOption {
  @scala.inline
  def AllUpfront: typingsSlinky.awsSdk.awsSdkStrings.AllUpfront = "AllUpfront".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AllUpfront]
  @scala.inline
  def PartialUpfront: typingsSlinky.awsSdk.awsSdkStrings.PartialUpfront = "PartialUpfront".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PartialUpfront]
  @scala.inline
  def NoUpfront: typingsSlinky.awsSdk.awsSdkStrings.NoUpfront = "NoUpfront".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NoUpfront]
  @scala.inline
  implicit def apply(value: java.lang.String): PaymentOption = value.asInstanceOf[PaymentOption]
}

