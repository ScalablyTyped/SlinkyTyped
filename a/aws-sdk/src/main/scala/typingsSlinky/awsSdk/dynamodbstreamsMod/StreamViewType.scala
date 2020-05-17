package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NEW_IMAGE
  - typingsSlinky.awsSdk.awsSdkStrings.OLD_IMAGE
  - typingsSlinky.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
  - typingsSlinky.awsSdk.awsSdkStrings.KEYS_ONLY
  - java.lang.String
*/
trait StreamViewType extends js.Object

object StreamViewType {
  @scala.inline
  def NEW_IMAGE: typingsSlinky.awsSdk.awsSdkStrings.NEW_IMAGE = "NEW_IMAGE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NEW_IMAGE]
  @scala.inline
  def OLD_IMAGE: typingsSlinky.awsSdk.awsSdkStrings.OLD_IMAGE = "OLD_IMAGE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OLD_IMAGE]
  @scala.inline
  def NEW_AND_OLD_IMAGES: typingsSlinky.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES]
  @scala.inline
  def KEYS_ONLY: typingsSlinky.awsSdk.awsSdkStrings.KEYS_ONLY = "KEYS_ONLY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.KEYS_ONLY]
  @scala.inline
  implicit def apply(value: java.lang.String): StreamViewType = value.asInstanceOf[StreamViewType]
}

