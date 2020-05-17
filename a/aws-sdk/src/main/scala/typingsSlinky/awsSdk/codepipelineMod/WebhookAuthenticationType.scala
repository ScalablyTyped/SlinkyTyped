package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.GITHUB_HMAC
  - typingsSlinky.awsSdk.awsSdkStrings.IP
  - typingsSlinky.awsSdk.awsSdkStrings.UNAUTHENTICATED
  - java.lang.String
*/
trait WebhookAuthenticationType extends js.Object

object WebhookAuthenticationType {
  @scala.inline
  def GITHUB_HMAC: typingsSlinky.awsSdk.awsSdkStrings.GITHUB_HMAC = "GITHUB_HMAC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GITHUB_HMAC]
  @scala.inline
  def IP: typingsSlinky.awsSdk.awsSdkStrings.IP = "IP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IP]
  @scala.inline
  def UNAUTHENTICATED: typingsSlinky.awsSdk.awsSdkStrings.UNAUTHENTICATED = "UNAUTHENTICATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNAUTHENTICATED]
  @scala.inline
  implicit def apply(value: java.lang.String): WebhookAuthenticationType = value.asInstanceOf[WebhookAuthenticationType]
}

