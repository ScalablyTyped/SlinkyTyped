package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
  - typingsSlinky.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY
  - typingsSlinky.awsSdk.awsSdkStrings.GLACIER
  - typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA
  - typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA
  - typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING
  - typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE
  - java.lang.String
*/
trait ObjectStorageClass extends js.Object

object ObjectStorageClass {
  @scala.inline
  def STANDARD: typingsSlinky.awsSdk.awsSdkStrings.STANDARD = "STANDARD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STANDARD]
  @scala.inline
  def REDUCED_REDUNDANCY: typingsSlinky.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REDUCED_REDUNDANCY]
  @scala.inline
  def GLACIER: typingsSlinky.awsSdk.awsSdkStrings.GLACIER = "GLACIER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GLACIER]
  @scala.inline
  def STANDARD_IA: typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA = "STANDARD_IA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STANDARD_IA]
  @scala.inline
  def ONEZONE_IA: typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA = "ONEZONE_IA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ONEZONE_IA]
  @scala.inline
  def INTELLIGENT_TIERING: typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INTELLIGENT_TIERING]
  @scala.inline
  def DEEP_ARCHIVE: typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEEP_ARCHIVE]
  @scala.inline
  implicit def apply(value: String): ObjectStorageClass = value.asInstanceOf[ObjectStorageClass]
}

