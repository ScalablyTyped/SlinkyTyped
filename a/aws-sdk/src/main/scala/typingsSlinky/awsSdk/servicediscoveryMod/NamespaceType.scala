package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DNS_PUBLIC
  - typingsSlinky.awsSdk.awsSdkStrings.DNS_PRIVATE
  - typingsSlinky.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
trait NamespaceType extends js.Object

object NamespaceType {
  @scala.inline
  def DNS_PUBLIC: typingsSlinky.awsSdk.awsSdkStrings.DNS_PUBLIC = "DNS_PUBLIC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DNS_PUBLIC]
  @scala.inline
  def DNS_PRIVATE: typingsSlinky.awsSdk.awsSdkStrings.DNS_PRIVATE = "DNS_PRIVATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DNS_PRIVATE]
  @scala.inline
  def HTTP: typingsSlinky.awsSdk.awsSdkStrings.HTTP = "HTTP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTP]
  @scala.inline
  implicit def apply(value: String): NamespaceType = value.asInstanceOf[NamespaceType]
}

