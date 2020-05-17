package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FULL_REQUEST_CACHING
  - typingsSlinky.awsSdk.awsSdkStrings.PER_RESOLVER_CACHING
  - java.lang.String
*/
trait ApiCachingBehavior extends js.Object

object ApiCachingBehavior {
  @scala.inline
  def FULL_REQUEST_CACHING: typingsSlinky.awsSdk.awsSdkStrings.FULL_REQUEST_CACHING = "FULL_REQUEST_CACHING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FULL_REQUEST_CACHING]
  @scala.inline
  def PER_RESOLVER_CACHING: typingsSlinky.awsSdk.awsSdkStrings.PER_RESOLVER_CACHING = "PER_RESOLVER_CACHING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PER_RESOLVER_CACHING]
  @scala.inline
  implicit def apply(value: java.lang.String): ApiCachingBehavior = value.asInstanceOf[ApiCachingBehavior]
}

