package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ALLOW
  - typingsSlinky.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
trait ReadAccessType extends js.Object

object ReadAccessType {
  @scala.inline
  def ALLOW: typingsSlinky.awsSdk.awsSdkStrings.ALLOW = "ALLOW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALLOW]
  @scala.inline
  def DENY: typingsSlinky.awsSdk.awsSdkStrings.DENY = "DENY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DENY]
  @scala.inline
  implicit def apply(value: java.lang.String): ReadAccessType = value.asInstanceOf[ReadAccessType]
}

