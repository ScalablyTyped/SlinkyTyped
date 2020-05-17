package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Internet_
  - typingsSlinky.awsSdk.awsSdkStrings.VPC
  - java.lang.String
*/
trait NetworkOrigin extends js.Object

object NetworkOrigin {
  @scala.inline
  def Internet_ : typingsSlinky.awsSdk.awsSdkStrings.Internet_ = "Internet".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Internet_]
  @scala.inline
  def VPC: typingsSlinky.awsSdk.awsSdkStrings.VPC = "VPC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VPC]
  @scala.inline
  implicit def apply(value: String): NetworkOrigin = value.asInstanceOf[NetworkOrigin]
}

