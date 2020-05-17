package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.InvalidImageDigest
  - typingsSlinky.awsSdk.awsSdkStrings.InvalidImageTag
  - typingsSlinky.awsSdk.awsSdkStrings.ImageTagDoesNotMatchDigest
  - typingsSlinky.awsSdk.awsSdkStrings.ImageNotFound
  - typingsSlinky.awsSdk.awsSdkStrings.MissingDigestAndTag
  - java.lang.String
*/
trait ImageFailureCode extends js.Object

object ImageFailureCode {
  @scala.inline
  def InvalidImageDigest: typingsSlinky.awsSdk.awsSdkStrings.InvalidImageDigest = "InvalidImageDigest".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InvalidImageDigest]
  @scala.inline
  def InvalidImageTag: typingsSlinky.awsSdk.awsSdkStrings.InvalidImageTag = "InvalidImageTag".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InvalidImageTag]
  @scala.inline
  def ImageTagDoesNotMatchDigest: typingsSlinky.awsSdk.awsSdkStrings.ImageTagDoesNotMatchDigest = "ImageTagDoesNotMatchDigest".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ImageTagDoesNotMatchDigest]
  @scala.inline
  def ImageNotFound: typingsSlinky.awsSdk.awsSdkStrings.ImageNotFound = "ImageNotFound".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ImageNotFound]
  @scala.inline
  def MissingDigestAndTag: typingsSlinky.awsSdk.awsSdkStrings.MissingDigestAndTag = "MissingDigestAndTag".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MissingDigestAndTag]
  @scala.inline
  implicit def apply(value: String): ImageFailureCode = value.asInstanceOf[ImageFailureCode]
}

