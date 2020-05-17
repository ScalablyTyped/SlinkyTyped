package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AWS_KMS
  - typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL
  - typingsSlinky.awsSdk.awsSdkStrings.AWS_CLOUDHSM
  - java.lang.String
*/
trait OriginType extends js.Object

object OriginType {
  @scala.inline
  def AWS_KMS: typingsSlinky.awsSdk.awsSdkStrings.AWS_KMS = "AWS_KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWS_KMS]
  @scala.inline
  def EXTERNAL: typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL = "EXTERNAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXTERNAL]
  @scala.inline
  def AWS_CLOUDHSM: typingsSlinky.awsSdk.awsSdkStrings.AWS_CLOUDHSM = "AWS_CLOUDHSM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AWS_CLOUDHSM]
  @scala.inline
  implicit def apply(value: String): OriginType = value.asInstanceOf[OriginType]
}

