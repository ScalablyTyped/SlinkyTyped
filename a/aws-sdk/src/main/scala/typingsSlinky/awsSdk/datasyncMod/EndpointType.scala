package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PUBLIC
  - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE_LINK
  - typingsSlinky.awsSdk.awsSdkStrings.FIPS
  - java.lang.String
*/
trait EndpointType extends js.Object

object EndpointType {
  @scala.inline
  def PUBLIC: typingsSlinky.awsSdk.awsSdkStrings.PUBLIC = "PUBLIC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PUBLIC]
  @scala.inline
  def PRIVATE_LINK: typingsSlinky.awsSdk.awsSdkStrings.PRIVATE_LINK = "PRIVATE_LINK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRIVATE_LINK]
  @scala.inline
  def FIPS: typingsSlinky.awsSdk.awsSdkStrings.FIPS = "FIPS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FIPS]
  @scala.inline
  implicit def apply(value: String): EndpointType = value.asInstanceOf[EndpointType]
}

