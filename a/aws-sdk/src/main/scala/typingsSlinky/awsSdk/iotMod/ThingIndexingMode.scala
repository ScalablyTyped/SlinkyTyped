package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OFF
  - typingsSlinky.awsSdk.awsSdkStrings.REGISTRY
  - typingsSlinky.awsSdk.awsSdkStrings.REGISTRY_AND_SHADOW
  - java.lang.String
*/
trait ThingIndexingMode extends js.Object

object ThingIndexingMode {
  @scala.inline
  def OFF: typingsSlinky.awsSdk.awsSdkStrings.OFF = "OFF".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OFF]
  @scala.inline
  def REGISTRY: typingsSlinky.awsSdk.awsSdkStrings.REGISTRY = "REGISTRY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGISTRY]
  @scala.inline
  def REGISTRY_AND_SHADOW: typingsSlinky.awsSdk.awsSdkStrings.REGISTRY_AND_SHADOW = "REGISTRY_AND_SHADOW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGISTRY_AND_SHADOW]
  @scala.inline
  implicit def apply(value: java.lang.String): ThingIndexingMode = value.asInstanceOf[ThingIndexingMode]
}

