package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.hvm
  - typingsSlinky.awsSdk.awsSdkStrings.paravirtual
  - java.lang.String
*/
trait VirtualizationType extends js.Object

object VirtualizationType {
  @scala.inline
  def hvm: typingsSlinky.awsSdk.awsSdkStrings.hvm = "hvm".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.hvm]
  @scala.inline
  def paravirtual: typingsSlinky.awsSdk.awsSdkStrings.paravirtual = "paravirtual".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.paravirtual]
  @scala.inline
  implicit def apply(value: java.lang.String): VirtualizationType = value.asInstanceOf[VirtualizationType]
}

