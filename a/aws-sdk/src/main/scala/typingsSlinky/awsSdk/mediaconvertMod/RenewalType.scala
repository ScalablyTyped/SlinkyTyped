package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AUTO_RENEW
  - typingsSlinky.awsSdk.awsSdkStrings.EXPIRE
  - java.lang.String
*/
trait RenewalType extends js.Object

object RenewalType {
  @scala.inline
  def AUTO_RENEW: typingsSlinky.awsSdk.awsSdkStrings.AUTO_RENEW = "AUTO_RENEW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AUTO_RENEW]
  @scala.inline
  def EXPIRE: typingsSlinky.awsSdk.awsSdkStrings.EXPIRE = "EXPIRE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPIRE]
  @scala.inline
  implicit def apply(value: String): RenewalType = value.asInstanceOf[RenewalType]
}

