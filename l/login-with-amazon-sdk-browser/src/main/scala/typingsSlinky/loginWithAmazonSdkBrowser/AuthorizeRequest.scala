package typingsSlinky.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.loginWithAmazonSdkBrowser.CodeRequest
  - typingsSlinky.loginWithAmazonSdkBrowser.AccessTokenRequest
*/
trait AuthorizeRequest extends js.Object

object AuthorizeRequest {
  @scala.inline
  implicit def apply(value: AccessTokenRequest): AuthorizeRequest = value.asInstanceOf[AuthorizeRequest]
  @scala.inline
  implicit def apply(value: CodeRequest): AuthorizeRequest = value.asInstanceOf[AuthorizeRequest]
}

