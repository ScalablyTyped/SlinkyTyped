package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - typingsSlinky.awsSdk.awsSdkStrings.EVENT
  - typingsSlinky.awsSdk.awsSdkStrings.VOD
  - java.lang.String
*/
trait PlaylistType extends js.Object

object PlaylistType {
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  def EVENT: typingsSlinky.awsSdk.awsSdkStrings.EVENT = "EVENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EVENT]
  @scala.inline
  def VOD: typingsSlinky.awsSdk.awsSdkStrings.VOD = "VOD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VOD]
  @scala.inline
  implicit def apply(value: String): PlaylistType = value.asInstanceOf[PlaylistType]
}

