package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.blacklist
  - typingsSlinky.awsSdk.awsSdkStrings.whitelist
  - typingsSlinky.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
trait GeoRestrictionType extends js.Object

object GeoRestrictionType {
  @scala.inline
  def blacklist: typingsSlinky.awsSdk.awsSdkStrings.blacklist = "blacklist".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.blacklist]
  @scala.inline
  def whitelist: typingsSlinky.awsSdk.awsSdkStrings.whitelist = "whitelist".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.whitelist]
  @scala.inline
  def none__ : typingsSlinky.awsSdk.awsSdkStrings.none__ = "none".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.none__]
  @scala.inline
  implicit def apply(value: String): GeoRestrictionType = value.asInstanceOf[GeoRestrictionType]
}

