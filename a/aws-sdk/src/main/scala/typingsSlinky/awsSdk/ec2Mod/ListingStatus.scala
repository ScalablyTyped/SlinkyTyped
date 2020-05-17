package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.active__
  - typingsSlinky.awsSdk.awsSdkStrings.pending__
  - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
  - typingsSlinky.awsSdk.awsSdkStrings.closed_
  - java.lang.String
*/
trait ListingStatus extends js.Object

object ListingStatus {
  @scala.inline
  def active__ : typingsSlinky.awsSdk.awsSdkStrings.active__ = "active".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.active__]
  @scala.inline
  def pending__ : typingsSlinky.awsSdk.awsSdkStrings.pending__ = "pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.pending__]
  @scala.inline
  def cancelled__ : typingsSlinky.awsSdk.awsSdkStrings.cancelled__ = "cancelled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.cancelled__]
  @scala.inline
  def closed_ : typingsSlinky.awsSdk.awsSdkStrings.closed_ = "closed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.closed_]
  @scala.inline
  implicit def apply(value: java.lang.String): ListingStatus = value.asInstanceOf[ListingStatus]
}

