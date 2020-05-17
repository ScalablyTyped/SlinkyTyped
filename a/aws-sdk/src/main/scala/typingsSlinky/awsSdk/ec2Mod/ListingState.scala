package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.available__
  - typingsSlinky.awsSdk.awsSdkStrings.sold
  - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
  - typingsSlinky.awsSdk.awsSdkStrings.pending__
  - java.lang.String
*/
trait ListingState extends js.Object

object ListingState {
  @scala.inline
  def available__ : typingsSlinky.awsSdk.awsSdkStrings.available__ = "available".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.available__]
  @scala.inline
  def sold: typingsSlinky.awsSdk.awsSdkStrings.sold = "sold".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.sold]
  @scala.inline
  def cancelled__ : typingsSlinky.awsSdk.awsSdkStrings.cancelled__ = "cancelled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.cancelled__]
  @scala.inline
  def pending__ : typingsSlinky.awsSdk.awsSdkStrings.pending__ = "pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.pending__]
  @scala.inline
  implicit def apply(value: java.lang.String): ListingState = value.asInstanceOf[ListingState]
}

