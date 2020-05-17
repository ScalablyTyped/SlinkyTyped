package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.default_
  - typingsSlinky.awsSdk.awsSdkStrings.mongodb_cr
  - typingsSlinky.awsSdk.awsSdkStrings.scram_sha_1
  - java.lang.String
*/
trait AuthMechanismValue extends js.Object

object AuthMechanismValue {
  @scala.inline
  def default_ : typingsSlinky.awsSdk.awsSdkStrings.default_ = "default".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.default_]
  @scala.inline
  def mongodb_cr: typingsSlinky.awsSdk.awsSdkStrings.mongodb_cr = "mongodb_cr".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.mongodb_cr]
  @scala.inline
  def scram_sha_1: typingsSlinky.awsSdk.awsSdkStrings.scram_sha_1 = "scram_sha_1".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.scram_sha_1]
  @scala.inline
  implicit def apply(value: java.lang.String): AuthMechanismValue = value.asInstanceOf[AuthMechanismValue]
}

