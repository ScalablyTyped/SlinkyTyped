package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.GHz
  - typingsSlinky.awsSdk.awsSdkStrings.MHz
  - typingsSlinky.awsSdk.awsSdkStrings.kHz
  - java.lang.String
*/
trait FrequencyUnits extends js.Object

object FrequencyUnits {
  @scala.inline
  def GHz: typingsSlinky.awsSdk.awsSdkStrings.GHz = "GHz".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GHz]
  @scala.inline
  def MHz: typingsSlinky.awsSdk.awsSdkStrings.MHz = "MHz".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MHz]
  @scala.inline
  def kHz: typingsSlinky.awsSdk.awsSdkStrings.kHz = "kHz".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.kHz]
  @scala.inline
  implicit def apply(value: java.lang.String): FrequencyUnits = value.asInstanceOf[FrequencyUnits]
}

