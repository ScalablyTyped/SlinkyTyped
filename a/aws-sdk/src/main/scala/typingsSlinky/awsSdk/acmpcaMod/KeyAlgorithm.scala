package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.RSA_2048
  - typingsSlinky.awsSdk.awsSdkStrings.RSA_4096
  - typingsSlinky.awsSdk.awsSdkStrings.EC_prime256v1
  - typingsSlinky.awsSdk.awsSdkStrings.EC_secp384r1
  - java.lang.String
*/
trait KeyAlgorithm extends js.Object

object KeyAlgorithm {
  @scala.inline
  def RSA_2048: typingsSlinky.awsSdk.awsSdkStrings.RSA_2048 = "RSA_2048".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RSA_2048]
  @scala.inline
  def RSA_4096: typingsSlinky.awsSdk.awsSdkStrings.RSA_4096 = "RSA_4096".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RSA_4096]
  @scala.inline
  def EC_prime256v1: typingsSlinky.awsSdk.awsSdkStrings.EC_prime256v1 = "EC_prime256v1".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EC_prime256v1]
  @scala.inline
  def EC_secp384r1: typingsSlinky.awsSdk.awsSdkStrings.EC_secp384r1 = "EC_secp384r1".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EC_secp384r1]
  @scala.inline
  implicit def apply(value: java.lang.String): KeyAlgorithm = value.asInstanceOf[KeyAlgorithm]
}

