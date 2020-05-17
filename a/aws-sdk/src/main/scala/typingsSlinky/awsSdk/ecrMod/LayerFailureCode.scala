package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.InvalidLayerDigest
  - typingsSlinky.awsSdk.awsSdkStrings.MissingLayerDigest
  - java.lang.String
*/
trait LayerFailureCode extends js.Object

object LayerFailureCode {
  @scala.inline
  def InvalidLayerDigest: typingsSlinky.awsSdk.awsSdkStrings.InvalidLayerDigest = "InvalidLayerDigest".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InvalidLayerDigest]
  @scala.inline
  def MissingLayerDigest: typingsSlinky.awsSdk.awsSdkStrings.MissingLayerDigest = "MissingLayerDigest".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MissingLayerDigest]
  @scala.inline
  implicit def apply(value: String): LayerFailureCode = value.asInstanceOf[LayerFailureCode]
}

